package com.att.models;

public class TestStatus {

	private int id;
	private String buildNumber;
	private String moduleTested;
	private String testType;
	private String timeTaken;
	private int totalNumberOfTCs;
	private int numberOfTCsExecuted;
	private int numberOfTCsPassed;
	private int numberOfTCsFailed;
	private int numberOfIgnoreTCs;

	public int getTotalNumberOfTCs() {
		return totalNumberOfTCs;
	}

	public void setTotalNumberOfTCs(int totalNumberOfTCs) {
		this.totalNumberOfTCs = totalNumberOfTCs;
	}

	public int getNumberOfTCsExecuted() {
		return numberOfTCsExecuted;
	}

	public void setNumberOfTCsExecuted(int numberOfTCsExecuted) {
		this.numberOfTCsExecuted = numberOfTCsExecuted;
	}

	public int getNumberOfTCsPassed() {
		return numberOfTCsPassed;
	}

	public void setNumberOfTCsPassed(int numberOfTCsPassed) {
		this.numberOfTCsPassed = numberOfTCsPassed;
	}

	public int getNumberOfTCsFailed() {
		return numberOfTCsFailed;
	}

	public void setNumberOfTCsFailed(int numberOfTCsFailed) {
		this.numberOfTCsFailed = numberOfTCsFailed;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public int getId() {
		return id;
	}

	public String getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(String timeTaken) {
		this.timeTaken = timeTaken;
	}

	public int getNumberOfIgnoreTCs() {
		return numberOfIgnoreTCs;
	}

	public void setNumberOfIgnoreTCs(int numberOfIgnoreTCs) {
		this.numberOfIgnoreTCs = numberOfIgnoreTCs;
	}

	public String getModuleTested() {
		return moduleTested;
	}

	public void setModuleTested(String moduleTested) {
		this.moduleTested = moduleTested;
	}

	public void setId(int id) {
		this.id = id;
	}

}
