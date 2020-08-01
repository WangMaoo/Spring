package com.wmq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月31日 22:08:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "son")
public class SonMapping {

    @GetMapping
    public ModelAndView get() {
        return new ModelAndView("hello")
                .addObject("hello", "GET");
    }

    @PostMapping
    public ModelAndView post() {
        return new ModelAndView("hello")
                .addObject("hello", "POST");
    }

    @PutMapping
    public ModelAndView put() {
        return new ModelAndView("hello")
                .addObject("hello", "PUT");
    }

    @DeleteMapping
    public ModelAndView delete() {
        return new ModelAndView("hello")
                .addObject("hello", "DELETE");
    }

    @PatchMapping
    public ModelAndView patch() {
        return new ModelAndView("hello")
                .addObject("hello", "PATCH");
    }




}
