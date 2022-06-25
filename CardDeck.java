
import java.util.Random;
public class CardDeck {

	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private char[] suits = { 's', 'h' , 'd', 'c' };
	private Card[] cards = new Card[52];
	private int currentCard=0;
	
	public CardDeck(){
		
		int j=0,cardNo=0;
		while(j < suits.length){
			for(int i= 0; i < ranks.length; i++){
				cards[cardNo] = new Card(ranks[i],suits[j]);
				cardNo++;
				}// close for loop
		j++;
		}// close if statement
		shuffle();
		
	}// close constructor
	
	public Card drawNextCard(){
	if(currentCard<cards.length){
		currentCard++;
	}//close if statement
	
	return cards[currentCard];	
	}// close drawNextCard method
	
	private void shuffle(){
		
		Random shuffler = new Random();
		for (int initial = 0; initial < cards.length; initial++) {
			int second = shuffler.nextInt(cards.length);
			Card Temp = cards[initial];
			cards[initial] = cards[second];
			cards[second] = Temp;
		}// close for loop
		
	}//close shuffle method
	
}// close Class
