<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.mvcServiceBuilder.service.TimeSheetLocalServiceUtil" %>
<%@ page import="com.mvcServiceBuilder.model.TimeSheet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/header.css"/>

<portlet:defineObjects />

<%
	String keyword = ParamUtil.getString(renderRequest,"keyword");
	Integer delta = ParamUtil.getInteger(renderRequest,"delta");
	Integer cur = ParamUtil.getInteger(renderRequest,"cur");

	int to = cur * delta ;
	int from = to - delta ;

	if(to == 0) {
		from = 0 ;
		to = 10 ;
	}
	if(delta == 0) {
		delta = 10 ;
	}

	long organizationId = user.getOrganizationIds() [0];

	DynamicQuery dynamicQuery = TimeSheetLocalServiceUtil.dynamicQuery();

//	Criterion criterion = RestrictionsFactoryUtil.eq("organizationId",organizationId);
//	dynamicQuery.add(criterion);

	if(!keyword.isEmpty() ) {
		dynamicQuery.add(RestrictionsFactoryUtil.ilike("name","%"+keyword+"%"));
	}

	dynamicQuery.addOrder(OrderFactoryUtil.asc("name"));

	int totalCount = TimeSheetLocalServiceUtil.dynamicQuery(dynamicQuery).size() ;
	List<TimeSheet> timeSheetList = TimeSheetLocalServiceUtil.dynamicQuery(dynamicQuery,from,to);
%>

<div class="outerbox" >

	<div class="topContainer mb-1" >

		<div style="margin-left: 0px;width: 300px" >

			<portlet:renderURL var="searchURL" >
				<portlet:param name="mvcPath" value="/view.jsp" />
			</portlet:renderURL>

			<aui:form method="post" name="searchForm" action="${searchURL}" >
				<aui:input name="keyword" label="" type="text" placeholder="Search" />
			</aui:form>

		</div>

		<div style="margin-right: 0px;width: 150px;" >

			<portlet:renderURL var="addTimeSheetURL" >
				<portlet:param name="mvcPath" value="/timeSheetForm.jsp" />
				<portlet:param name="delta" value="<%= delta.toString() %>" />
				<portlet:param name="cur" value="<%= cur.toString() %>" />
			</portlet:renderURL>

			<a href = '${addTimeSheetURL}' class="btn  btn-primary btn-default" > Add TimeSheet </a>

		</div>

	</div>

	<liferay-portlet:renderURL varImpl="iteratorURL" >
		<portlet:param name="keyword" value="<%= keyword %>" />
		<portlet:param name="mvcPath" value="/view.jsp" />
	</liferay-portlet:renderURL >

	<liferay-ui:search-container emptyResultsMessage="There are no items" delta='<%= delta %>'
								 total = '<%= totalCount %>' iteratorURL="<%= iteratorURL %>" >

		<liferay-ui:search-container-results results = '<%= timeSheetList %>' />

		<liferay-ui:search-container-row cssClass="tableRowCss" className="com.mvcServiceBuilder.model.TimeSheet"
										 keyProperty="timeSheetId" modelVar="timeSheet" escapedModel="<%= true %>" >

			<liferay-ui:search-container-column-text property="jobName" name="Job Name" />
			<liferay-ui:search-container-column-text property="description" name="Description" />

<%--			<liferay-ui:search-container-column-text name="Edit" >--%>

<%--				<portlet:renderURL var="editRoleURL" >--%>
<%--					<portlet:param name="mvcPath" value="/roleForm.jsp" />--%>
<%--					<portlet:param name="delta" value="<%= delta.toString() %>" />--%>
<%--					<portlet:param name="cur" value="<%= cur.toString() %>" />--%>
<%--					<portlet:param name="roleId" value="${role.roleId}" />--%>
<%--				</portlet:renderURL>--%>

<%--				<a href="${editRoleURL}" >--%>
<%--					<img width="18px" src="<%=request.getContextPath()%>/icons/icons8-pencil-64.png" alt="edit-icon" >--%>
<%--				</a>--%>

<%--			</liferay-ui:search-container-column-text>--%>

			<liferay-ui:search-container-column-status property="status" name="Status" />

			<liferay-ui:search-container-column-text name="Delete" >

				<portlet:actionURL var="deleteTimeSheetURL" name="deleteTimeSheet" >
					<portlet:param name="timeSheetId" value="${timeSheet.timeSheetId}" />
					<portlet:param name="delta" value="<%= delta.toString() %>" />
					<portlet:param name="cur" value="<%= cur.toString() %>" />
				</portlet:actionURL>

				<a href="${deleteTimeSheetURL}" onclick="return confirm('Are you sure you want to delete this Time Sheet ?');">
					<img width="18px" src="<%=request.getContextPath()%>/icons/trash-icon.png" alt="delete-icon" />
				</a>

			</liferay-ui:search-container-column-text>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator markupView="lexicon" />
	</liferay-ui:search-container>

</div>