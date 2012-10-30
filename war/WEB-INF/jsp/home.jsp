<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
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
							  <select>
  								<option value="Select">--Select--</option>
  								<option value="Cheaps Eats">Cheaps Eats</option>
 								<option value="Bar Scene">Bar Scene</option>
 								<option value="Happy Hour">Happy Hour</option>
							  </select>
							</div>
							
						</div>
						
       	 		</div><!-- close meshead -->
				
				
				<div id="searchResults"><p class="locationResults">Boston Restaurants</p></div>
				
				
				<div id="Wrapper-content" class="clearfix">
				
				
				
					<div id="leftColumn">
					
						<div id="cuisineTitle"></div>
						
						  <div id="cuisineSelections">
							<ul class="cuisines">
							<li><a href="index.htm">Afghan</a></li>
							<li><a href="offerings.htm">African</a></li>
							<li><a href="support.htm"> American (New)</a></li>
							<li><a href="login.htm">American (Traditional)</a></li>
							<li><a href="index.htm">Asian</a></li>
							<li><a href="offerings.htm">Australian</a></li>
							<li><a href="support.htm">Austrian</a></li>
							<li><a href="login.htm">Bagels</a></li>
							<li><a href="index.htm">Bar Food</a></li>
							<li><a href="offerings.htm">Barbecue</a></li>
		    		 	   </ul>
						 </div>
						 
						 <div class="notMember">
						 <a href="#"><img src="images/not-a-member.png" height="198" width="188" alt="not a memeber yet?" /></a>
						 </div>
						 
					</div><!-- close leftColumn -->
				
				
				
					<div id="ContentBody">
						<div id="mapModule">
							<div id="pettabs" class="indentmenu">
								<ul>
								 <li><a href="#" rel="dog1" class="selected">Local Area Map</a></li>
								 <li><a href="#" rel="dog2">Tab 2</a></li>
								 <li><a href="#" rel="dog3">Tab 3</a></li>
								 <li><a href="#" rel="dog4">Tab 4</a></li>
								</ul>
								<br style="clear: left" />
							</div>

							<div id="tabContainer">
								<div id="dog1" class="tabcontent">
								<img src="images/map.png" width="519" height="204" alt="map" />
								</div>

								<div id="dog2" class="tabcontent">
								
								</div>

								<div id="dog3" class="tabcontent">
								 
								</div>

								<div id="dog4" class="tabcontent">
								
								</div>
							</div>

							<script type="text/javascript">
							var mypets=new ddtabcontent("pettabs")
							mypets.setpersist(true)
							mypets.setselectedClassTarget("link")
							mypets.init(1)
							</script>

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
							 <li>
							 	<table class="places" summary="RestaurantName" cellpadding="0" cellspacing="0">
									 <tr>
									   <td class="name"><a href="#">Ino Steak House</a> 21 Bedford St | At 24th Ave</td>
									   <td class="rating">11</td>
									   <td class="price">11</td>
									   <td class="reviews">18</td>
									 </tr>	
								</table>
							 </li>
							 
							 <li class="odd">
							 	<table class="places" summary="RestaurantName" cellpadding="0" cellspacing="0">
									<thead>
									 <tr>
									   <td class="name"><a href="#">Pizzariea</a> 21 Bedford St | At 24th Ave</td>
									   <td class="rating">11</td>
									   <td class="price">11</td>
									   <td class="reviews">18</td>
									 </tr>	
									</thead>
								</table>
							 </li>
							 
							 <li>
							 	<table class="places" summary="RestaurantName" cellpadding="0" cellspacing="0">
									<thead>
									 <tr>
									   <td class="name"><a href="#">Ino Steak House</a> 21 Bedford St | At 24th Ave</td>
									   <td class="rating">11</td>
									   <td class="price">11</td>
									   <td class="reviews">18</td>
									 </tr>	
									</thead>
								</table>
								
								<div class="contactNumber">
									<p><span class="blueColor">Phone:</span> 978-977-6523  | <a href="#">Visit Website</a><br /><br />
									 <span class="blueColor"><a href="#">Print Menu</a><span class="blueColor">
									</p>
								</div>
						
						 		<div id="tabHolder">	
									<div id="menuFeatures" class="menuTabs">
									<ul>
									  <li><a href="#" rel="dog1" class="selected">Menu</a></li>
									  <li><a href="#" rel="dog2">Review</a></li>
									  <li><a href="#" rel="dog3">Map</a></li>
									  <li class="addFavorites"><a href="#"><img src="images/addFavorites.png" width="148" 		 										height="33" /></a>
									  </li>
									</ul>
									<br style="clear: left" />
								</div>
								
								<div class="orderOnline">
									<p><a href="#"><img src="images/orderOnline.png" width="145" height="21" alt="Order Online" /></a></p>
								</div>
								
								<div id="tabs">
									<div id="foodMenu" class="tabcontent">
									  <table summary="Menu" cellpadding="0" cellspacing="0">
									   <thead>
									    <tr class="oddRow">
									      <td class="foodtitle"><p>Pizza</p></td>
									      <td>Small</td>
									      <td>Large</td>
									    </tr>
									   </thead>
									   
									   <tbody>
										<tr>
									      <td class="itemColumn">Cheese Pizza </td>
									      <td class="small">$6.99</td>
									      <td class="large">$9.99</td>
									    </tr>
										
										<tr class="oddRow">
									      <td class="itemColumn">Pepperoni Pizza </td>
									      <td class="small">$7.99</td>
									      <td class="large">$10.99</td>
									    </tr>
										
										<tr>
									      <td class="itemColumn">Bacon Pizza </td>
									      <td class="small">$7.99</td>
									      <td class="large">$11.99</td>
									    </tr>	
									   </tbody>
								      </table>
									</div>

									<div id="dog2" class="tabcontent">
									
									</div>

									<div id="dog3" class="tabcontent">
								 
									</div>

									<div id="dog4" class="tabcontent">
								
									</div>
								</div>

								<script type="text/javascript">
								var mypets=new ddtabcontent("menuFeatures")
								mypets.setpersist(true)
								mypets.setselectedClassTarget("link")
								mypets.init(1)
								</script>
						 	 </div>
						</li>
							   
							 <li class="odd">
							 	<table class="places" summary="RestaurantName" cellpadding="0" cellspacing="0">
									<thead>
									 <tr>
									   <td class="name"><a href="#">Pizzariea</a> 21 Bedford St | At 24th Ave</td>
									   <td class="rating">11</td>
									   <td class="price">11</td>
									   <td class="reviews">18</td>
									 </tr>	
									</thead>
								</table>
							 </li>
							 
							  <li>
							 	<table class="places" summary="RestaurantName" cellpadding="0" cellspacing="0">
									<thead>
									 <tr>
									   <td class="name"><a href="#">Ino Steak House</a> 21 Bedford St | At 24th Ave</td>
									   <td class="rating">11</td>
									   <td class="price">11</td>
									   <td class="reviews">18</td>
									 </tr>	
									</thead>
								</table>
							 </li>
							</ul>
						</div>
						
						
					</div><!-- close ContentBody -->
				
					<div id="rightColumn">
						
						<div id="recommendedTitle"></div>
						
						  <div id="recommendedPlaces">
							<ul class="recommended">
							<li><a href="index.htm">Afghan</a></li>
							<li><a href="offerings.htm">African</a></li>
							<li><a href="support.htm"> American (New)</a></li>
							<li><a href="login.htm">American (Traditional)</a></li>
							<li><a href="index.htm">Asian</a></li>
							<li><a href="offerings.htm">Australian</a></li>
							<li><a href="support.htm">Austrian</a></li>
							<li><a href="login.htm">Bagels</a></li>
							<li><a href="index.htm">Bar Food</a></li>
							<li><a href="offerings.htm">Barbecue</a></li>
		    		 	   </ul>
						 </div>
						 
						 <div class="foodAd">
						 <a href="#"><img src="images/foodAd.png" height="148" width="188" alt="not a memeber yet?" /></a>
						 </div>
						 
					</div><!-- close rightColumn -->
					
            	</div><!-- close Wrapper-content -->
			
         		<div id="footer">      
                	<p>&copy; Copyright 2009, FoodLasso. All Rights Reserved.</p>         
                    <div id="subNav">
                    	<ul id="footerLinks">
             				<li><a href="index.htm">Home &nbsp;<span>|</span></a></li>
                			<li><a href="offerings.htm">Offerings &nbsp;<span>|</span></a></li>
                			<li><a href="support.htm">Support &nbsp;<span>|</span></a></li>
							<li><a href="login.htm">Login</a></li>
              			</ul>
                        <p>Valid <a href="">Xhtml</a> and <a href="">CSS</a></p>
                    </div>
                </div><!-- close footer -->
				
        </div><!-- close Wrapper --> 

</body>
</html>