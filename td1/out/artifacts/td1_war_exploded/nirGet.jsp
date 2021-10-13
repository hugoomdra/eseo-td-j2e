<%--
  Created by IntelliJ IDEA.
  User: hmadureira
  Date: 12/10/2021
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <c:if test="18 > 2">


            <h1>super test</h1>

        </c:if>

        <h1>Interface du NIR</h1>


        <form method="POST">

            <input type="text" name="nir">

            <button type="submit">Valider</button>
        </form>

</body>
</html>
