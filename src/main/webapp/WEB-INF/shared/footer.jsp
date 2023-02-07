<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalDate" %>
<footer class="text-center text-white fixed-bottom" style="background-color: #caced1;">
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        &COPY; ${LocalDate.now().getYear()} Copyright: <span class="fw-bold"> Java Group Chat </span>
    </div>
</footer>