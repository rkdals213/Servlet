<%@page import="com.ssafy.hello.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.ssafy.hello.ProductDTO" %>
<%
ProductDTO dto = (ProductDTO)request.getAttribute("products");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<h1>상품이 저장되었습니다</h1>
	<table class="table table-active">
	    <tbody>
	      <tr>
	        <td>제품 이름 : <%= dto.getProductName() %></td>
	      </tr>
	      <tr>	      
	        <td>제품 가격 : <%= dto.getProductPrice() %></td>
	      </tr>
	      <tr>
	        <td>제품 설명 : <%= dto.getProductDiscription() %></td>
	      </tr>
	    </tbody>
	  </table>
</body>
</html>