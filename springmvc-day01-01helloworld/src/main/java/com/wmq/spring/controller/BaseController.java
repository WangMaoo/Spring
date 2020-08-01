package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月31日 21:25:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "basic")
public class BaseController {

    @RequestMapping
    public ModelAndView def() {
        return new ModelAndView("default")
                .addObject("hei", "默认");
    }

    @RequestMapping("other")
    public ModelAndView other() {
        return new ModelAndView("Other")
                .addObject("other", "其他页面");
    }

}
