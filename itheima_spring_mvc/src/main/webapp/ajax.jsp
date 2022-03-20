<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"czt",age:22});
        userList.push({username:"sss",age:18});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/quick14",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8",
        });

    </script>
</head>
<body>
    <h1>ajax</h1>
</body>
</html>
