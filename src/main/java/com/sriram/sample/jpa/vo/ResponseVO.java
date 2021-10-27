package com.sriram.sample.jpa.vo;

import java.util.List;

public class ResponseVO {
	
	private List<ReportDetailsVO> reportDetails;
	
	private Boolean reportFlag;

	public List<ReportDetailsVO> getReportDetails() {
		return reportDetails;
	}

	public void setReportDetails(List<ReportDetailsVO> reportDetails) {
		this.reportDetails = reportDetails;
	}

	public Boolean getReportFlag() {
		return reportFlag;
	}

	public void setReportFlag(Boolean reportFlag) {
		this.reportFlag = reportFlag;
	}
	

}
