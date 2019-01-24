package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
    private FortuneService fortuneService;
    
    public BaseballCoach(){};
    
    // define constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
    	fortuneService = theFortuneService;
    }
    
	@Override
	public String getdailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
			
		// use service to get a fortune
		return fortuneService.getFortune();
	}

}
