package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(value="/creator")
public class CreatorController {
	private static final Logger logger = LoggerFactory.getLogger(CreatorController.class);

	//기본 페이지 이동
	@RequestMapping(value = "/class_basic", method=RequestMethod.GET)
	public void basicPageGET() {
	
		logger.info("크리에이터 기본정보 페이지 진입");
	}
	
	//제목 페이지 이동
	@RequestMapping(value = "/class_title", method=RequestMethod.GET)
	public void titlePageGET() {
	
		logger.info("크리에이터 제목및커버 페이지 진입");
	}
	
	//클래스소개 페이지 이동
	@RequestMapping(value = "/class_info", method=RequestMethod.GET)
	public void infoPageGET() {
		
		logger.info("크리에이터 클래스소개 페이지 진입");
	}
	
	//커리큘럼 페이지 이동
	@RequestMapping(value = "/class_curriculum", method=RequestMethod.GET)
	public void curriculumPageGET() {
		
		logger.info("크리에이터 커리큘럼 페이지 진입");
	}
	
	//크리에이터 페이지 이동
	@RequestMapping(value = "/class_creator", method=RequestMethod.GET)
	public void creatorPageGET() {
		
		logger.info("크리에이터 크리에이터소개 페이지 진입");
	}

}