<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<link href="<c:url value="/resources/css/registration.css" />" rel="stylesheet">


<!-- FORM OF REGISTRATION -->
<form action="${context}/registration/saveUser" method="post">
<h1>Name</h1>
<input  class="form-control"type="name" name="name"/>
<h1>E-mail</h1>
<input class="form-control" type="email" name="email">
<h1>Password</h1>
<input class="form-control" type="password" name="password">
<h1 >Role</h1>
<select name="role" size="6" multiple >
<option disabled>Chose your role</option>
<option value="ROLE_ADMIN">King of WEB</option>
<option value="ROLE_USER">King's bitch</option>
<option value="ROLE_NOTHING">ROLE_NOTHING</option>
<option value="ROLE_NOTHING">ROLE_NOTHING</option>
<option value="ROLE_NOTHING">ROLE_NOTHING</option>

</select>
<button class="btn btn-success " type="submit">OK</button>
</form>