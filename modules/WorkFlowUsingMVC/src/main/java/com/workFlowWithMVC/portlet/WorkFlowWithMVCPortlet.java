package com.workFlowWithMVC.portlet;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.mvcServiceBuilder.service.TimeSheetLocalServiceUtil;
import com.workFlowWithMVC.constants.WorkFlowWithMVCPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import org.osgi.service.component.annotations.Component;

/**
 * @author hp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=WorkFlowWithMVC",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + WorkFlowWithMVCPortletKeys.WORKFLOWWITHMVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class WorkFlowWithMVCPortlet extends MVCPortlet {

	@ProcessAction(name = "addTimeSheet")
	public void addTimeSheet(ActionRequest actionRequest, ActionResponse actionResponse) {

		try {
			String jobName = ParamUtil.getString(actionRequest,"jobName");
			String description = ParamUtil.getString(actionRequest,"description");

			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);

			TimeSheetLocalServiceUtil.addTimeSheet(jobName,description,serviceContext);

			actionResponse.setRenderParameter("jspPage", "/view.jsp");

		} catch (Exception e ) {
			System.out.println("Error occur In WorkFlowWithMVCPortlet.java");
			System.out.println("Error occur In addTimeSheet method");
			System.out.println("Error : " + e);
			e.printStackTrace();
		}
	}

	@ProcessAction(name = "deleteTimeSheet")
	public void deleteTimeSheet(ActionRequest actionRequest, ActionResponse actionResponse) {

		try {
			Long timeSheetId = ParamUtil.getLong(actionRequest,"timeSheetId");

			TimeSheetLocalServiceUtil.deleteTimeSheet(timeSheetId);

			actionResponse.setRenderParameter("jspPage", "/view.jsp");

		} catch (Exception e ) {
			System.out.println("Error occur In WorkFlowWithMVCPortlet.java");
			System.out.println("Error occur In deleteTimeSheet method");
			System.out.println("Error : " + e);
			e.printStackTrace();
		}
	}

}