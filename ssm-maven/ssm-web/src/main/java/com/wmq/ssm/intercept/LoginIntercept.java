package com.wmq.ssm.intercept;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 22:44:00
 * @Description: TODO
 */
public class LoginIntercept implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object customer = request.getSession().getAttribute("customer");
        if (customer != null) {
            System.out.println("已登录");
            return true;
        }
        System.out.println("用户未登录");
        response.sendRedirect(request.getContextPath() + "/customer/to-login");
        return false;
    }
}
