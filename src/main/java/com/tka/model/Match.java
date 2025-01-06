package com.tka.model;

public class Match {
	private int Id;
	private String teamOneName;
	private String teamTwoName;
	private String date;
	private String venue;
	private String result;
	
	public Match() {
		
	}

	public Match(int id, String teamOneName, String teamTwoName, String date, String venue, String result) {
		super();
		Id = id;
		this.teamOneName = teamOneName;
		this.teamTwoName = teamTwoName;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTeamOneName() {
		return teamOneName;
	}

	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}

	public String getTeamTwoName() {
		return teamTwoName;
	}

	public void setTeamTwoName(String teamTwoName) {
		this.teamTwoName = teamTwoName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [Id=" + Id + ", teamOneName=" + teamOneName + ", teamTwoName=" + teamTwoName + ", date=" + date
				+ ", venue=" + venue + ", result=" + result + "]";
	}
	
	

}
