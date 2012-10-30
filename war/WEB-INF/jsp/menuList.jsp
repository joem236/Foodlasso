<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title><fmt:message key="menuTitle"/></title></head>
  <body>
	<div>
	<h1 class="menu-manager">Menu Manager</h1>
	<ul>
	  <li class="btn btn-medium-green"><a href="javascript: addMenu();">+ Create Menu</a></li>
	  <li class="btn btn-medium-white" style="position: relative"><a href="javascript: showImportMenu();">Import / Export</a></li>
	</ul>
	<div id="project-export-underway" style="padding-top: 5px; clear: both; display: none;">
		<div class="message"><p>Copy goes here.</p></div>
	</div>
	<div style='clear:both;'></div>
	<ul id="active_menu_rows" class="manage edit_links with_header">
	  <li class="header_link"><a href=""></a></li>
		  <c:forEach items="${model.menus}" var="menu">
		     <li>
			  <table class="link_with_action" onmouseover="this.style.backgroundColor='#deeaff'" onmouseout="this.style.backgroundColor='#fff'">
			    <tr>
			      <td class="button" width="50">
			        <div class="btn_container">
			          <span class="btn btn-small-white"><a href="javascript: showFlatEdit(${menu.id}, ${menu.childMenuId});">Edit</a></span>
			        </div>
			      </td>
			      <td>
			        <a href="" class="link with_action">
			          ${menu.name}
			          <div class="meta_info">${menu.menuStatus}</div>
			        </a>
			      </td>
			      <td class="button" width="220">
			        <div class="floatr btn_container">
			          <span class="btn btn-small-white"><a class="cancel" href="javascript: editMenu(${menu.id})">Properties</a></span>
			          <span class="btn btn-small-white"><a class="cancel" href="javascript: showFlatView(${menu.id}, ${menu.childMenuId});">Preview Menu</a></span>          
			          <span class="btn btn-small-white"><a href="javascript: deleteMenu(${menu.id});" class="cancel">Delete</a></span>
			        </div>
			      </td>
			    </tr>
			  </table>
			  </li>
		  </c:forEach>
	</ul>
	</div>

</html>
