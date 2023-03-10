/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.mvcServiceBuilder.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.UserServiceUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.mvcServiceBuilder.model.TimeSheet;
import com.mvcServiceBuilder.model.impl.TimeSheetImpl;
import com.mvcServiceBuilder.service.base.TimeSheetLocalServiceBaseImpl;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
public class TimeSheetLocalServiceImpl extends TimeSheetLocalServiceBaseImpl {

    public TimeSheet addTimeSheet(String jobName,String description,
                                  ServiceContext serviceContext) throws PortalException {

        TimeSheet timeSheet = new TimeSheetImpl();

        User user = UserServiceUtil.getCurrentUser();

        long timeSheetId = counterLocalService.increment(TimeSheet.class.getName());

        timeSheet.setTimeSheetId(timeSheetId);
        timeSheet.setJobName(jobName);
        timeSheet.setDescription(description);

        timeSheet.setStatus(WorkflowConstants.STATUS_DRAFT);
        timeSheet.setGroupId(user.getGroupId());
        timeSheet.setCompanyId(user.getCompanyId());

        timeSheet.setUserId(user.getUserId());
        timeSheet.setUserName(user.getFullName());

        TimeSheet newTimeSheet = timeSheetLocalService.addTimeSheet(timeSheet);

        WorkflowHandlerRegistryUtil.startWorkflowInstance(user.getCompanyId(),
                user.getGroupId(), user.getUserId(), TimeSheet.class.getName(),
                timeSheetId, newTimeSheet, serviceContext);

        return newTimeSheet ;
    }

    public TimeSheet updateStatus(long userId,long timeSheetEntityId,
                                  int status, ServiceContext serviceContext) {

        TimeSheet timeSheet = timeSheetLocalService.fetchTimeSheet(timeSheetEntityId);

        timeSheet.setStatus(status);
        timeSheet.setStatusByUserId(userId);
        timeSheet.setStatusDate(new Date());

        User user = UserLocalServiceUtil.fetchUser(userId);

        timeSheet.setStatusByUserName(user.getFullName());

        return timeSheetLocalService.updateTimeSheet(timeSheet);
    }

}