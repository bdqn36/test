<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <form action="${pageContext.request.contextPath }/isDevLogin" method="post">
         <h1>APP开发者平台</h1>
         <div>
           <input type="text" class="form-control" placeholder="请输入用户名" required="" name="devCode"/>
         </div>
         <div>
           <input type="password" class="form-control" placeholder="请输入密码" required="" name="devPassword"/>
         </div>
         <div>
           <input type="submit" value="登录"/>
           <input type="reset" value="重填"/>
         </div>
         <div style="color: red">${error}</div>
         <div class="separator">

           <div>
             <p>©2019 chaoge.AllRights CopyRight</p>
           </div>
         </div>
       </form>
</body>
</html>