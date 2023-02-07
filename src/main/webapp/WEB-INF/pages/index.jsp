<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>
    <jsp:attribute name="head">
      <title>Welcome</title>
    </jsp:attribute>
  <jsp:attribute name="scripts"></jsp:attribute>
  <jsp:body>
      <div class="w-50 mt-5 mx-auto">
          <jsp:include page="/WEB-INF/components/registration-component.jsp"/>
      </div>
  </jsp:body>
</t:layout>