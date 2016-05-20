<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page session="false"%>

<table id="person_table" class="table default_table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>E-mail</th>
		</tr>
	</thead>
		<tr>
			<td><a href="${context}/users/${person.id}">${person.id }</a></td>
			<td><a href="${context}/users/name/${person.name}">${person.name }</a></td>
			<td><a href="${context}/users/name/${person.email}">${person.email }</a></td>
		</tr>

</table>