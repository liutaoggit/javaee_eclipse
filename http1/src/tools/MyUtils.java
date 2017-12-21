/*
 * 文件名：MyUtils.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：Administrator
 * 修改时间：2017年12月21日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */

package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyUtils {
    public static String InputToString(InputStream input) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(input));
        String line=null;
        StringBuilder sb=new StringBuilder();
        while((line=reader.readLine())!=null)
        {
            sb.append(line);

                    sb.append("\n");
        }
           reader.close();
           
        return sb.toString();
    }

}
