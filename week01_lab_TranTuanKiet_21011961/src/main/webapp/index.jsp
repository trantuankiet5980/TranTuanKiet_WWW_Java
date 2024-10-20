<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">

    <c:if test="${error} != null">
        <div class='alert alert-danger' role='alert'>${error}</div>
    </c:if>

    <c:if test="${message} != null">
        <div class='alert alert-success' role='alert'>${message}</div>
    </c:if>
    <form action="control" method="post" style="width: 50%; margin: auto;">
        <input type="hidden" value="login" name="action">
        <div class="mb-3">
            <label for="accountId" class="form-label">Username</label>
            <input type="text" class="form-control" name="accountId" id="accountId" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" name="password" class="form-control" id="password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>

</body>
</html>