<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
	<head>
		<script src="scripts/jquery.js"></script>
	</head>
	<body>
		<button id="ajax">ajax call</button>
		<button id="json">json</button>
		
		<script type="text/javascript">
		    $('#json').click(function(){ 
		        alert('json');
		         $.getJSON("http://localhost:8080/FDL/companies",
		         function(data) {
		            alert(data);         
		          });   
		    });
		
		    $('#ajax').click(function(){ 
		        alert('ajax');
		         $.ajax({ 
		             type: "GET",
		             dataType: "json",
		             url: "http://localhost:8080/FDL/companies",
		             success: function(data){        
		                alert(data);
		             }
		         });
		    });
		
		</script>
	</body>
</html>