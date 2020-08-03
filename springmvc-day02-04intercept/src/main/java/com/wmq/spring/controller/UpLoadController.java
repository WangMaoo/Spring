package com.wmq.spring.controller;

import com.wmq.spring.exception.BaseException;
import com.wmq.spring.exception.ProjectException;
import com.wmq.spring.pojo.Customer;
import com.wmq.spring.pojo.FileObject;
import com.wmq.spring.service.FileObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 22:16:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "up-load")
public class UpLoadController extends BaseException {

    @Autowired
    FileObjectService fileObjectService;

    public static String CUSTOMER_FILE = "customer_file";

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(simpleDateFormat, true));
    }

    /**
     * 跳转到添加页面
     */
    @RequestMapping(value = "to-add")
    public String addCustomer() {
        int i = 1/0;
        System.out.println("执行添加文件的方法");
        return "customer-add";
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "add")
    public String add(Customer customer, MultipartFile file, Model model) throws ProjectException {
        Integer custId =1;
        customer.setCustId(custId);
        //System.out.println("customer对象保存成功"+customer.toString());
        FileObject fileObject = null;
        try {
            fileObject = fileObjectService.upLoad(file, custId, CUSTOMER_FILE);
            //int i = 1/0;
        } catch (Exception e) {
            throw new ProjectException("文件上传错误", "0001");
        }
        customer.setFileObject(fileObject);
        model.addAttribute("customer", customer);
        model.addAttribute("website", "http://127.0.0.1/file-service/");
        return "customer-list";
    }

}
