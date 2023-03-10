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

package com.mvcServiceBuilder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.mvcServiceBuilder.model.TimeSheet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TimeSheet in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TimeSheetCacheModel
	implements CacheModel<TimeSheet>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TimeSheetCacheModel)) {
			return false;
		}

		TimeSheetCacheModel timeSheetCacheModel = (TimeSheetCacheModel)object;

		if (timeSheetId == timeSheetCacheModel.timeSheetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, timeSheetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", timeSheetId=");
		sb.append(timeSheetId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", jobName=");
		sb.append(jobName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", date=");
		sb.append(date);
		sb.append(", hour=");
		sb.append(hour);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TimeSheet toEntityModel() {
		TimeSheetImpl timeSheetImpl = new TimeSheetImpl();

		if (uuid == null) {
			timeSheetImpl.setUuid("");
		}
		else {
			timeSheetImpl.setUuid(uuid);
		}

		timeSheetImpl.setTimeSheetId(timeSheetId);
		timeSheetImpl.setGroupId(groupId);
		timeSheetImpl.setCompanyId(companyId);
		timeSheetImpl.setUserId(userId);

		if (userName == null) {
			timeSheetImpl.setUserName("");
		}
		else {
			timeSheetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			timeSheetImpl.setCreateDate(null);
		}
		else {
			timeSheetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			timeSheetImpl.setModifiedDate(null);
		}
		else {
			timeSheetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			timeSheetImpl.setName("");
		}
		else {
			timeSheetImpl.setName(name);
		}

		if (jobName == null) {
			timeSheetImpl.setJobName("");
		}
		else {
			timeSheetImpl.setJobName(jobName);
		}

		if (description == null) {
			timeSheetImpl.setDescription("");
		}
		else {
			timeSheetImpl.setDescription(description);
		}

		if (date == Long.MIN_VALUE) {
			timeSheetImpl.setDate(null);
		}
		else {
			timeSheetImpl.setDate(new Date(date));
		}

		timeSheetImpl.setHour(hour);
		timeSheetImpl.setStatus(status);
		timeSheetImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			timeSheetImpl.setStatusByUserName("");
		}
		else {
			timeSheetImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			timeSheetImpl.setStatusDate(null);
		}
		else {
			timeSheetImpl.setStatusDate(new Date(statusDate));
		}

		timeSheetImpl.resetOriginalValues();

		return timeSheetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		timeSheetId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		jobName = objectInput.readUTF();
		description = objectInput.readUTF();
		date = objectInput.readLong();

		hour = objectInput.readInt();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(timeSheetId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (jobName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jobName);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(date);

		objectOutput.writeInt(hour);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long timeSheetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String jobName;
	public String description;
	public long date;
	public int hour;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}