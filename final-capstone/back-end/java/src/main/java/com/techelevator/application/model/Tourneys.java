package com.techelevator.application.model;

import java.time.LocalDate;

public class Tourneys {
	private Long tourneyId;
	private String tourneyName;
	private String tourneyDesc;
	private int tourneyHost;
	private LocalDate startDate;
	private LocalDate endDate;
	private  boolean isActive = true;
	private boolean openForReg = true;
	private int numOfParticpants;
	
	public Long getTourneyId() {
		return tourneyId;
	}
	public void setTourneyId(Long tourneyId) {
		this.tourneyId = tourneyId;
	}
	public String getTourneyName() {
		return tourneyName;
	}
	public void setTourneyName(String tourneyName) {
		this.tourneyName = tourneyName;
	}
	public String getTourneyDesc() {
		return tourneyDesc;
	}
	public void setTourneyDesc(String tourneyDesc) {
		this.tourneyDesc = tourneyDesc;
	}
	public int getTourneyHost() {
		return tourneyHost;
	}
	public void setTourneyHost(int tourneyHost) {
		this.tourneyHost = tourneyHost;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isOpenForReg() {
		return openForReg;
	}
	public void setOpenForReg(boolean openForReg) {
		this.openForReg = openForReg;
	}
	public int getNumOfParticpants() {
		return numOfParticpants;
	}
	public void setNumOfParticpants(int numOfParticpants) {
		this.numOfParticpants = numOfParticpants;
	}
	@Override
	public String toString() {
		return "Tourneys [tourneyId=" + tourneyId + ", tourneyName=" + tourneyName + ", tourneyDesc=" + tourneyDesc
				+ ", tourneyHost=" + tourneyHost + ", startDate=" + startDate + ", endDate=" + endDate + ", isActive="
				+ isActive + ", openForReg=" + openForReg + ", numOfParticpants=" + numOfParticpants + "]";
	}
	}