/*
 * 文件名：ParamServlet.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package b_servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
           String parameter = req.getParameter("p1");
           String parameter2 = req.getParameter("p2");
           String parameter3 = req.getParameter("p3");
//           resp.getWriter().write(parameter+"|"+parameter2+"|"+parameter3);
           String[] parameterValues = req.getParameterValues("p");
//           System.out.println(Arrays.toString(parameterValues));
           
           Map<String, String[]> parameterMap = req.getParameterMap();
           for(String key:parameterMap.keySet())
           {
               String[] strings = parameterMap.get(key);
               resp.getWriter().write(key+":"+Arrays.toString(strings));
           }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,
        IOException {
//        String parameter = req.getParameter("p1");
//        String parameter2 = req.getParameter("p2");
//        resp.getWriter().write(parameter+"|"+parameter2);
        
        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String key:parameterMap.keySet())
        {
            String[] strings = parameterMap.get(key);
            resp.getWriter().write(key+":"+Arrays.toString(strings));
        }
    }
}
