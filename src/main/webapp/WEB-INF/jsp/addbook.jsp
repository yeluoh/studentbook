<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #16A085;
background-image: linear-gradient(132deg, #16A085 21%, #F4D03F 90%);
">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addbook" method="post">
        <div>
            <label for="id">书籍编号</label>
            <input type="text" name="id" class="form-control" id="id" required >
        </div>
        <div>
            <label for="name">书籍名称</label>
            <input type="text" name="name" class="form-control" id="name" required>
        </div>
        <div>
            <label for="price">书籍价格</label>
            <input type="text" name="price" class="form-control" id="price" required>
        </div>
        <div>
            <label for="number">书籍数量</label>
            <input type="text" name="number" class="form-control" id="number" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>



</div>
</body>
</html>
