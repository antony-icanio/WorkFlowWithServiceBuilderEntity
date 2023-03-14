<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.mvcServiceBuilder.service.TimeSheetLocalServiceUtil" %>
<%@ page import="com.mvcServiceBuilder.model.TimeSheet" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowTask" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowTaskManagerUtil" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ include file="init.jsp" %>
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

	DynamicQuery dynamicQuery = TimeSheetLocalServiceUtil.dynamicQuery();

	if(!keyword.isEmpty() ) {
		dynamicQuery.add(RestrictionsFactoryUtil.ilike("jobName","%"+keyword+"%"));
	}

	dynamicQuery.addOrder(OrderFactoryUtil.asc("jobName"));

	int totalCount = TimeSheetLocalServiceUtil.dynamicQuery(dynamicQuery).size() ;
	List<TimeSheet> timeSheetList = TimeSheetLocalServiceUtil.dynamicQuery(dynamicQuery,from,to);
%>





<%
	List<WorkflowTask> workflowTasks = WorkflowTaskManagerUtil.
			getWorkflowTasksByUser(user.getCompanyId(),user.getUserId(),false,-1,-1,null);
%>

<liferay-portlet:renderURL varImpl="iteratorURLl" >
	<portlet:param name="mvcPath" value="/view.jsp" />
</liferay-portlet:renderURL >

<liferay-ui:search-container emptyResultsMessage="There are no items" delta='<%= delta %>'
							 total = '<%= totalCount %>' iteratorURL="<%= iteratorURLl %>" >

	<liferay-ui:search-container-results results = '<%= workflowTasks %>' />

	<liferay-ui:search-container-row cssClass="tableRowCss" className="com.liferay.portal.kernel.workflow.WorkflowTask"
									 keyProperty="workflowTaskId" modelVar="workflowTask" escapedModel="<%= true %>" >

		<liferay-ui:search-container-column-text name="User Name" property="userName" />

		<liferay-ui:search-container-column-text name="Type" property="type" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator markupView="lexicon" />
</liferay-ui:search-container>




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

			<liferay-ui:search-container-column-text name="Job Name" property="jobName" />

			<liferay-ui:search-container-column-text name="Description" property="description" />

			<liferay-ui:search-container-column-text name="Submited By" property="userName" />

			<%  if(timeSheet.getUserId() != timeSheet.getStatusByUserId() ) { %>

				<liferay-ui:search-container-column-text name="Approved By" property="statusByUserName" />

			<%  } else { %>

			<liferay-ui:search-container-column-text name="Approved By" value="" />

			<%  }  %>

			<liferay-ui:search-container-column-status property="status" name="Status" />

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