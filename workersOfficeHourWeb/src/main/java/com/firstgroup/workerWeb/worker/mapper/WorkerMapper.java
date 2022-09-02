package com.firstgroup.workerWeb.worker.mapper;

import org.apache.ibatis.annotations.Param;

import com.firstgroup.workerWeb.command.WorkerVO;

public interface WorkerMapper {

	int signUp(WorkerVO workerVO);
	WorkerVO login(WorkerVO workerVO);
	int checkId(String worker_id);
	int workStart(WorkerVO workerVO);
	int workEnd(@Param("worker_number") String worker_number,@Param("today") String today);
	int checkStart(@Param("worker_number") String worker_number,@Param("today") String today);
	int checkEnd(@Param("worker_number") String worker_number,@Param("today") String today);
	int realCheckEnd(@Param("worker_number") String worker_number,@Param("today") String today);

}
