package com.wmq.spring.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 19:05:00
 * @Description: TODO
 */
public class ProjectExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object handler, Exception ex) {
        ProjectException projectException = null;
        if (ex instanceof ProjectException) {
            projectException = (ProjectException) ex;
        } else {
            projectException = new ProjectException("未知异常","-1");
        }
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("message",projectException.getMessage());
        modelAndView.addObject("code",projectException.getCode());
        return modelAndView;
    }
}
