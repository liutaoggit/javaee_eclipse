/*
 * 文件名：HelloServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月20日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package a_servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{

    @Override
    public void init(ServletConfig config)
        throws ServletException {
        
        // TODO Auto-generated method stub
        String servletName = config.getServletName();
        String initParameter = config.getInitParameter("paramName1");
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        
        while(initParameterNames.hasMoreElements())
        {
            System.out.println(initParameterNames.nextElement());
        }
        System.out.println("init---"+servletName+initParameter);
    }

    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
        throws ServletException,
        IOException {
        // TODO Auto-generated method stub
        System.out.println("service!!!!!");
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("destroy---");
    }

}
