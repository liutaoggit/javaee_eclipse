/*
 * 文件名：RequestServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package b_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        String method = req.getMethod();
        String queryString = req.getQueryString();
        int contentLength = req.getContentLength();
        StringBuffer requestURI = req.getRequestURL();
        String contextPath = req.getContextPath();
        System.out.println(method+"|"+queryString+"|"+contentLength+"|"+requestURI+"|"+contextPath);
        String remoteAddr = req.getRemoteAddr();
        resp.getWriter().write("IP地址为:"+remoteAddr);
    }
}
