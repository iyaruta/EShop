<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/include/header.jsp" %>



<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>Роздел</th>
        <th>&nbsp;</th>
    </tr>
    </thead>
    <tbody>
    <div class="container">
        <c:forEach items="${sections}" var="section" varStatus="status" >
            <tr>
                <td scope="row">${status.index + 1}</td>
                <th><a href="/section/${section.id}" class="active">${section.name}</a></th>
            </tr>
        </c:forEach>
    </div>
    </tbody>
</table>

</body>
</html>
<%@include file="/WEB-INF/jsp/include/footer.jsp" %>