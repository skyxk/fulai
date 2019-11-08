package com.fulai.mushroom.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @author ：chen
 * @date ：Created in 2019/11/8 16:51
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {       //请求进入这个拦截器
        HttpSession session = request.getSession();

        //获取请求的URL
        String url = request.getRequestURI();
        if(url.contains("admin")){
            if(session.getAttribute("user") == null){       //判断session中有没有user信息
                if("XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))){
                    response.sendError(401);
                }
                response.sendRedirect("/fulai/login.html");     //没有user信息的话进行路由重定向
                return false;
            }
        }
        return true;        //有的话就继续操作
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}