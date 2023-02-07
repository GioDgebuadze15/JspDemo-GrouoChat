<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg d-flex justify-content-center" style="background-color: rgb(231, 240, 246)">
    <c:if test="${requestScope.title != null}">
        <h1>${requestScope.title}</h1>
    </c:if>
</nav>
