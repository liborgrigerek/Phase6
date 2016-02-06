<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Morosystems phase 6</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h2>User Management Screen</h2>
				<p>Here you can list, add, edit or remove users.</p>
			</div>
		</div>
	</section>
	<section>
        <div class="container">
			<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <c:if test="${param.logout != null}">
                    <div class="alert alert-success">
                        <p>You have been logged out successfully.</p>
                    </div>
                </c:if>
				<a href="<spring:url value="/admin/"></spring:url>"
					class="btn btn-info btn-md">Manage Users</a>
            </div>
			</div>
        </div>
	</section>
</body>
</html>