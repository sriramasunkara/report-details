package com.sriram.sample.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sriram.sample.jpa.entity.ReportDetails;
import com.sriram.sample.jpa.vo.ReportDetailsVO;

@Repository
public interface ReportDetailsRepository extends JpaRepository<ReportDetails, String> {
	
	@Query("select new com.sriram.sample.jpa.vo.ReportDetailsVO(rd.reportname,rd.reportid) from ReportDetails rd where rd.reporttype=:reportType ")
	public List<ReportDetailsVO> getReportName(@Param("reportType") String reportType);
	
	
	

}
