<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ include file="init.jsp" %>

<portlet:defineObjects />

<style>

    .cancelButton {
        background: #272833;
        color: white;
        font-weight: 600;
        padding: 9px 10px 12px;
        border-radius: 0.25rem;

    }

</style>

<%
    Integer delta = ParamUtil.getInteger(renderRequest,"delta");
    Integer cur = ParamUtil.getInteger(renderRequest,"cur");

    if(cur == 0 || delta == 0 ) {
        cur = 1 ;
        delta = 10 ;
    }

    Long timeSheetId = ParamUtil.getLong(renderRequest,"timeSheetId");
%>

<div class="formbox" >

    <h1> Time Sheets </h1>
    <br>

    <portlet:actionURL var="addTimeSheetURL" name="addTimeSheet" >
        <portlet:param name="delta" value="<%= delta.toString() %>" />
        <portlet:param name="cur" value="<%= cur.toString() %>" />
    </portlet:actionURL>

    <portlet:renderURL var="timeSheetURL">
        <portlet:param name="delta" value="<%= delta.toString() %>" />
        <portlet:param name="cur" value="<%= cur.toString() %>" />
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:form name="addCategoryForm" method="post" action="${addTimeSheetURL}" >

        <aui:input name="timeSheetId" type="hidden" value="<%= timeSheetId %>" />

        <aui:input name="jobName" type="text" required="true" label="Job Name" >
            <aui:validator name="maxLength"> 50 </aui:validator>
        </aui:input>

        <aui:input name="description" type="textarea" label="Description" >
            <aui:validator name="maxLength"> 1000 </aui:validator>
        </aui:input>

        <aui:input name="date" type="date" label="Date" >
            <aui:validator name="date" />
        </aui:input>

        <aui:input name="hour" type="time" label="Hour" />

        <aui:button type="submit" value="Save" > </aui:button>

        <a href="${timeSheetURL}" class="cancelButton" style="color: #FFFFFF" > Cancel </a>

    </aui:form>

</div>