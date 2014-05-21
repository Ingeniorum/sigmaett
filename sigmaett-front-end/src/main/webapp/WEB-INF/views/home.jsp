<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
	function crunchifyAjax() {
		$.ajax({
			url : 'ajaxtest',
			type : 'POST',
			data : {
				field1 : $("#firstname").val(),
				field2 : "hello2"
			},
			success : function(data) {
				$('#result').html(data);
			}
		});
	}

	$(document).ready(function() {
		$("#boton").click(function() {
			crunchifyAjax();
		});
	});
</script>

<html>
<head>

<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<input type="text" id="firstname" name="firstname" />
	<button id="boton">Get External Content</button>

	<div id="result" align="center">Nothing yet!</div>
</body>
</html>
