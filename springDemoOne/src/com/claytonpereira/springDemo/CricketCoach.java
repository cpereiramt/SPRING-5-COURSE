package com.claytonpereira.springDemo;

public class CricketCoach implements Coach {
    // dependency to be injected in setter
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Email address is " + emailAddress);
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("team name is " + team);
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
		
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
