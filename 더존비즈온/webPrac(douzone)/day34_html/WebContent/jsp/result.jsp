<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ex03_form</title>
    </head>
    <body>
        <!--get 전송방식: 글자수 제한 있음(255), 보안에 약한 편.-->
        <% 
          String id= request.getParameter("id");
          String pwd = request.getParameter("pwd");
          out.print(id+" "+pwd);        
        %>
        <% 
          String q= request.getParameter("query");
          if(q == null){
        	  out.print("검색어 없음.");
          } else{
        	  out.print(q);      
          }
            
        %>
        
    </body>

</html>



<%-- --%>