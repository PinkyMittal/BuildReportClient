package com.att.models;
public class Application {
	private String AppName;
	private String motsID;
	private String TowerName;
	private String buildToolUsed;
	private String sourceCodeControlToolUsed;
	private String buildRepositoryUsed;
	public String getAppName() {
		return AppName;
	}
	public void setAppName(String appName) {
		AppName = appName;
	}
	public String getMotsID() {
		return motsID;
	}
	public void setMotsID(String motsID) {
		this.motsID = motsID;
	}
	public String getTowerName() {
		return TowerName;
	}
	public void setTowerName(String towerName) {
		TowerName = towerName;
	}
	public String getBuildToolUsed() {
		return buildToolUsed;
	}
	public void setBuildToolUsed(String buildToolUsed) {
		this.buildToolUsed = buildToolUsed;
	}
	public String getSourceCodeControlToolUsed() {
		return sourceCodeControlToolUsed;
	}
	public void setSourceCodeControlToolUsed(String sourceCodeControlToolUsed) {
		this.sourceCodeControlToolUsed = sourceCodeControlToolUsed;
	}
	public String getBuildRepositoryUsed() {
		return buildRepositoryUsed;
	}
	public void setBuildRepositoryUsed(String buildRepositoryUsed) {
		this.buildRepositoryUsed = buildRepositoryUsed;
	}
}
