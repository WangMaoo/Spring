package com.wmq.spring.service;

import com.wmq.spring.pojo.FileObject;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 21:37:00
 * @Description: TODO
 */

public interface FileObjectService {

    public FileObject upLoad(MultipartFile multipartFile, Integer businessId, String businessType);
}
