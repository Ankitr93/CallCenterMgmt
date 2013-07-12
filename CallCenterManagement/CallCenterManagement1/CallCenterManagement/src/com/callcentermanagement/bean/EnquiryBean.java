package com.callcentermanagement.bean;

public class EnquiryBean {
	private int empId;
	private int customerId;
	private String query;
	private String querySolution;
	private String queryStatus;
	private String dateOfQuery;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getQuerySolution() {
		return querySolution;
	}
	public void setQuerySolution(String querySolution) {
		this.querySolution = querySolution;
	}
	public String getQueryStatus() {
		return queryStatus;
	}
	public void setQueryStatus(String queryStatus) {
		this.queryStatus = queryStatus;
	}
	public String getDateOfQuery() {
		return dateOfQuery;
	}
	public void setDateOfQuery(String dateOfQuery) {
		this.dateOfQuery = dateOfQuery;
	}
	
}
