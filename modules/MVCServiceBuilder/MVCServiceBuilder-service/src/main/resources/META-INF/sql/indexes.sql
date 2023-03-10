create index IX_7633A41E on FOO_TimeSheet (name[$COLUMN_LENGTH:75$]);
create index IX_F5553FD3 on FOO_TimeSheet (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_58C19F15 on FOO_TimeSheet (uuid_[$COLUMN_LENGTH:75$], groupId);