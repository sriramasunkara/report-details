package com.sriram.sample.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sriram.sample.jpa.repository.ReportDetailsRepository;
import com.sriram.sample.jpa.vo.ReportDetailsVO;
import com.sriram.sample.jpa.vo.ResponseVO;
@RestController
@RequestMapping("reportdetails")
public class ReportDetailsController {
	@Autowired
	private ReportDetailsRepository reportDetailsRepository;
	
	@GetMapping("report")
	public ResponseEntity<ResponseVO> getReportDetails(@RequestParam("reporttype")String reportType){
		List<ReportDetailsVO> reportDetailsVOs =reportDetailsRepository.getReportName(reportType);
		ResponseVO repResponseVO=new ResponseVO();
		repResponseVO.setReportDetails(reportDetailsVOs);
		repResponseVO.setReportFlag(false);
		return new ResponseEntity<ResponseVO>(repResponseVO,HttpStatus.OK);
	}

}
