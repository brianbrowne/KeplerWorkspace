package testjames;

import java.util.Random;



public class rxdctfvyg {
	public static void main(String args[]){

		String [] anagram_1 = {"The Actuarial Control Cycle (ACC)","TSDMP","The general economic and commercial environment"
				,"Specifying the problem","Developing the solution","Monitoring the experience","Professionalism"};

		String [] anagram_2 = {"What makes the ACC actuarial","FIST AID MMM","Estimation of the financial impact of uncertain future events"
				,"Allow for the impact of legislation, regulation, taxation, competition","Recognition of stakeholders requirements and risk profiles","A long term rather than short term horizon"
				,"Use of assumptions based on appropriate historical experience","Interpretation of the results of modelling to enable practical strategies to be developed",
				"Decisions need to be made in the short term in light of likely future outcomes","Use of models to represent future financial outcomes",
				"Monitoring and periodically analysing the emerging experience","Modifying models/strategies in light of this emerging experience"};

		String [] anagram_3 = {"What actuaries do?","JAMMED CAR CAVIL","J","A","M","M","E","D","C","A","R","C","A","V","I","L"};

		String [] anagram_4 = {"How to be a professional","BASTARD","Being reliable (detail, quality, timeliness)","Acting with integrity and detachment from personal circumstances","Taking responsibility for decisions","Achieving/demonstrating/maintaining/improving competence"
								,"Recognising that others have valid views","Developing a direct and trusting relationship with the client"};
		
		//generate a random number for the anagrams
		Random randomNum = new Random();
	    int randomInt = randomNum.nextInt(4)+1;
	    System.out.println("Random Number "+ randomInt);
	    
	    String decider= Integer.toString(randomInt);
	    System.out.println(anagram_1[0]);
	    
	    String check1 = "anagram_" + randomInt;
	    System.out.println(check1);
	    //System.out.println(check1[0]);
		}

}
