package com.sriram.sample.jpa.vo;

public class ReportDetailsVO {
	
	public ReportDetailsVO() {
		
	}
	
	public ReportDetailsVO(String reportname, String reportid) {
		super();
		this.reportname = reportname;
		this.reportid = reportid;
	}

	private String reportname;
	
	private String reportid;

	public String getReportname() {
		return reportname;
	}

	public void setReportname(String reportname) {
		this.reportname = reportname;
	}

	public String getReportid() {
		return reportid;
	}

	public void setReportid(String reportid) {
		this.reportid = reportid;
	}
	

}
