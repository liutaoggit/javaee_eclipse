/*
 * 文件名：AServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package b_servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tools.MyUtils;

public class AServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
//        resp.setContentType("text/html;charset=utf-8");
        InputStream inputStream=new FileInputStream("D:\\javaweb视频配套资料\\JavaWeb视频教程_day10-资料源码\\作业.txt");
//        resp.getWriter().write();
        System.out.println(MyUtils.InputToString(inputStream));
        resp.getWriter().write("你好！！！！！！！");
        resp.sendError(404, "设置状态码！！！");
    }
}
