package com.workFlowWithMVC.portlet;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.WorkflowDefinitionLink;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserServiceUtil;
import com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.workflow.WorkflowTaskManagerUtil;
import com.liferay.portal.workflow.kaleo.service.KaleoInstanceLocalServiceUtil;
import com.mvcServiceBuilder.service.TimeSheetLocalServiceUtil;
import com.mvcServiceBuilder.model.TimeSheet;
import com.workFlowWithMVC.constants.WorkFlowWithMVCPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import org.osgi.service.component.annotations.Component;

import java.util.List;

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

	@ProcessAction(name = "approveTimeSheet")
	public void approveTimeSheet(ActionRequest actionRequest, ActionResponse actionResponse) {

		try {
			Long workflowTaskId = ParamUtil.getLong(actionRequest,"workflowTaskId");

			User user = UserServiceUtil.getCurrentUser();

			List<String> transitionList = WorkflowTaskManagerUtil.
					getNextTransitionNames(user.getCompanyId(),user.getUserId(),workflowTaskId);

			System.out.println("workflowTaskId : " + workflowTaskId);

			for(String s : transitionList) {
				System.out.println("Name : " + s);
			}

			System.out.println("Class Name : " + TimeSheet.class.getName());

//			List<WorkflowDefinitionLink> workflowDefinitionLinks = WorkflowDefinitionLinkLocalServiceUtil.
//					getWorkflowDefinitionLinks(user.getCompanyId(), TimeSheetLocalServiceUtil.getClassNameId(YourAssetClassName.class.getName()));
//			if (!workflowDefinitionLinks.isEmpty()) {
//				WorkflowDefinitionLink workflowDefinitionLink = workflowDefinitionLinks.get(0);
//				String workflowAssetType = workflowDefinitionLink.getAssetType();
//			}
//
//			WorkflowTaskManagerUtil.completeWorkflowTask(user.getCompanyId(),user.getUserId(),
//					workflowTaskId,"approve","No Comment",null);

			actionResponse.setRenderParameter("jspPage", "/view.jsp");

		} catch (Exception e ) {
			System.out.println("Error occur In WorkFlowWithMVCPortlet.java");
			System.out.println("Error occur In approveTimeSheet method");
			System.out.println("Error : " + e);
			e.printStackTrace();
		}
	}

}