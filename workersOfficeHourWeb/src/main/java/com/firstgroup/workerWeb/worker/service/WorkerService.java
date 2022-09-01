package com.firstgroup.workerWeb.worker.service;

import com.firstgroup.workerWeb.command.WorkerVO;

public interface WorkerService {

	int signUp(WorkerVO workerVO);

	WorkerVO login(WorkerVO workerVO);

	int checkId(String worker_id);

}
