package com.techelevator.application.dao;

import java.util.List;

import com.techelevator.application.model.Matches;

public interface MatchesDAO {

	List<Matches> getAllMatches();
	List<Matches> getMatchById();
	Matches createAMatch();
	Matches deleteAMatch();
	List<Matches> getMatchesByDate();
	String updateAMatchId();
	Long updateStartDate();
	Long updateStartTime();
		
}