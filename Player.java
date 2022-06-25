
public class Player {

	private String name;
	private Card[] cards = new Card[52];
	private int totalCards = 0;
	
	public Player (String name){
		this.name=name;
	}// close constructor
	
	public String getName(){
		return name;
	}// close getName method
	
	public void drawACard(CardDeck cards){
		this.cards[totalCards] = cards.drawNextCard();
		totalCards++;
	}// close drawACard method
	
	public int getHandValues(){
		int i=0, total =0;
		while(i< totalCards){
			total += cards[i].getPoint();
			i++;
		}// close while loop
		return total;
	}// close getHandvalues method
	
	public void displayAllCards(){
		for(int i=0; i< totalCards; i++){
			System.out.print(cards[i]+" ");
		}// close for loop
	}// close displayAllCards
	
	public boolean hasBlackJoker(){
		boolean Statement = false;
		char black[] = {'c','s'};
		char red[] ={'h','d'};
		
		for(int i=0; i< totalCards; i++){
			if(cards[totalCards-1].getSuit() == black[i] && cards[totalCards-2].getSuit() == black[i] || cards[totalCards-1].getSuit() == red[i] && cards[totalCards-2].getSuit() == red[i] ){
				if(cards[totalCards-1].getPoint() == 10 && cards[totalCards-2].getPoint() == 10 ){
					Statement = true;
			}// close if statement
			}// close if statement
				}// close for statement
			
		return Statement;
	}// close hasBlackJoker 
}// close class
