<%@ tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@ attribute name="head" fragment="true" %>
<%@ attribute name="scripts" fragment="true" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/shared/head.jsp" />
        <jsp:invoke fragment="head"/>
        <title>Group Chat</title>
    </head>
  <body>
    <jsp:include page="/WEB-INF/shared/header.jsp" />

    <jsp:doBody/>

    <jsp:include page="/WEB-INF/shared/footer.jsp" />
    <script src="${pageContext.request.contextPath}/lib/bootstrap/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/lib/font-awesome-icons/js/all.js"></script>
    <jsp:invoke fragment="scripts"/>
  </body>
</html>