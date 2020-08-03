package com.wmq.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 20:28:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "string-type")
public class StringTypeController {

    @RequestMapping(value = "string-return")
    public String defaultMethod(Model model) {
        model.addAttribute("content", "Good Boy");
        return "succeed";
    }

    @RequestMapping(value = "forward")
    public String forward() {
        return "forward:/void-type/response-flag";
    }

    @RequestMapping(value = "redirect")
    public String redirect() {
        return "redirect:https://www.baidu.com";
    }
}
