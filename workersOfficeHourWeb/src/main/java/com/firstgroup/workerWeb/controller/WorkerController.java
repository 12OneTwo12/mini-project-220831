package com.firstgroup.workerWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstgroup.workerWeb.command.WorkerVO;

@Controller("/worker")
public class WorkerController {

	@RequestMapping("#") // ȸ������ ��û Form ���� ��
	public String signUp(WorkerVO workerVO) {
		
		
		
		return ""; // �α��� �������� �̵�
	}
	
}
