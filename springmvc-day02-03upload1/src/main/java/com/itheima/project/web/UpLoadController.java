package com.itheima.project.web;

import com.itheima.project.pojo.Customer;
import com.itheima.project.pojo.FileObject;
import com.itheima.project.service.FileObjectService;
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
 * @Description：上传图片
 */
@Controller
@RequestMapping("up-load")
public class UpLoadController {

    @Autowired
    FileObjectService fileObjectService;

    public static String CUSTOMER_FILE = "customer_file";

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(dateFormat, true));
    }

    /**
     * @Description 跳转页面
     */
    @RequestMapping(value = "to-add")
    public String toAdd(){
        return "customer-add";
    }

    /**
     * @Description 添加用户
     * @param
     * @return
     */
    @RequestMapping(value = "add")
    public String add(Customer customer, MultipartFile file, Model model){
        Integer custId =1;
        customer.setCustId(custId);
        System.out.println("customer对象保存成功"+customer.toString());
        FileObject fileObject = null;
        customer.setFileObject(fileObject);
        model.addAttribute("customer", customer);
        model.addAttribute("website", "http://127.0.0.1/file-service/");
        return "customer-list";
    }
}
