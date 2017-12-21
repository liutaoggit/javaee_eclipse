/*
 * 文件名：EServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */

package a_servlet;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        // TODO Auto-generated method stub
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
//        System.out.println("EEEEEEEEEEE sendRedirect");
//        resp.sendRedirect("/http1/1.html");
//        System.out.println("forward-----");
//        req.getRequestDispatcher("/1.html").forward(req, resp);
        
        String header = req.getHeader("User-Agent");
        Enumeration<String> headerNames = req.getHeaderNames();
        int intHeader = req.getIntHeader("Upgrade-Insecure-Requests");
        System.out.println("initHeader;"+intHeader);
        System.out.println(header);
        while(headerNames.hasMoreElements())
        {
            String nextElement = headerNames.nextElement();
            System.out.println(nextElement);
        }
        
    }
}
