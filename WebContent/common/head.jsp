<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/jquery.form.js" ></script>
	
	