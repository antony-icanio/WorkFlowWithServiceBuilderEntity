package com.workFlowWithMVC.Asset;

import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoader;
import com.mvcServiceBuilder.model.TimeSheet;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class TimeSheetAssetRenderer extends BaseJSPAssetRenderer<TimeSheet> {

    private final TimeSheet timeSheet;
    private final ResourceBundleLoader resourceBundleLoader;

    public TimeSheetAssetRenderer(TimeSheet timeSheet, ResourceBundleLoader resourceBundleLoader) {
        this.timeSheet = timeSheet;
        this.resourceBundleLoader = resourceBundleLoader;
    }

    @Override
    public String getJspPath(HttpServletRequest httpServletRequest, String template) {
        return null;
//        return "/leave/leaveAssetInfo.jsp";
    }

    @Override
    public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
        request.setAttribute("timeSheetEntry", timeSheet);
        return super.include(request, response, template);
    }

    @Override
    public TimeSheet getAssetObject() {
        return timeSheet;
    }

    @Override
    public long getGroupId() {
        return timeSheet.getGroupId();
    }

    @Override
    public long getUserId() {
        return timeSheet.getUserId();
    }

    @Override
    public String getUserName() {
        return timeSheet.getUserName();
    }

    @Override
    public String getUuid() {
        return timeSheet.getUuid();
    }

    @Override
    public String getClassName() {
        return TimeSheet.class.getName();
    }

    @Override
    public long getClassPK() {
        return timeSheet.getTimeSheetId();
    }

    @Override
    public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {

        String summary = timeSheet.getUserName() + " Submit Time Sheet For Your Approval " + "\n" +
                "Job Name : " + timeSheet.getJobName() + "\n" +
                "Description : " + timeSheet.getDescription() + "\n" +
                "Date : " + timeSheet.getDate() + "\n" +
                "Hour : " + timeSheet.getHour() + "\n" ;

        return summary;
    }

    @Override
    public int getStatus() {
        return timeSheet.getStatus();
    }

    @Override
    public String getTitle(Locale locale) {
        return timeSheet.getJobName();
    }

    @Override
    public int getAssetRendererType() {
        return super.getAssetRendererType();
    }
}
