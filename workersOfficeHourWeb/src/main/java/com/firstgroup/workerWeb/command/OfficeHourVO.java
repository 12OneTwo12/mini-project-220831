package com.firstgroup.workerWeb.command;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfficeHourVO {

	int office_hour_id;
	int worker_number;
    LocalDate work_start;
    LocalDate work_end; 
	
}
