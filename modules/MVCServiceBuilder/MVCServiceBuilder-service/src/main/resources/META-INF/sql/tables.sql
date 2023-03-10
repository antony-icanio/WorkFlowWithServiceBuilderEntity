create table FOO_TimeSheet (
	uuid_ VARCHAR(75) null,
	timeSheetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	jobName VARCHAR(75) null,
	description VARCHAR(75) null,
	date_ DATE null,
	hour INTEGER,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);