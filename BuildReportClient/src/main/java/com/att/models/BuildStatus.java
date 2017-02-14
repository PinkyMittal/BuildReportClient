package com.att.models;

import java.util.Date;

public class BuildStatus {

	private String buildNumber;
	private Date buildDateTime;

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

}
