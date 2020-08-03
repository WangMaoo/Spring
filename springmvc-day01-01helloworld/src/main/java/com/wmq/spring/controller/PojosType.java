package com.wmq.spring.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 08:15:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "pojo-type")
public class PojosType {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @RequestMapping(value = "to-pojos")
    public ModelAndView toPojo() {
        return new ModelAndView("/pojos-type");
    }

    @RequestMapping(value = "do-pojos" )
    public ModelAndView doPojo( Customer customer) {
        return new ModelAndView("/pojos-type").addObject("customer", customer);
    }
}
