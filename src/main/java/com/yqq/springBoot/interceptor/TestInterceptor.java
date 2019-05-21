package com.yqq.springBoot.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class TestInterceptor implements HandlerInterceptor {

     public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         Map map = (Map) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

         System.out.println("preHandle执行："+map);

        return true;
    }

    // postHandle方法是在当前请求进行处理之后，也就是Controller方法调用结束之后执行，但是它会在DispatcherServlet进行视图渲染之前被调用。所以可以在这个方法中可以对Controller处理之后的ModelAndView对象进行操作
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }


    //该方法会在整个请求结束之后，也就是在DispatcherServlet渲染了对应的视图之后执行，这个方法的主要作用是用于资源清理工作。
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }

}
