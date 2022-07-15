<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>书籍展示</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #4158D0;
background-image: linear-gradient(43deg, #4158D0 0%, #C850C0 46%, #FFCC70 100%);
">
    <div  class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍显示</small>
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddbook">新增书籍</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allbook">查询所有书籍</a>
                </div>
                <div class="col-md-4 column">
                   <%--查询--%>
                       <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBook" method="post">
                           <span style="color: green;font-weight: bold">${error}</span>
                           <input type="text" name="queryBookName" class="form-control" placeholder="请输入查询内容">
                           <input type="submit" value="查询" class="btn btn-primary">
                       </form>
                </div>
            </div>
        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍价格</th>
                            <th>书籍数量</th>
                            <th>操作</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="book" items="${list}">
                            <tr>
                                <td>${book.id}</td>
                                <td>${book.name}</td>
                                <td>${book.price}</td>
                                <td>${book.number}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/book/toUpdate?id=${book.id}">修改</a>
                                    &nbsp; | &nbsp;
                                    <a href="${pageContext.request.contextPath}/book/deletebook/${book.id}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
