package com.wmq.spring.controller;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.invoke.MethodType;
import java.lang.management.MemoryType;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 07:48:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "pojo-type")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @RequestMapping(value = "to-pojo")
    public ModelAndView toPojo() {
        return new ModelAndView("/pojo-type");
    }

    @RequestMapping(value = "do-pojo" )
    public ModelAndView doPojo(Customer customer) {
        return new ModelAndView("/pojo-type").addObject("customer", customer.toString());
    }
}
