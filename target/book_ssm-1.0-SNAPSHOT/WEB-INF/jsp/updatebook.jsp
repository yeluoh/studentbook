<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body style="background-color: #21D4FD;
background-image: linear-gradient(19deg, #21D4FD 0%, #B721FF 100%);
">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updatebook" method="post">
        <%--前端传递隐藏域--%>
        <input type="hidden" name="id" value="${QBook.id}">
        书籍名称:<input type="text" name="name" value="${QBook.name}" required>
        书籍价格:<input type="text" name="price" value="${QBook.price}" required>
        书籍数量:<input type="text" name="number" value="${QBook.number}" required>
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>
