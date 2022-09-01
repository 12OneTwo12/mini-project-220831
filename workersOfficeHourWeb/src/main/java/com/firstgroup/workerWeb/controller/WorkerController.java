package com.firstgroup.workerWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstgroup.workerWeb.command.WorkerVO;

@Controller("/worker")
public class WorkerController {

	@RequestMapping("#") // 회원가입 요청 Form 받을 곳
	public String signUp(WorkerVO workerVO) {
		
		
		
		return ""; // 로그인 페이지로 이동
	}
	
}
