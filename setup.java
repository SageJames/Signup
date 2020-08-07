/**
 * The setup class allows for user to make a txt file that is able to store thier file  there ppersonal data is a easy to acess file. No major data will be stored.
 *
 * @ author (Alcinder Lewis)
 * @ version 2020
 */

import java.io.*;
import java.util.Scanner;
public class setup {
	public setup() {
		File user = new File("User.txt");
		Scanner kb = new Scanner(System.in);
		String input;		
		try{ 
			if(! user.exist()){
				user.createNewFile();
				FileWriter writer = new FileWriter(user);
				User u = new User();
				writer.write("[Name] \n" + u.makeName() + "\n \n");
				System.out.println("Hi, " + u.getName() + ".");
				writer.write("[Age] \n" + u.makeAge() + "\n \n");
				System.out.println(u.getAge() +  " years old. Wow!");
				writer.write("[Sex] \n" + u.makeSex() + "\n \n");
				System.out.println("Your sex is " + u.getSex() + ".");
				writer.write("[Pronoun] \n" + u.makePronoun() + "\n \n");
				System.out.println("I will address you as " + u.getPronoun() + ".");
				writer.write("[Favorite Food] \n" + u.makeFood() + "\n \n");
				System.out.println("Your favorite food is " + u.getFavortieFood() + ".");
				writer.write("[Disliked thing to do] \n" + u.makeDislike() + "\n \n");
				System.out.println("So you hate " + u.getDislike() + ".");
				writer.write("[Liked thing to do] \n" + u.makeLike() + "\n \n");
				System.out.println("You like "  u.getLike() + ". Me too :>");
				write.close();
				System.out.println("File created have a nice day!");
			}
			else{
				boolean operate = true;
				while(operate) {
					System.out.println("There is a user file that currnetly exisit on here");
					System.out.println("Would you like to  delete this file?"); 
					System.out.println("[1] Yes \t [2] No ");
					int input = kb.nextInt(); 
					if (input == 1){
						user.delete();
						operate = false;
					}
					else if (input == 2 ){
						operate = false;
					}
					else {
						System.out.println("Invalid input try again");	
					}
				}

			}

		}
	}



}
