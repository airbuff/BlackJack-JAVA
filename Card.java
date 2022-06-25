
public class Card {
	private String rank;
	private char suit;

	public Card(String rank, char suit){
		this.rank=rank;
		this.suit=suit;
	}// close of constructor
	
	public String getRank(){
		return rank;
	}// close getRank method
	
	public char getSuit(){
		return suit;
	}//close getSuit method
	
	public int getPoint(){
		int Value = 0;
		if (rank.equals("J") || rank.equals("K") || rank.equals("Q")||rank.equals("A")) {
			Value = 10;
		} else {
			Value = Integer.parseInt(rank);
		}
		return Value;
	}//close getPoint method
	
	public String toString(){
		return rank + suit ; 
	}// close toString method
	
}// close class
