<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en"> 
<head> 
<title>Foodlasso</title> 
 
<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1" /> 
<meta name="author" content="Miltom Pacheco" /> 
<meta name="description" content="" /> 
<meta name="keywords" content="" /> 
 
<!-- stylesheets --> 
	<link rel="stylesheet" href="styles/login/master.css" type="text/css" media="screen" /> 
  	<!-- PNG FIX for IE6 --> 
 
    <!--[if lte IE 6]>
	<script type="text/javascript" src="script/pngTransparency.js"></script>
    <![endif]--> 
    
    <!--[if lt IE 7]>
    <script type="text/javascript" src="script/unitpngfix.js"></script>
	<![endif]--> 
    
</head> 
 
<body> 
<div id="topWrapper"> 
 
	  <div id="header"> 
    		 <div id="NavContainer"> 
            	<ul id="accountLogin"> 
					<li class="set1"><a href="index.html">LOGIN</a></li> 
					<li class="set2"><a href="company.html">SIGN UP</a></li> 
				</ul> 
			</div><!--End Navigation --> 
	 </div><!--End header --> 
 
</div><!--End Wrapper--> 
	
<div id="mainWrapper"> 
	<div id="login"> 
    	<p class="signup">Need an Account? <a href="#">Sign-up now</a>, it take less then 30 seconds.</p>
    	<form class="form" action="/FDL/login.htm" method="POST"> 
			<fieldset>
                <p> 
				 <label for="username">Username:</label> 
				 <input name="username" id="username" type="text" value="" class="input-1" /> 
				</p> 
				<p class="marginSet"> 
				 <label for="password">Password:</label> 
				 <input name="password" id="password" type="password" class="input-2" /> 
				</p> 
                <p class="forgetpassword"><a href="#">Forgot your password?</a><br /></p> 
                
                <p><input type="submit" class="trans-btn" name="save" value="" /></p> 
            </fieldset> 
		</form> 
    </div>	
    <p>Username: ${model.testUsername}</p>
<p>Password: ${model.testPassword}</p>
</div><!-- End main-body --> 
</body> 
</html>