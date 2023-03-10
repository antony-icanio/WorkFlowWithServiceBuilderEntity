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

package com.mvcServiceBuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TimeSheetService}.
 *
 * @author Brian Wing Shun Chan
 * @see TimeSheetService
 * @generated
 */
public class TimeSheetServiceWrapper
	implements ServiceWrapper<TimeSheetService>, TimeSheetService {

	public TimeSheetServiceWrapper() {
		this(null);
	}

	public TimeSheetServiceWrapper(TimeSheetService timeSheetService) {
		_timeSheetService = timeSheetService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _timeSheetService.getOSGiServiceIdentifier();
	}

	@Override
	public TimeSheetService getWrappedService() {
		return _timeSheetService;
	}

	@Override
	public void setWrappedService(TimeSheetService timeSheetService) {
		_timeSheetService = timeSheetService;
	}

	private TimeSheetService _timeSheetService;

}