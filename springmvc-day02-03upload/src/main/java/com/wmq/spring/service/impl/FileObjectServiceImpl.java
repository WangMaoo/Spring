package com.wmq.spring.service.impl;

import com.wmq.spring.pojo.FileObject;
import com.wmq.spring.service.FileObjectService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 21:42:00
 * @Description: TODO
 */
@Service
public class FileObjectServiceImpl implements FileObjectService {

    @Override
    public FileObject upLoad(MultipartFile multipartFile, Integer businessId, String businessType) {
        if (multipartFile != null && businessId != null && businessType != null) {
            FileObject fileObject = new FileObject();
            /**
             * 关联文件
             */
            fileObject.setBusinessId(businessId);
            fileObject.setBusinessType(businessType);
            /**
             * 构建新文件名称
             */
            String originalFilename = multipartFile.getOriginalFilename();
            String fileName = UUID.randomUUID().toString();
            fileObject.setFileName(fileName);
            /**
             * 获取文件的后缀名
             */
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            fileObject.setSuffix(suffix);
            /**
             *构建访问路径
             */
            String pathUrl = businessType + "/" + fileName + suffix;
            fileObject.setPathUrl(pathUrl);
            /**
             * 判断文件夹是否存在
             */
            File file = new File("D:/file-service/" + businessType);
            if (!file.exists()) {
                file.mkdir();
            }
            /**
             * 构建上传路径
             */
            file = new File("D:/file-service/" + pathUrl);
            try {
                multipartFile.transferTo(file);
                fileObject.setCreateTime(new Date());
                System.out.println("文件上传成功");
                return fileObject;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件上传失败");
                return null;
            }
        }
        return null;
    }
}
