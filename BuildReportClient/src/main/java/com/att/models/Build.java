package com.att.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Build {

	private String buildNumber;
	private String appName;
	private Date buildDateTime;
	private String buildStatus;

	private List<TestStatus> testStatus = new ArrayList<TestStatus>();

	public List<TestStatus> getTestStatus() {
		return testStatus;
	}

	public void setTestStatus(List<TestStatus> testStatus) {
		this.testStatus = testStatus;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public Date getBuildDateTime() {
		return buildDateTime;
	}

	public void setBuildDateTime(Date buildDateTime) {
		this.buildDateTime = buildDateTime;
	}

	public String getBuildStatus() {
		return buildStatus;
	}

	public void setBuildStatus(String buildStatus) {
		this.buildStatus = buildStatus;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

}
