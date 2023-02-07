<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>
    <jsp:attribute name="head">
    </jsp:attribute>
    <jsp:attribute name="scripts"></jsp:attribute>
    <jsp:body>
        <div class="fixed-bottom" style="margin-bottom: 56px">
            <jsp:include page="/WEB-INF/components/chat-component.jsp"/>
        </div>
    </jsp:body>
</t:layout>