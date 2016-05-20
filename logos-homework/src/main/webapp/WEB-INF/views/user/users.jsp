<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<script src="resources/js/user.js"></script>
<table id="person_table" class="table default_table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Status</th>
			<th>Activation</th>
			
		</tr>
	</thead>

	<!-- ACTIVATION/DISACTIVATION -->
	<c:forEach items="${personList}" var="person">
		<tr>
			<td><a  href="${context}/users/${person.id}">${person.id }</a></td>
			<td><a  href="${context}/users/${person.id}">${person.name }</a></td>
			<td><h5 id="status-{person.id}">${person.activated}></h5></td>
		 	<td><a class="btn" id="act">CLICK</a>	</td>
			
		</tr>
	</c:forEach>


</table>
<form action="${context}/users/save" method="POST">
	<label>Name</label> <input name="name" type="text">
	<button type="submit">OK</button>
</form>












