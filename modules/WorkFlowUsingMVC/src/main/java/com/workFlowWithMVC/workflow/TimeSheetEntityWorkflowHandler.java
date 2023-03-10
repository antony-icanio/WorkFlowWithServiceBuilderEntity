package com.workFlowWithMVC.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.mvcServiceBuilder.model.TimeSheet;
import com.mvcServiceBuilder.service.TimeSheetLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

@Component(immediate = true, service = WorkflowHandler.class)
public class TimeSheetEntityWorkflowHandler extends BaseWorkflowHandler<TimeSheet> {

    @Override
    public long getDiscussionClassPK(Map workflowContext) {
        return super.getDiscussionClassPK(workflowContext);
    }

    @Override
    public String getClassName() {
        return TimeSheet.class.getName();
    }

    @Override
    public String getType(Locale locale) {
        return LanguageUtil.get(locale,getClassName());
    }

    @Override
    public boolean isCommentable() {
        return super.isCommentable();
    }

    @Override
    public boolean isVisible(Group group) {
        return super.isVisible(group);
    }

    @Override
    public TimeSheet updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {

        long userId = GetterUtil.getLong(
                (String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));

        long timeSheetEntityId = GetterUtil.getLong(
                (String)workflowContext.get(
                        WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

        ServiceContext serviceContext = (ServiceContext)workflowContext.get(
                "serviceContext");

        return TimeSheetLocalServiceUtil.updateStatus(
                userId, timeSheetEntityId, status, serviceContext);
    }

}

