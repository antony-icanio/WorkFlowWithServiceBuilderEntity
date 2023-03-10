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

package com.mvcServiceBuilder.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.mvcServiceBuilder.exception.NoSuchTimeSheetException;
import com.mvcServiceBuilder.model.TimeSheet;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the time sheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TimeSheetUtil
 * @generated
 */
@ProviderType
public interface TimeSheetPersistence extends BasePersistence<TimeSheet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TimeSheetUtil} to access the time sheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the time sheets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid(String uuid);

	/**
	 * Returns a range of all the time sheets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @return the range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the time sheets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the time sheets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first time sheet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the first time sheet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns the last time sheet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the last time sheet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns the time sheets before and after the current time sheet in the ordered set where uuid = &#63;.
	 *
	 * @param timeSheetId the primary key of the current time sheet
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next time sheet
	 * @throws NoSuchTimeSheetException if a time sheet with the primary key could not be found
	 */
	public TimeSheet[] findByUuid_PrevAndNext(
			long timeSheetId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Removes all the time sheets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of time sheets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching time sheets
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the time sheet where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTimeSheetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByUUID_G(String uuid, long groupId)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the time sheet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the time sheet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the time sheet where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the time sheet that was removed
	 */
	public TimeSheet removeByUUID_G(String uuid, long groupId)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the number of time sheets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching time sheets
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the time sheets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the time sheets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @return the range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the time sheets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the time sheets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first time sheet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the first time sheet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns the last time sheet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the last time sheet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns the time sheets before and after the current time sheet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param timeSheetId the primary key of the current time sheet
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next time sheet
	 * @throws NoSuchTimeSheetException if a time sheet with the primary key could not be found
	 */
	public TimeSheet[] findByUuid_C_PrevAndNext(
			long timeSheetId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Removes all the time sheets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of time sheets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching time sheets
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the time sheets where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching time sheets
	 */
	public java.util.List<TimeSheet> findByName(String name);

	/**
	 * Returns a range of all the time sheets where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @return the range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByName(
		String name, int start, int end);

	/**
	 * Returns an ordered range of all the time sheets where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the time sheets where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching time sheets
	 */
	public java.util.List<TimeSheet> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first time sheet in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the first time sheet in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns the last time sheet in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching time sheet
	 * @throws NoSuchTimeSheetException if a matching time sheet could not be found
	 */
	public TimeSheet findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the last time sheet in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching time sheet, or <code>null</code> if a matching time sheet could not be found
	 */
	public TimeSheet fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns the time sheets before and after the current time sheet in the ordered set where name = &#63;.
	 *
	 * @param timeSheetId the primary key of the current time sheet
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next time sheet
	 * @throws NoSuchTimeSheetException if a time sheet with the primary key could not be found
	 */
	public TimeSheet[] findByName_PrevAndNext(
			long timeSheetId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
				orderByComparator)
		throws NoSuchTimeSheetException;

	/**
	 * Removes all the time sheets where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of time sheets where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching time sheets
	 */
	public int countByName(String name);

	/**
	 * Caches the time sheet in the entity cache if it is enabled.
	 *
	 * @param timeSheet the time sheet
	 */
	public void cacheResult(TimeSheet timeSheet);

	/**
	 * Caches the time sheets in the entity cache if it is enabled.
	 *
	 * @param timeSheets the time sheets
	 */
	public void cacheResult(java.util.List<TimeSheet> timeSheets);

	/**
	 * Creates a new time sheet with the primary key. Does not add the time sheet to the database.
	 *
	 * @param timeSheetId the primary key for the new time sheet
	 * @return the new time sheet
	 */
	public TimeSheet create(long timeSheetId);

	/**
	 * Removes the time sheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param timeSheetId the primary key of the time sheet
	 * @return the time sheet that was removed
	 * @throws NoSuchTimeSheetException if a time sheet with the primary key could not be found
	 */
	public TimeSheet remove(long timeSheetId) throws NoSuchTimeSheetException;

	public TimeSheet updateImpl(TimeSheet timeSheet);

	/**
	 * Returns the time sheet with the primary key or throws a <code>NoSuchTimeSheetException</code> if it could not be found.
	 *
	 * @param timeSheetId the primary key of the time sheet
	 * @return the time sheet
	 * @throws NoSuchTimeSheetException if a time sheet with the primary key could not be found
	 */
	public TimeSheet findByPrimaryKey(long timeSheetId)
		throws NoSuchTimeSheetException;

	/**
	 * Returns the time sheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param timeSheetId the primary key of the time sheet
	 * @return the time sheet, or <code>null</code> if a time sheet with the primary key could not be found
	 */
	public TimeSheet fetchByPrimaryKey(long timeSheetId);

	/**
	 * Returns all the time sheets.
	 *
	 * @return the time sheets
	 */
	public java.util.List<TimeSheet> findAll();

	/**
	 * Returns a range of all the time sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @return the range of time sheets
	 */
	public java.util.List<TimeSheet> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the time sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of time sheets
	 */
	public java.util.List<TimeSheet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the time sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TimeSheetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of time sheets
	 * @param end the upper bound of the range of time sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of time sheets
	 */
	public java.util.List<TimeSheet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TimeSheet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the time sheets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of time sheets.
	 *
	 * @return the number of time sheets
	 */
	public int countAll();

}