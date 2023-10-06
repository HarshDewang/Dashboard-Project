package com.datadashboard.dd.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datadashboard.dd.Entity.Dashboard;

public interface DataDashboardRepository extends JpaRepository<Dashboard, Long>{
	
	@Query(value = "SELECT * FROM blackcoffer.data where country = :country",nativeQuery = true)
	public List<Dashboard> findByCountry(String country);
	
	 @Query(value = "SELECT DISTINCT topic FROM blackcoffer.data WHERE topic IS NOT NULL", nativeQuery = true)
	 public   List<String> findTopics();

	 @Query(value = "SELECT DISTINCT sector FROM blackcoffer.data WHERE topic IS NOT NULL", nativeQuery = true)
	 public   List<String> findSector();

	 @Query(value = "SELECT id FROM blackcoffer.data ", nativeQuery = true)
	 public   List<Integer> findId();
	 
	 @Query(value = " SELECT DISTINCT country FROM blackcoffer.data WHERE country IS NOT NULL", nativeQuery = true)
	 public   List<String> findCountry();
	 
	 @Query(value = " SELECT DISTINCT region FROM blackcoffer.data WHERE region IS NOT NULL", nativeQuery = true)
	 public   List<String> findRegion();
	 
	 @Query(value = " SELECT DISTINCT city FROM blackcoffer.data WHERE city IS NOT NULL", nativeQuery = true)
	 public   List<String> findCity();
     
	 @Query(value = " SELECT intensity FROM blackcoffer.data", nativeQuery = true)
	 public   List<Integer> findintensity();

	 
	 @Query(value = " SELECT relevance FROM blackcoffer.data", nativeQuery = true)
	 public   List<Integer> findrelevance();
	 
	 @Query(value = " SELECT likelihood FROM blackcoffer.data", nativeQuery = true)
	 public   List<Integer> findlikelihood();


      
}
