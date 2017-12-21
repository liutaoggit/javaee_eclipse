/*
 * 文件名：AServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package a_servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        ServletContext servletContext = this.getServletContext();
        System.out.println("doGet-------"+servletContext.getInitParameter("context1"));
          
        //ServletContext获取文件的绝对路径
        String realPath = servletContext.getRealPath("/a.txt");
        String realPath2 = servletContext.getRealPath("/WEB-INF/web.xml");
        System.out.println("realPath:"+realPath);
        System.out.println("realPath2:"+realPath2);
        
        //ServletContext获取资源流
        InputStream resourceAsStream = servletContext.getResourceAsStream("/WEB-INF/web.x");
//        BufferedReader reader=new BufferedReader(new InputStreamReader(resourceAsStream));
//        String line=null;
//        while((line=reader.readLine())!=null)
//        {
//            System.out.println(line);
//        }
//        byte bs[]=null;
//        int read = resourceAsStream.read(bs, 0, resourceAsStream.available());
//        String string=new String(bs);
//        System.out.println(string);
        
        //ServletContext获取指定目录下的所有路径
        Set<String> resourcePaths = servletContext.getResourcePaths("/");
        System.out.println(resourcePaths);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
        // TODO Auto-generated method stub
        System.out.println("doPost-------");
    }
    @Override
    public void init()
        throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("server start init");
        System.out.println(this.getServletConfig());
        }
}
