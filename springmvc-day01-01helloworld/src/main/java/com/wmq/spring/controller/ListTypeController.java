package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 09:14:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "list-type")
public class ListTypeController {

    @RequestMapping(value = "to-list-type")
    public ModelAndView toListType(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list-type");
        return modelAndView;
    }

    @RequestMapping(value = "do-list-type")
    public ModelAndView doListType(CustomerListVo customerListVo){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customerListVo", customerListVo.toString());
        modelAndView.setViewName("list-type");
        return modelAndView;
    }

}
