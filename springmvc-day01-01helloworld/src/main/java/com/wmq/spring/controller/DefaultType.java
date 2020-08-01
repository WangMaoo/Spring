package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 07:27:00
 * @Description: TODO
 */
@Controller
public class DefaultType {

    @RequestMapping(value = "default")
    public ModelAndView defaultType(Model model, ModelMap modelMap, HttpSession session,
                                    HttpServletRequest request, HttpServletResponse response)throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("model", "model");
        modelAndView.addObject("modelAndView", "modelAndView");
        session.setAttribute("session", "session");
        request.setAttribute("request", "request");
        modelMap.addAttribute("modelMap", "modelMap");
        modelAndView.setViewName("/default-type");
        return modelAndView;
    }
}
