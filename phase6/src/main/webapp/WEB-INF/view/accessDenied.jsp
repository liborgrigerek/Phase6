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
				<p>Access page denied.</p>
			</div>
		</div>
	</section>
	<section>
        <div class="container">
                <p>You are not authorized to access this page.</p>
                <a href="<spring:url value="/login?error"></spring:url>"
                    class="btn btn-info btn-md">Back</a>
        </div>
	</section>
</body>
</html>
