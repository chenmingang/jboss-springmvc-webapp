<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书签</title>
</head>
<body>
	<form:form commandName="bookMarks" method="post">
		名称:<form:input path="name"/>
		url:<form:input path="url"/>
		<input type="submit" value="添加"/>
	</form:form>
	<br />
	<table>
		<thead>
			<tr>
				<th>index</th>
				<th>name</th>
				<th>url</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookMarksList}" var="_i">
				<tr>
					<td>${_i.index}</td>
					<td>${_i.name}</td>
					<td>${_i.url}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>