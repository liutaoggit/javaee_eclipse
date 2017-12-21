/*
 * 文件名：DServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package a_servlet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tools.MyUtils;

public class DServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        //获取 源码 
        InputStream resourceAsStream = this.getClass().getResourceAsStream("/a_servlet/AAA.txt");
        BufferedReader reader=new BufferedReader(new InputStreamReader(resourceAsStream));
        String line=null;
        StringBuilder sb=new StringBuilder();
        while((line=reader.readLine())!=null)
        {
            sb.append(line);
//            sb.append("\n");
        }
//        resp.setContentType("text/html;charset=utf-8");
//        resp.getWriter().write(sb.toString());
        InputStream inputStream=new FileInputStream("D:\\javaweb视频配套资料\\JavaWeb视频教程_day10-资料源码");
        System.out.println(MyUtils.InputToString(inputStream));
    }
}
