<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/include/header.jsp" %>



<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>Категория</th>
        <th>&nbsp;</th>
    </tr>
    </thead>
    <tbody>
    <div class="container">
        <c:forEach items="${categories}" var="category" varStatus="status" >
            <tr>
                <td scope="row">${status.index + 1}</td>
                <th><a href="/category/${category.id}" class="active">${category.name}</a></th>
            </tr>
        </c:forEach>
    </div>
    </tbody>
</table>

</body>
</html>
<%@include file="/WEB-INF/jsp/include/footer.jsp" %>