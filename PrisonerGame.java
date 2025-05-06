//Tarasidou Anna

import java.util.Scanner;

public class PrisonerGame
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to play (1). Human vs Computer, (2). Computer vs Computer or (3). Human vs Human?");
		int answer = scanner.nextInt();
		
		while(answer != 1 && answer != 2  && answer != 3){
			System.out.println("Wrong input!");
			System.out.println("Choose between 1, 2 or 3!");
			answer = scanner.nextInt();
		}
		scanner.nextLine();
		
		if (answer == 1){
			System.out.println("Choose the name of the player!");
			String name = scanner.next();
			
			Player player1 = new HumanPlayer(name);
			Player player2 = new ComputerPlayer("Computer");
			
			GameRounds game1 = new GameRounds(player1, player2);
			game1.playRound();
			game1.printScore();
				
			System.out.println("Do you want to play another round?");
			System.out.println("Choose y or Y for yes, n or N for no");
			
			String nextgame1 = scanner.nextLine();
			
			while(nextgame1.equals("y") || nextgame1.equals("Y")){
				game1.playRound();
				game1.printScore();
				System.out.println("Do you want to play another round?");
				nextgame1 = scanner.nextLine();
			}
			if(nextgame1.equals("n") || nextgame1.equals("N")){
				player1.declareWinner(player2);
			}
			
		}else if(answer == 2){
			Player player3 = new ComputerPlayer("Computer1");
			Player player4 = new ComputerPlayer("Computer2");
			
			GameRounds game2 = new GameRounds(player3, player4);
			game2.playRound();
			game2.printScore();
			
			System.out.println("Do you want to play another round?");
			String nextgame2 = scanner.nextLine();
			
			while(nextgame2.equals("y") || nextgame2.equals("Y")){
				game2.playRound();
				game2.printScore();
				System.out.println("Do you want to play another round?");
				nextgame2 = scanner.nextLine();
			}
			if(nextgame2.equals("n") || nextgame2.equals("N")){
				player3.declareWinner(player4);
			}
			
		}else{
			System.out.println("Choose the name of the first player!");
			String name1 = scanner.next();
			System.out.println("Choose the name of the second player!");
			String name2 = scanner.next();

			Player player5 = new HumanPlayer(name1);
			Player player6 = new HumanPlayer(name2);

			GameRounds game3 = new GameRounds(player5, player6);
			game3.playRound();
			game3.printScore();
			
			System.out.println("Do you want to play another round?");
			String nextgame3 = scanner.nextLine();
			
			while(nextgame3.equals("y") || nextgame3.equals("Y")){
				game3.playRound();
				game3.printScore();
				System.out.println("Do you want to play another round?");
				nextgame3 = scanner.nextLine();
			}
			if(nextgame3.equals("n") || nextgame3.equals("N")){
				player5.declareWinner(player6);
			}
		}
	}
}