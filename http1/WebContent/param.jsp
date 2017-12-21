<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/http1/ParamServlet?p1=x1&p2=x2&p=1&p=2&p=Zhangsan">ParamServlet</a>
	<form action="/http1/ParamServlet" method="post">
		参数1：<input type="text" name="p1"><br>
		参数2：<input type="text" name="p2"><br>
		<input type="submit" value="提交" ><br>
	</form>
</body>
</html>