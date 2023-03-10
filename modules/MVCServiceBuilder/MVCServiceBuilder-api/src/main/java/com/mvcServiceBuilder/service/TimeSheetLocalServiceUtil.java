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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.mvcServiceBuilder.model.TimeSheet;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TimeSheet. This utility wraps
 * <code>com.mvcServiceBuilder.service.impl.TimeSheetLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TimeSheetLocalService
 * @generated
 */
public class TimeSheetLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.mvcServiceBuilder.service.impl.TimeSheetLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static TimeSheet addTimeSheet(
			String jobName, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addTimeSheet(jobName, description, serviceContext);
	}

	/**
	 * Adds the time sheet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TimeSheetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param timeSheet the time sheet
	 * @return the time sheet that was added
	 */
	public static TimeSheet addTimeSheet(TimeSheet timeSheet) {
		return getService().addTimeSheet(timeSheet);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new time sheet with the primary key. Does not add the time sheet to the database.
	 *
	 * @param timeSheetId the primary key for the new time sheet
	 * @return the new time sheet
	 */
	public static TimeSheet createTimeSheet(long timeSheetId) {
		return getService().createTimeSheet(timeSheetId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the time sheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TimeSheetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param timeSheetId the primary key of the time sheet
	 * @return the time sheet that was removed
	 * @throws PortalException if a time sheet with the primary key could not be found
	 */
	public static TimeSheet deleteTimeSheet(long timeSheetId)
		throws PortalException {

		return getService().deleteTimeSheet(timeSheetId);
	}

	/**
	 * Deletes the time sheet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TimeSheetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param timeSheet the time sheet
	 * @return the time sheet that was removed
	 */
	public static TimeSheet deleteTimeSheet(TimeSheet timeSheet) {
		return getService().deleteTimeSheet(timeSheet);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.mvcServiceBuilder.model.impl.TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.mvcServiceBuilder.model.impl.TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TimeSheet fetchTimeSheet(long timeSheetId) {
		return getService().fetchTimeSheet(timeSheetId);
	}

	/**
	 * Returns the time sheet matching the UUID and group.
	 *
	 * @param uuid the time sheet's UUID
	 * @param groupId the primary key of the group
	 * @return the matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public static TimeSheet fetchTimeSheetByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchTimeSheetByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the time sheet with the primary key.
	 *
	 * @param timeSheetId the primary key of the time sheet
	 * @return the time sheet
	 * @throws PortalException if a time sheet with the primary key could not be found
	 */
	public static TimeSheet getTimeSheet(long timeSheetId)
		throws PortalException {

		return getService().getTimeSheet(timeSheetId);
	}

	/**
	 * Returns the time sheet matching the UUID and group.
	 *
	 * @param uuid the time sheet's UUID
	 * @param groupId the primary key of the group
	 * @return the matching time sheet
	 * @throws PortalException if a matching time sheet could not be found
	 */
	public static TimeSheet getTimeSheetByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getTimeSheetByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the time sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.mvcServiceBuilder.model.impl.TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @return the range of time sheets
	 */
	public static List<TimeSheet> getTimeSheets(int start, int end) {
		return getService().getTimeSheets(start, end);
	}

	/**
	 * Returns all the time sheets matching the UUID and company.
	 *
	 * @param uuid the UUID of the time sheets
	 * @param companyId the primary key of the company
	 * @return the matching time sheets, or an empty list if no matches were found
	 */
	public static List<TimeSheet> getTimeSheetsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getTimeSheetsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of time sheets matching the UUID and company.
	 *
	 * @param uuid the UUID of the time sheets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching time sheets, or an empty list if no matches were found
	 */
	public static List<TimeSheet> getTimeSheetsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TimeSheet> orderByComparator) {

		return getService().getTimeSheetsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of time sheets.
	 *
	 * @return the number of time sheets
	 */
	public static int getTimeSheetsCount() {
		return getService().getTimeSheetsCount();
	}

	public static TimeSheet updateStatus(
		long userId, long timeSheetEntityId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().updateStatus(
			userId, timeSheetEntityId, status, serviceContext);
	}

	/**
	 * Updates the time sheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TimeSheetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param timeSheet the time sheet
	 * @return the time sheet that was updated
	 */
	public static TimeSheet updateTimeSheet(TimeSheet timeSheet) {
		return getService().updateTimeSheet(timeSheet);
	}

	public static TimeSheetLocalService getService() {
		return _service;
	}

	private static volatile TimeSheetLocalService _service;

}