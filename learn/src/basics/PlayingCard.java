package basics;

public class PlayingCard {
	private	int rank;
	private	String suit;
	
	public PlayingCard(int rank, String suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank(){
		return rank;
	}
	
	public String getSuit(){
		return suit;
	}
	
	public String toString(){
		return new String ("["+rank+","+suit+"]"+"\n");
	}
	
}
