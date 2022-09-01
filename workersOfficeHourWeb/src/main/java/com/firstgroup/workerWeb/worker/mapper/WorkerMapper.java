package com.firstgroup.workerWeb.worker.mapper;

import com.firstgroup.workerWeb.command.WorkerVO;

public interface WorkerMapper {

	int signUp(WorkerVO workerVO);

	WorkerVO login(WorkerVO workerVO);

	int checkId(String worker_id);

}
