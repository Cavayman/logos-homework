<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<meta charset="UTF-8"/>
<sec:authorize access="isAnonymous()">
	<form action="login_user" method="post">
	<div class="row">
		<div class="col-xs-6  " >
			<input type="text" class=" form-control" name="email" placeholder="email" required> 
			<input type="password" class=" form-control " name="password" placeholder="password" required>
		</div>
		</div>
		<div>
			<button class="btn btn-defoult col-xs-2" float="left" type="submit">Sign In</button>
		</div>
	</form>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<a href="<c:url value="/j_spring_security_logout"/>">Log Out</a>
</sec:authorize>
<form action="registration" method="get">
<sec:authorize access="isAnonymous()">
	<button class="reg btn btn-primary col-xs-2 "  >
		Registration
	</button>
	</form>
</sec:authorize>

 <input list="browsers" name="browser">
  <datalist id="browsers">
    <option value="Internet Explorer">
    <option value="Firefox">
    <option value="Chrome">
    <option value="Opera">
    <option value="Safari">
  </datalist>
  <input type="submit">
