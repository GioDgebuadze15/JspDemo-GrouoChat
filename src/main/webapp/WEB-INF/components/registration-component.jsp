<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="card" style="background-color: #eee;">
    <div class="card-body">
        <h5 class="card-title text-center">Choose Your Nickname:</h5>
        <form method="post" action="<c:url value="/RegistrationServlet"/>">
            <div class="d-flex flex-column align-items-center">
                <label>
                    <input class="w-100 form-control " type="text" name="nickName" placeholder="Enter your nickname" required>
                    <c:if test="${requestScope.errorMessage != null}">
                        <p class="text-danger m-0">${requestScope.errorMessage}</p>
                    </c:if>
                </label>
                <button class="mt-3 btn btn-primary" type="submit">Start Chatting</button>
            </div>
        </form>
    </div>
</div>
