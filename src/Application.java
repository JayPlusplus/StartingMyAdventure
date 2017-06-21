

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WELCOME TO MITCHELL'S TINY ADVENTURE!

		//You are in a creepy house!  Would you like to go "upstairs" or into the
		//"kitchen"?
		//> kitchen

		/*There is a long countertop with dirty dishes everywhere.  Off to one side
		there is, as you'd expect, a refrigerator. You may open the "refrigerator"
		or look in a "cabinet".
		> refrigerator

		Inside the refrigerator you see food and stuff.  It looks pretty nasty.
		Would you like to eat some of the food? ("yes" or "no")
		> no

		You die of starvation... eventually.*/
		/*
		 * You are in a creepy house!  Would you like to go "upstairs" or into the
"kitchen"?
> upstairs

Upstairs you see a hallway.  At the end of the hallway is the master
"bedroom".  There is also a "bathroom" off the hallway.  Where would you like
to go?
> bedroom

You are in a plush bedroom, with expensive-looking hardwood furniture.  The
bed is unmade.  In the back of the room, the closet door is ajar.  Would you
like to open the door? ("yes" or "no")
> no

Well, then I guess you'll never know what was in there.  Thanks for playing,
I'm tired of making nested if statements.
		 */
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to go upstairs or into the kitchen?");
		input = keyboard.next();
		if (input.equals("kitchen")) {
			System.out.println("Welcome to my dirty kitchen");
			System.out.println("Would you like to open refrigerator or cabinet");
			input = keyboard.next();
			if (input.equals("refrigerator")) {
				System.out.println("Welcome to the nasty refrigerator!");
				System.out.println("Would you like to eat some of the food?");
				input = keyboard.next();
						if (input.equals("no")) {
							System.out.println("You die of starvation");
							}
						if (input.equals("yes")) {
								System.out.println("Good for you");
							}
						}
			if (input.equals("cabinet")){
				System.out.println("Don't move! Stay in there!");		
			}
		}
		if (input.equals("upstairs")) {
			System.out.println("Welcome to my luxury upstair");
			System.out.println("Would you like to go to bedroom or bathroom?");
			input = keyboard.next();
			if (input.equals("bedroom")) {
				System.out.println("Welcome to my plush bedroom!");
				System.out.println("Would you like to open the door?");
				input = keyboard.next();
				if (input.equals("yes")) {
					System.out.println("Good for you! I'm done!");
				}
				if (input.equals("no")) {
					System.out.println("Shame. You will never know what's in there!");
				}
			}
			if (input.equals("bathroom")) {
				System.out.println("Take your time! I will be back later! or not!");
			}
		}
	}

}
