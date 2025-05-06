//Tarasidou Anna 

public class GameRounds
{
	private Player[] players = new Player[2];
	private int playerturn;
	
	
	public GameRounds(Player p1, Player p2){		
		this.players[0] = p1;
		this.players[1] = p2;
	}
	
	public void playRound(){
		Player p1 = players[0];
		Player p2 = players[1];
		
		System.out.println("--- " + p1.getName() + "'s turn ---");
		p1.play(p2);
		System.out.println();

		System.out.println("--- " + p2.getName() + "'s turn ---");
		p2.play(p1);
		
		if(p1.getScore() < 32 && p2.getScore() < 32){
			if(p1.getScore() < p2.getScore()){
				p2.addWin();
			}else if(p1.getScore() > p2.getScore()){
				p1.addWin();
			}else{
				System.out.println("It's a tie!");
				System.out.println("No points added!");
			}
		}
		System.out.println();	
	}
	
	public void printScore(){
		System.out.println(players[0].toString() + " : " + players[0].getRoundsWon());
		System.out.println(players[1].toString() + " : " + players[1].getRoundsWon());
	}
}