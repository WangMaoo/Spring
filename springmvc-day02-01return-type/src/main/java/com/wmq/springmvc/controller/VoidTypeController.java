package com.wmq.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 20:10:00
 * @Description: TODO
 */
@Controller
@RequestMapping(value = "void-type")
public class VoidTypeController {

    @RequestMapping(value = "request-type")
    public void requestForward(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute("content", "I~m Fine");
            request.getRequestDispatcher("/WEB-INF/views/succeed.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "response-type")
    public void responseR(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("http://www.baidu.com");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "response-flag")
    public void responseF(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        String flag = "小王";
        try {
            response.getWriter().write(flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
