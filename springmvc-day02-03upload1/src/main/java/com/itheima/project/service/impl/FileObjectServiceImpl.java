package com.itheima.project.service.impl;

import com.itheima.project.pojo.FileObject;
import com.itheima.project.service.FileObjectService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * @Description：图片上传实现类
 */
@Service("fileObjectService")
public class FileObjectServiceImpl implements FileObjectService {

    @Override
    public FileObject upLoad(MultipartFile multipartFile,
                             Integer businessId,
                             String businessType) {
        //判定上传的文件是否为空
        if (multipartFile!=null&&businessId!=null&&businessType!=null){
            FileObject fileObject = new FileObject();
            //建立业务和附件直接的关系
            fileObject.setBusinessId(businessId);
            fileObject.setBusinessType(businessType);
            String originalFilename = multipartFile.getOriginalFilename();
            //构建新文件名称
            String fileName = UUID.randomUUID().toString();
            fileObject.setFileName(fileName);
            //构建后缀名
            String suffix=originalFilename.substring(originalFilename.lastIndexOf("."));
            fileObject.setSuffix(suffix);
            //构建访问路径：重写文件名
            String pathUrl = businessType+"/"+fileName+suffix;
            fileObject.setPathUrl(pathUrl);
            //按照业务去创建对应的文件夹
            File file = new File("D:/file-service/"+businessType);
            if(!file.exists()){
                file.mkdir();
            }
            //构建上传对象去上传
            file = new File("D:/file-service/"+pathUrl);
            try {
                multipartFile.transferTo(file);
                fileObject.setCreateTime(new Date());
                return fileObject;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
            //创建时间
        }
        return null;
    }
}
