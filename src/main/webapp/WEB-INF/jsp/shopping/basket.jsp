<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/include/header.jsp" %>



<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>Товар</th>
        <th>Quantity</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lines}" var="line" varStatus="status" >
        <tr>
            <td scope="row">${status.index + 1}</td>
            <td><a href="/product/${line.product.id}" class="active">${line.product.name}</a></td>
            <td>${line.count}</td>
            <td><a href="/product/${line.product.id}/remove" class="active">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
<%@include file="/WEB-INF/jsp/include/footer.jsp" %>
