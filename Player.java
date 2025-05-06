//Tarasidou Anna 

public abstract class Player 
{
	private String name;
	private int roundsWon = 0;
	private int score;
	
	public abstract int selectNumber();
	
	public Player(String name){
		if (name == null){
			System.out.println("Trouble creating player.");
			System.exit(0);
		}
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public int getRoundsWon(){
		return roundsWon;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setString(String newName){
		this.name = newName;
	}
	
	public int play(Player p2){
		score = 0;
		
		while(score < 27){
			score += this.selectNumber() + p2.selectNumber();
			System.out.println(this.getName() + " has " + score + " points ");
			System.out.println();
		}
		
		if(score > 31){
			System.out.println(this.getName() + " busted! ");
			p2.addWin();
		}
		return score;
	}
	
	public Player declareWinner(Player other){
		if (this.roundsWon > other.roundsWon){
			System.out.println(this.toString() + " has won the game! ");
			return this;
		}else if(this.roundsWon < other.roundsWon){
			System.out.println(other.toString() + " has won the game! ");
			return other;
		}else{
			System.out.println("No winner");
			return null;
		}
	}
	
	public String toString(){
		return "Player " + getName();
	}
	
	public void addWin(){
		this.roundsWon += 1;
	}
}