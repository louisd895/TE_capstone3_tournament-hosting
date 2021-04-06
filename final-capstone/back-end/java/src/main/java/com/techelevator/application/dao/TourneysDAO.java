package com.techelevator.application.dao;

import java.time.LocalDate;
import java.util.List;

import com.techelevator.application.model.*;

public interface TourneysDAO {
	
	List<Tourneys> getAllTourneys();
	List<Tourneys> getTourneysByName(String username);
	void createATourney(String tourneyName, String tourneyDesc, String tourneyHost, LocalDate startDate, LocalDate endDate, boolean isActive, boolean regIsActive, int numOfParticipants, int maxNumOfParticipants);
	Tourneys deleteATourney();
	Tourneys updateATourney();
	List<Tourneys> getTourneysByDate();
	String updateATourneyName();
	String updateATourneyDesc();
	Long updateStartDate();
	Long updateEndDate();
	boolean updateStatus();
	int changeNumOfParticipants();
	Long updateStartTime();
	
}