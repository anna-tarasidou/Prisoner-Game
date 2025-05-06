//Tarasidou Anna 

import java.util.Scanner;

public class HumanPlayer extends Player
{
	public HumanPlayer(String name){
		super(name);
	}
	
	public int selectNumber(){
		Scanner input = new Scanner(System.in);
		System.out.print("Give number between 1-5:");
	
		int number = input.nextInt();
		while(number < 1 || number > 5){
			System.out.println("Not valid number!");
			System.out.print("Give number 1-5:");
			number = input.nextInt();
		}
		System.out.println("Player " + getName() + " selected " + number);
		
		return number;
	}
}