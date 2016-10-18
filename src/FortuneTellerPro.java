


	

	import java.util.Scanner;

	public class FortuneTellerPro 
		
		
	{ 

		public static void main(String[] args) 
		
		{
			
			  Scanner userInput = new Scanner(System.in);
			// Part 1
			 
			String [] color = new String[7];
			  
			  
			        color [0] = "Red";
			        color [1] = "Orange";
			        color [2] = "Yellow";
			        color [3] = "Green";
			        color [4] = "Blue";
			        color [5] = "Indigo";
			        color [6] = "Violet";
			        
			 String [] month = new String[12];  
			 
			        month[0] = "January";
			        month[1] = "February";
			        month[2] = "March";
			        month[3] = "April";
			        month[4] = "May";
			        month[5] = "June";
			        month[6] = "July";
			        month[7] = "August";
			        month[8] = "September";
			        month[9] = "October";
			        month[10] = "November";
			        month[11] = "December";
			              
			
			            		  
			  
			       
			//Ask user to input info and store them
			
			
			   System.out.println("What is your first name? ");
			   String firstName = userInput.next();
			   
			   System.out.println("What is your last name? ");
			   String lastName = userInput.next();
			   
	//User age defines in what year they will retire
			   
			   System.out.println("What is your age? ");
			   int userAge = userInput.nextInt();
			   

	 		   
			   System.out.println("What is your birth month? ");
			   
			   String bMonth = userInput.next();
			       
			  // int birthMonth = userInput.nextInt();
			   
			   
	//User ROYGBIV fav color defines their mode of transportation
			   
			   System.out.println("WHat is your favorite ROYGBIV color? ");
			   		   
			   System.out.println ("To find out what ROYGBIV is please type \"Help\"");
			   String favROY = userInput.next("Help|help");
			  
			      
			   
			   System.out.println("ROYGBIV stands for :Red");
			   System.out.println("ROYGBIV stands for :Orange");
			   System.out.println("ROYGBIV stands for :Yellow");
			   System.out.println("ROYGBIV stands for :Green");
			   System.out.println("ROYGBIV stands for :Blue");
			   System.out.println("ROYGBIV stands for :Indigo");
			   System.out.println("ROYGBIV stands for :Violet");
			   
			   String favRoy1 = userInput.next();
			   
			 
	//User number of siblings defines which location they will live in	 	   
			   
			   System.out.println("How many sibblings do you have? ");
			   int userSibblings = userInput.nextInt();
			        
			   String location;
				  
			     
			    	   
			       
			        
			        	 
			         
			   
			 //Part Two
			 //Conditions
			   System.out.println("Dear "  + firstName +" "+ lastName    );
			   //1)Age odd or even
			   if (userAge %2 == 0)
			   {System.out.println("You will retire in 10 years ");}
			    
			   else {
				   System.out.println("You will retire in 15 years ");
			   }
			   
			  
				
				
				
				userInput.close();
				
		}
	     
	}
