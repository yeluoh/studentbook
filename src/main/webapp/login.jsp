<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>学生登录页面</title>
    <script type="text/javascript">

    </script>
    <style type="text/css">

    </style>
    <link type="text/css" rel="stylesheet" href="css/Login.css">
</head>
<body style="background-color: #85FFBD;
    background-image: linear-gradient(45deg, #85FFBD 0%, #FFFB7D 50%, #1ba530 100%);">

<div id="main">
    <section>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="into">${error}</div>
        <h2 style="color:blue;text-align:center;">
            学生书城登录
        </h2>
        <hr style="border:1px dashed">
        <div method="post">
            <label style="text-align:center;" for="name">学生姓名:</label>
            <input type="text" id="name" name="name" placeholder="请输入学生名"><br/>
            <span class="icon icon-user margin-small"></span>
            <label style="text-align:center;" for="password">学生学号:</label>
            <input type="password" id="password" name="password"  placeholder="请输入学号">
            <span class="icon icon-key margin-small"></span>
        </div>
        <div method="post">
            <input type="submit" value="登录"/>
        </div>
    </form>
    </section>
</div>
</body>
</html>
