<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		<title>FoodLasso Home</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="author" content="Foodlasso" />
		<link rel="stylesheet" type="text/css" href="styles/master.css" />
		<script src="javascript/Module.js" type="text/javascript"></script>
		<!--[if lte IE 6]>
		<script type="text/javascript" src="js/pngTransparency.js"></script>
		<![endif]-->
		
</head>

<body>
		<div id="Wrapper">
		
				<div id="meshead">
					<h1 class="logo"><img src="images/logo.png" width="451" height="90" alt="Foodlasso"/></h1>

            			<div id="NavContainer">
		    		  	   <ul id="navigation">
							<li><a href="index.htm" class="active">Home</a></li>
							<li><a href="offerings.htm">Offerings</a></li>
							<li><a href="support.htm">Support</a></li>
							<li><a href="login.htm">Login</a></li>
		    		 	   </ul>
		   				</div>
			<div id="searchPanel"> 
				<div class="searchInput"> 
				  <form> 
					<fieldset> 
					<input class="search_box" type="text" value="Search by area, food or restaurant" onfocus="this.value=''" name=""/> 
					<input class="search" type="submit" value=""/> 
					<div class="clear"></div> 
					</fieldset> 
				  </form> 
				</div> 
				<div class="styleBox"> 
				  <label for="featureTagSelect">Filter Style:</label> 
				</div> 
			</div> 
 		</div><!-- close meshead --> 
		<div id="searchResults"><p class="locationResults"></p></div>
		<div id="Wrapper-content" class="clearfix"> 
		<div id="leftColumn"> 
			<div id="cuisineTitle"></div> 
			<div id="cuisineSelections"> 
				<ul class="cuisines"> 
					  
	 	  		</ul> 
		  	</div> 	 
			<div class="notMember"> 
				<a href="#"><img src="images/flp/not-a-member.png" height="198" width="188" alt="not a memeber yet?" /></a> 
			</div> 	 
		</div><!-- close leftColumn --> 
		<div id="ContentBody"> 
			<div id="mapModule"> 
			<div id="pettabs" class="indentmenu"> 
				<ul> 
					<li><a href="#" rel="dog1" class="selected">Local Area Map</a></li> 
				</ul>
				<br style="clear: left" /> 
			</div>
			<div id="tabContainer"> 
				<div id="dog1" class="tabcontent"><img src="images/flp/map.png" width="519" height="204" alt="map" /></div>  
			</div>  
		</div> 
		<div id="restaurantResults"	> 
			<ul class="topHeader"> 
				<li>
					<table class="places" summary="RestaurantHeader" cellpadding="0" cellspacing="0"> 
						<thead> 
							<tr> 
								<td><p class="name">Restaurants Name</p></td> 
							   	<td class="rating"><p>Rating</p></td> 
							   	<td class="price"><p>Price</p></td> 
							   	<td class="reviews"><p>Reviews</p></td> 
							</tr>	
						</thead> 
					</table> 
				</li> 
			</ul> 
			<ul class="nameHolder">
				<c:forEach items="${model.companies}" var="company"> 
				<li class="">
					<table class="places" summary="RestaurantName" cellpadding="0" cellspacing="0"> 
						<tr>
							<td class="name"><a href="javascript:showRestaurant(${company.id}, 'menu');">${company.name}</a>${company.address}</td> 
							<td class="rating">${company.rating}</td> 
							<td class="price">${company.price}</td> 
							<td class="reviews">${company.reviews}</td> 
						</tr>	
					</table>
					<div id="restaurantDetail_${company.id}"></div> 
				</li>
				</c:forEach> 
			</ul> 
		</div> 
	</div><!-- close ContentBody --> 
	<div id="rightColumn"> 
		<div id="recommendedTitle"></div> 
			<div id="recommendedPlaces"> 
				<ul class="recommended"> 
					 
				</ul> 
			</div>
			<div class="foodAd"> 
				<a href="#"><img src="images/flp/foodAd.png" height="148" width="188" alt="not a memeber yet?" /></a> 
			</div> 
		</div><!-- close rightColumn --> 
	</div><!-- close Wrapper-content -->
</div>
</body>
</html>