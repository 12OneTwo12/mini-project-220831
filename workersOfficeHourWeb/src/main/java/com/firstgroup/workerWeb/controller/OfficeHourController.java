package com.firstgroup.workerWeb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.firstgroup.workerWeb.command.WorkerVO;
import com.firstgroup.workerWeb.worker.service.WorkerService;

@Controller
@RequestMapping("/officehour")
public class OfficeHourController {

	@Autowired
	@Qualifier("workerService")
	WorkerService workerService;
	
	@RequestMapping("/homepage")
	public String homepage(HttpSession session) {
		
		if(session.getAttribute("sessionVO") != null) {
			return "officehour/homepage";
		} else {
			return "redirect:/worker/login";
		}
		
	}
	
	@RequestMapping("/work_start")
	public String work_start(RedirectAttributes RA, HttpSession session) {
		
		WorkerVO vo = (WorkerVO)session.getAttribute("sessionVO");
		
		int result = workerService.workStart(vo);
		
		if(result == 1) {
			RA.addFlashAttribute("msg", "출근 등록 완료했습니다 오늘 하루 힘내세요!");		
			return "redirect:homepage";
		} else {
			RA.addFlashAttribute("msg", "출근 등록에 실패했습니다 관리자에게 문의해주세요");
			return "redirect:homepage";
		}
	}
	
	@RequestMapping("/work_end")
	public String work_end(RedirectAttributes RA, HttpSession session) {
		
		WorkerVO vo = (WorkerVO)session.getAttribute("sessionVO");
		
		int result = workerService.workEnd(vo);
		
		if(result == 1) {
			RA.addFlashAttribute("msg", "퇴근 완료했습니다 수고 많으셨습니다!");		
			return "redirect:homepage";
		} else {
			RA.addFlashAttribute("msg", "퇴근 등록에 실패했습니다 관리자에게 문의해주세요");
			return "redirect:homepage";
		}
	}
	
}
