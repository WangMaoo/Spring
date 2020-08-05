package com.wmq.ssm.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 19:52:00
 * @Description: TODO
 */
//@ControllerAdvice
/**
 * 为所有的Controller加上异常
 */
public class BaseException {

    @ExceptionHandler
    public String ExceptionHandle(HttpServletRequest request, Exception ex, Model model) {
        ProjectException projectException = null;
        if (ex instanceof ProjectException) {
            projectException = (ProjectException) ex;
        } else {
            projectException = new ProjectException("系统异常", "-1");
        }
        model.addAttribute("message", projectException.getMessage());
        model.addAttribute("code", projectException.getCode());
        return "error";
    }
}
