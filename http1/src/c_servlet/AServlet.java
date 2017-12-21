/*
 * 文件名：AServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package c_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        System.out.println("AServlet");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("hello world");
        req.getRequestDispatcher("/CB").include(req, resp);
    }
}
