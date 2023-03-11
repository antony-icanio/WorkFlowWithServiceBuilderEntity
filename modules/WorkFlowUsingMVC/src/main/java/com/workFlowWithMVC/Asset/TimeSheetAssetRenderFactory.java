package com.workFlowWithMVC.Asset;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoader;
import com.mvcServiceBuilder.model.TimeSheet;
import com.mvcServiceBuilder.service.TimeSheetLocalService;
import com.workFlowWithMVC.constants.WorkFlowWithMVCPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.ServletContext;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + WorkFlowWithMVCPortletKeys.WORKFLOWWITHMVC
        },
        service = AssetRendererFactory.class
)
public class TimeSheetAssetRenderFactory extends BaseAssetRendererFactory<TimeSheet> {

    private TimeSheetLocalService timeSheetLocalService;
    private ResourceBundleLoader resourceBundleLoader;
    private ServletContext servletContext;

    @Reference(unbind = "-")
    protected void setLeaveService(TimeSheetLocalService timeSheetLocalService) {
        this.timeSheetLocalService = timeSheetLocalService;
    }

    @Reference(unbind = "-")
    public void setResourceBundleLoader(ResourceBundleLoader resourceBundleLoader) {
        this.resourceBundleLoader = resourceBundleLoader;
    }

    @Reference(unbind = "-")
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }


    public TimeSheetAssetRenderFactory() {
        setClassName( TimeSheet.class.getName());
        setCategorizable(true);
        setLinkable(true);
        setPortletId(WorkFlowWithMVCPortletKeys.WORKFLOWWITHMVC);
        setSearchable(true);
        setSelectable(true);
    }

    @Override
    public AssetRenderer<TimeSheet> getAssetRenderer(long classPK, int type) throws PortalException {
        TimeSheet timeSheet = timeSheetLocalService.getTimeSheet(classPK);
        TimeSheetAssetRenderer assetRenders = new TimeSheetAssetRenderer(timeSheet, resourceBundleLoader);
        assetRenders.setAssetRendererType(type);
        assetRenders.setServletContext(servletContext);
        return assetRenders;
    }

    @Override
    public String getType() {
        return "timeSheet";
    }

    @Override
    public String getClassName() {
        return TimeSheet.class.getName();
    }

}
