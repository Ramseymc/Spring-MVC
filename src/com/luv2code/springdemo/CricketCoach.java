package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method - setTeam");
		this.team = team;
	}

	public CricketCoach(){
		System.out.println("CricketCoach: Inside no arg constructor");
	};
	
	// setter method 
	public void setFortuneService(FortuneService fs) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fs;
	}

	@Override
	public String getdailyWorkout() {
		// TODO Auto-generated method stub
		return "Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Umpire says:" + fortuneService.getFortune();
	}
}
