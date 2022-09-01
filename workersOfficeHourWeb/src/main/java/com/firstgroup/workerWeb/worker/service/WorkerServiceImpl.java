package com.firstgroup.workerWeb.worker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstgroup.workerWeb.command.WorkerVO;
import com.firstgroup.workerWeb.worker.mapper.WorkerMapper;

@Service("workerService")
public class WorkerServiceImpl implements WorkerService{

	@Autowired
	WorkerMapper workerMapper;
	
	@Override
	public int signUp(WorkerVO workerVO) {
		
		return workerMapper.signUp(workerVO);
	}

	@Override
	public WorkerVO login(WorkerVO workerVO) {
		
		return workerMapper.login(workerVO);
	}

	@Override
	public int checkId(String worker_id) {
		
		return workerMapper.checkId(worker_id);
	}

}
