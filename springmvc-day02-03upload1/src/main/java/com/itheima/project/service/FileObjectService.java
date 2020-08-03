package com.itheima.project.service;

import com.itheima.project.pojo.FileObject;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description：图片服务业务
 */
public interface FileObjectService {

    /**
     * @Description
     * @param multipartFile 上传对象
     * @param businessId 业务主键
     * @param businessType 业务类型
     * @return
     */
    FileObject upLoad(MultipartFile multipartFile,
                      Integer businessId,
                      String businessType);
}
