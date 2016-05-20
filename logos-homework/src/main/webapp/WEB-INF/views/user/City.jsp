<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<link href="<c:url value="/resources/css/City.css"/>" rel="stylesheet">
<script
	src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
<script src="resources/js/user.js"></script>
<script>

	</script>
<div class="row">
<div class="col-xs-10">
        <input class="form-control" id="focusedInput" type="text" placeholder="Find users by City name hare...">
      </div>
<div class="col-xs-2">
 <button class="btn btn-primary" id="show-users" >show</button>
</div>
</div>
<table id="users_table" class="table default_table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>City</th>
			</tr>
			<tbody id="tablecont"></tbody>
		</thead>
	
	</table>
<script src="resources/js/city.js" ></script>
<!-- Trigger the modal with a button -->
<button type="button" class="btn" data-toggle="modal" data-target=""></button>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Modal Header</h4>
      </div>
      <div class="modal-body">
        <p>Some text in the modal.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
