package com.sriram.sample.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORT")
public class ReportDetails {
	@Id
	@Column(name="REPORTID")
	private String reportid;
	@Column(name="REPORTNAME")
	private String reportname;
	@Column(name="REPORTTYPE")
	private String reporttype;
	public String getReportid() {
		return reportid;
	}
	public void setReportid(String reportid) {
		this.reportid = reportid;
	}
	public String getReportname() {
		return reportname;
	}
	public void setReportname(String reportname) {
		this.reportname = reportname;
	}
	public String getReporttype() {
		return reporttype;
	}
	public void setReporttype(String reporttype) {
		this.reporttype = reporttype;
	}
	
	
	

}
