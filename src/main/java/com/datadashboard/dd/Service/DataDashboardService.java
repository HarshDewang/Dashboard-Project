package com.datadashboard.dd.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.datadashboard.dd.DTO.DataDashboardDTO;
import com.datadashboard.dd.Entity.Dashboard;

public interface DataDashboardService {
	
	List<DataDashboardDTO> getAllData();
	ResponseEntity<Dashboard> getDashboardById ();
	
}
