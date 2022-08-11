import java.util.Scanner;

public class LoLTextGame {
	public static void intro() {
		System.out.println("Hello and welcome to the League of Legends text-based game.\n"
				+ "In this game you will be making a vareity of decisions, it is up to you to choose the correct ones that will lead you to victory!\n"
				+ "I wish you the best of luck!\n"
				+ "Pre-game tip: All multiple choice questions will have what you need to type in double quotes, \"like this\" \n"
				+ "or will give you letters with options and you need to type the letter\n" + "\n"
				+ "Now, to start... What is your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println();
	}

	public static void scene1() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(
				"You log into League and reflect on your life. Do you wish to continue to play League or stop?\n"
						+ "A) Stop Playing League forever\n" + "B) Don't play for today and play tomorrow\n"
						+ "C) Continue to play League");
		String option = keyboard.nextLine();
		if (option.equalsIgnoreCase("A")) {
			scene1optionA();
		} else if (option.equalsIgnoreCase("B")) {
			scene1optionB();
		} else if (option.equalsIgnoreCase("C")) {
			scene2();
		} else {
			System.out.println("Invalid Reponse!");
			scene1();
		}
	}

	public static void scene1optionA() {
		System.out.println(
				"You leave your computer and go outside to touch some grass. You're mind is elevated and you start to feel happiness again... \n"
						+ "You got the Freedom Ending!");
	}

	public static void scene1optionB() {
		System.out.println("The next day comes around");
		System.out.println();
		scene2();
	}

	public static void scene2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You click on draft pick and lock in Jungle and Top.\n"
				+ "Once you get into the game you get the Jungle Role and find yourself hovering over two champions, \n"
				+ "and third crosses your mind, but you refuse to play that character.\n"
				+ "Which do you choose, \"Kayn\" or \"Viego\"?");
		String champ = keyboard.nextLine();
		if (champ.equalsIgnoreCase("Master Yi") || champ.equalsIgnoreCase("Yi")) {
			scene2optionMasterYi();
		} else if (champ.equalsIgnoreCase("Viego")) {
			scene2optionViego();
		} else if (champ.equalsIgnoreCase("Kayn")) {
			scene2optionKayn();
		} else {
			System.out.println("Invalid Response!");
			scene2();
		}

	}

	public static void scene2optionMasterYi() {
		System.out.println("You choose braindead Master Yi... \n"
				+ "You make sure to go the right runes and you ended up getting fed and 1v9 while the enemy couldn't even touch you... \n"
				+ "You've won, but at what cost? You got the Easter Egg Ending!");

	}

	public static void scene2optionViego() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You ended up taking the wrong runes into the game. \n"
				+ "You go 0/10/0 and your team flames you when you lose the game.... You got the Bad Ending!\n"
				+ "Would you like to play again? \"Yes\" or \"No\"");
		String PlayAgain = keyboard.nextLine();
		if (PlayAgain.equalsIgnoreCase("Yes")) {
			scene2();
		} else if (PlayAgain.equalsIgnoreCase("No")) {
			System.out.println("Good Choice...");
			// I decided not to create a method for the else if because it's just one text line
			// If I do want to make a major change to it, then I'll create a method.
		} else {
			System.out.println("Invalid Reponse!");
			scene2optionViego();
		}
	}

	public static void scene2optionKayn() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Will you prove worthy? Probably not...\n" + "You choose Kayn but what form are you planning on going?\n"
				+ "\"Blue\" or \"Red\" ");
		String form = keyboard.nextLine();
		if (form.equalsIgnoreCase("Red")) {
			scene3Red();
		} else if (form.equalsIgnoreCase("Blue")) {
			// put scene3Blue here
		} else {
			System.out.println("Invalid Reponse!");
			scene2optionKayn();
		}
	}

	public static void scene3Red() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The river will be painted blood red with the crys of our enemies >:)\n"
				+ "since you are going red form, you make sure to take Rhaast Runes.\n"
				+ "You load into the game on bot side map and you're team asks if you want to \"Invade\" or \"Not\"");
		String InvadeNot = keyboard.nextLine();
		if (InvadeNot.equalsIgnoreCase("Invade")) {
			scene3Invade();
		} else if (InvadeNot.equalsIgnoreCase("Not")) {
			scene3NoInvade();
		} else {
			System.out.println("Invalid Reponse!");
			scene3Red();
		}
	}

	public static void scene3NoInvade() {
		System.out.println(
				"You call off the invade and start your red side and do a full clear, then you see top can be ganked so you gank and get a kill, \n"
						+ "fortunately it was a melee top laner so you ended up getting red form\n");
		scene3RedIdkWhatToCallThis();
	}

	public static void scene3RedIdkWhatToCallThis() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("As the game goes on you play aggressive and get a couple kills and items. \n"
				+ "You're not that fed but you are still doing good. But not all goes as planned, the enemy ADC starts to scale a lot. \n"
				+ "You then find yourself in a situation where it is you versus the ADC, Do you \n"  
				+ "A) Go in \n"
				+ "B) Wait for team");
		String WaitGo = keyboard.nextLine();
		if (WaitGo.equalsIgnoreCase("A")) {
			scene3LimitTested();
		} else if (WaitGo.equalsIgnoreCase("B")) {
			scene3Darkin();
		} else {
			System.out.println("Invalid Reponse!");
			scene3RedIdkWhatToCallThis();
		}
	}
	
	public static void scene3Darkin() {
		System.out.println("You wait for your team and teamfight. \n"
				+ "You are the front line and smash right through the enemy while healing all the damage you're taking, you rush their base and get their Nexus. GG! \n"
				+ "You got the Bathed in Darkin' Red Ending!");
	}
	
	public static void scene3LimitTested() {
		System.out.println("You go in and get kited and killed, without you. \n"
				+ "Your team can't teamfight so the enemy gets an ace, Good Job... \n"
				+ "The enemies destroy your Nexus and you lose the game. You got the Limit Test Ending!");
	}
	
	public static void scene3Invade() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which enemy side would you like to invade, enemy \"top\" which is their red side, or enemy \"bot\" which is their blue side?");
		String TopBot = keyboard.nextLine();
		if (TopBot.equalsIgnoreCase("Top")) {
			scene3InvadeTopRed();
		} else if (TopBot.equalsIgnoreCase("Bot")) {
			scene3InvadeBotRed();
		} else {
			System.out.println("Invalid Reponse!");
			scene3Invade();
		}
	}
	
	public static void scene3InvadeTopRed() {
		System.out.println("You invade their entire top side and see that the enemy top lane can be ganked so you gank them and get a kill. \n"
				+ "They were melee so you got red form, Good for you!");
		scene3RedIdkWhatToCallThis();
	}
	
	public static void scene3InvadeBotRed() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You invade their entire bot side and see that the enemly bot lane can be ganked so you gank them and get a double kill. \n "
				+ "Unfortunately, they were both ranged so you got Blue Form. \n"
				+ "Do you go \"Blue Form\" or wait for \"Red Form\"?");
		String InGameForm = keyboard.nextLine();
		if (InGameForm.equalsIgnoreCase("Blue Form")) {
			BluesierEnding();
		} else if (InGameForm.equalsIgnoreCase("Red Form")) {
			LateFormEnding();
		} else {
			System.out.println("Invalid Reponse!");
			scene3InvadeBotRed();
		}
	}
	
	public static void BluesierEnding() {
		System.out.println("You don't feel like waiting so you go Blue Form, but continue to go Bruiser Items, it works out quite well. \n"
				+ "You didn't carry but you didn't int either. \n"
				+ "Good job! You got the Bluesier Ending!");
	}
	
	public static void LateFormEnding() {
		System.out.println("You decide to wait for red form but it takes to long and the enemy builds too much of an advantage, there is nothing you can do. \n"
				+ "The enemy takes your Nexus... You got the Late Form Ending!");
	}

	public static void main(String[] args) {
		intro();
		scene1();

	}
}
