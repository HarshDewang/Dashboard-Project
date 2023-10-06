package com.datadashboard.dd.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.datadashboard.dd.Entity.Dashboard;
import com.datadashboard.dd.Repository.DataDashboardRepository;

@RestController
@CrossOrigin
@RequestMapping("api/v1/dashboard")
public class DataDashboardController {

	
	@Autowired
	private DataDashboardRepository dataDashboardRepository;
	 // Example API to get all data
    @GetMapping("/allData")
    public List<Dashboard> getAllData() {
        return dataDashboardRepository.findAll();
    }
    
    @GetMapping("/databyid/{id}")
    public ResponseEntity<Dashboard> getDashboardById (@PathVariable long id){
    	Optional<Dashboard> dashboardOptional = dataDashboardRepository.findById(id);
        if (dashboardOptional.isPresent()) {
            Dashboard dashboard = dashboardOptional.get();
            return ResponseEntity.ok(dashboard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }	
    
 // API to get data by year
    @GetMapping("/filterBycountry/{country}")
    public List<Dashboard> getDashBoardByCountry(@PathVariable String country) {
    	System.out.println("***************************");
    	System.out.println(country);
        return dataDashboardRepository.findByCountry(country);
    }
    
    @GetMapping("/listoftopics")
    public List<String> listTopics() {
        return dataDashboardRepository.findTopics();
    
    }
    
    @GetMapping("/listofsector")
    public List<String>findSector() {
        return dataDashboardRepository.findSector();
    
    }
    
    @GetMapping("/ids")
    public List<Integer> findId() {
        return dataDashboardRepository.findId();
    }
    @GetMapping("/getCountry")
    public   List<String>findCountry(){
    	return dataDashboardRepository.findCountry();
    }
    
    @GetMapping("/getregion")
    public   List<String>findRegion(){
    return dataDashboardRepository.findRegion();
    }
    
    @GetMapping("/getcity")
    public   List<String>findCity(){
    return dataDashboardRepository.findCity();
    }
    
    @GetMapping("/getintensity")
    public   List<Integer>findintensity(){
    return dataDashboardRepository.findintensity();
    }
    
    @GetMapping("/getrelevance")
    public   List<Integer>findrelevance(){
    return dataDashboardRepository.findrelevance();
    }
    
    @GetMapping("/getlikelihood")
    public   List<Integer>findlikelihood(){
    return dataDashboardRepository.findlikelihood();
    }
}
