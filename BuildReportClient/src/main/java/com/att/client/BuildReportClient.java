package com.att.client;

import java.net.URI;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.filter.LoggingFilter;

import com.att.models.Build;
import com.att.models.BuildStatus;
import com.att.models.TestStatus;
import com.google.gson.Gson;

public class BuildReportClient {
	private Client client;
	public BuildReportClient(){
		client=ClientBuilder.newClient();
		client.register(new LoggingFilter());
	
	}
	
	private static URI getBaseURI(){
		return UriBuilder.fromUri("http://localhost:8070/build-reporting-service/webapi/").build();
	}
	
	public String postResults(String json){
		WebTarget target=client.target(getBaseURI());
		System.out.println("the target is "+target.getUri());
		Response response=target.path("apps").request().accept(MediaType.TEXT_PLAIN)
				.post(Entity.entity(json,MediaType.APPLICATION_JSON));
		System.out.println("the response is "+response.getStatus());
		return response.toString();
		
	}
	
public static void main(String[] args) {
	Build build = new Build();
	BuildReportClient buildReportClient=new BuildReportClient();
	BuildStatus buildStatus = new BuildStatus();
	List<TestStatus> testStatusList=new ArrayList<TestStatus>();
	build.setAppName("BDMAP");
	build.setBuildNumber("emap43.90");
	java.util.Date utilDate = new java.util.Date();
	java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	System.out.println("utilDate:" + utilDate);
	System.out.println("sqlDate:" + sqlDate.toLocalDate());
	build.setBuildStatus("Success");
	TestStatus testStatus=new TestStatus();
	testStatus.setBuildNumber("emap43.90");
	testStatus.setTestType("Junit");
	testStatus.setNumberOfTCsPassed(123);
	testStatusList.add(testStatus);
	build.setBuildStatus("Failure");;
	build.setTestStatus(testStatusList);
	Gson gson = new Gson();
	String json=gson.toJson(build);
	System.out.println("The json is "+json);
	buildReportClient.postResults(json);
	
}
}
