package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {
	
    private FortuneService fortuneService;
    
    public SwimmingCoach(){
    	System.out.println("SwimmingCoach: Inside no arg constructor");
    };
    
    // define constructor for dependency injection
    public SwimmingCoach(FortuneService theFortuneService) {
    	fortuneService = theFortuneService;
    }
    
	@Override
	public String getdailyWorkout() {
		return "Do 10 laps";
	}
	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
}
