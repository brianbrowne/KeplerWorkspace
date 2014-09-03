package testjames;

import java.util.Random;
import java.util.Scanner;

public class James_Test {



	public static void main(String args[]){

			//generate a random number for the anagrams
			Random randomNum = new Random();
		    int randomInt = randomNum.nextInt(4)+1;
		    
		    	    
			if(randomInt == 1){
				String [] anagram_1 = {"The Actuarial Control Cycle (ACC)","TSDMP","The general economic and commercial environment"
						,"Specifying the problem","Developing the solution","Monitoring the experience","Professionalism"};
				//String title = "The Actuarial Control Cycle (ACC)";
				//String Acronym = "TSDMP";
				String title1 = anagram_1[0];
				System.out.println(title1);
				String Acronym = anagram_1[1];
				
				String username = null;
				Scanner in = new Scanner(System.in);
		        System.out.print("Please enter acronym : ");
		        username = in.nextLine();       
		        System.out.println("You entered : " + username);
				
				if(Acronym.equals(username)){
					System.out.println("You have guessed the right answer. Acronym = "+ Acronym);
				}else{
					System.out.println("You have guessed incorrectly. Your guess = "+username+" correct answer = "+Acronym);
				}
				
				
			}
			
			if(randomInt == 2){
				String [] anagram_2 = {"What makes the ACC actuarial","FIST AID MMM","Estimation of the financial impact of uncertain future events"
					,"Allow for the impact of legislation, regulation, taxation, competition","Recognition of stakeholders requirements and risk profiles","A long term rather than short term horizon"
					,"Use of assumptions based on appropriate historical experience","Interpretation of the results of modelling to enable practical strategies to be developed",
					"Decisions need to be made in the short term in light of likely future outcomes","Use of models to represent future financial outcomes",
					"Monitoring and periodically analysing the emerging experience","Modifying models/strategies in light of this emerging experience"};
				
				String title1 = anagram_2[0];
				System.out.println(title1);
				String Acronym = anagram_2[1];
				
				String username = null;
				Scanner in = new Scanner(System.in);
		        System.out.print("Please enter acronym : ");
		        username = in.nextLine();       
		        System.out.println("You entered : " + username);
				
				if(Acronym.equals(username)){
					System.out.println("You have guessed the right answer. Acronym = "+ Acronym);
				}else{
					System.out.println("You have guessed incorrectly. Your guess = "+username+" correct answer = "+Acronym);
				}
				
				
				
			}
			
			if(randomInt == 3){
				String [] anagram_3 = {"What actuaries do?","JAMMED CAR CAVIL","J","A","M","M","E","D","C","A","R","C","A","V","I","L"};
				
				String title1 = anagram_3[0];
				System.out.println(title1);
				String Acronym = anagram_3[1];
				
				String username = null;
				Scanner in = new Scanner(System.in);
		        System.out.print("Please enter acronym : ");
		        username = in.nextLine();       
		        System.out.println("You entered : " + username);
				
				if(Acronym.equals(username)){
					System.out.println("You have guessed the right answer. Acronym = "+ Acronym);
				}else{
					System.out.println("You have guessed incorrectly. Your guess = "+username+" correct answer = "+Acronym);
				}
				
			}
			
			if(randomInt == 4){
				String [] anagram_4 = {"How to be a professional","BASTARD","Being reliable (detail, quality, timeliness)","Acting with integrity and detachment from personal circumstances","Taking responsibility for decisions","Achieving/demonstrating/maintaining/improving competence"
									,"Recognising that others have valid views","Developing a direct and trusting relationship with the client"};
				
				String title1 = anagram_4[0];
				System.out.println(title1);
				String Acronym = anagram_4[1];
				
				String username = null;
				Scanner in = new Scanner(System.in);
		        System.out.print("Please enter acronym : ");
		        username = in.nextLine();       
		        System.out.println("You entered : " + username);
				
				if(Acronym.equals(username)){
					System.out.println("You have guessed the right answer. Acronym = "+ Acronym);
				}else{
					System.out.println("You have guessed incorrectly. Your guess = "+username+" correct answer = "+Acronym);
				}
			}
			
		    
	}
}
