package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 07:39:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "basic-type")
public class BasicType {

    @RequestMapping(value = "to-type")
    public ModelAndView toType() {
        return new ModelAndView("/basic-type");
    }

    @RequestMapping(value = "do-type")
    public ModelAndView doType(Integer id) {
        return new ModelAndView("/basic-type").addObject("id", id);
    }
}
