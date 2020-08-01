package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 08:58:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "array-type")
public class ArrayTypeController {

    @RequestMapping(value ="to-array-type")
    public ModelAndView toArrayType(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("array-type");
        return modelAndView;
    }

    @RequestMapping(value ="do-array-type")
    public ModelAndView doArrayType(String[] customerIds){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customerIds", Arrays.asList(customerIds).toString());
        modelAndView.setViewName("array-type");
        return modelAndView;
    }
}
