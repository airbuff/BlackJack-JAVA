
import java.util.Scanner;
public class BlackJoker {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);	
	String name = "Player";
	char option;
	boolean eNd = false;
	Player dealer = new Player("Dealer");
	Player player = new Player(name);
	CardDeck gameDeck = new CardDeck();
	
	System.out.println("Welcome to the game of BlackJoker!\n");
	System.out.print("Whats your name? ");
	name = userInput.next();
	
	System.out.print("Dealer: ");
	dealer.drawACard(gameDeck);
	dealer.displayAllCards();
	System.out.println("\tTotal: "+ dealer.getHandValues());
	dealer.drawACard(gameDeck);
	
	System.out.print(name+": ");
	player.drawACard(gameDeck);
	player.drawACard(gameDeck);
	player.displayAllCards();
	System.out.println("\tTotal: "+ player.getHandValues());
	
	if(player.hasBlackJoker() == true ){
		System.out.print("Dealer: ");
		dealer.displayAllCards();
		System.out.println("\n\n" + name + " has BlackJoker!!"+ name +" wins!!");
		eNd=true;
		}//close if statement
		if(dealer.hasBlackJoker() == true){
			System.out.print("Dealer: ");
			dealer.displayAllCards();
			System.out.println("\nDealer has BlackJoker!! Dealer wins!!");
			eNd=true;
		}//close if statement
	
	while(eNd!=true){
		
	System.out.print("Hit or Stand? ");
	option = userInput.next().charAt(0);
	option = Character.toUpperCase(option);

	switch (option) {
	case 'H': {
		if (player.getHandValues() < 21) {
			System.out.print(name+ ": ");
			player.drawACard(gameDeck);
		}// close if statment 
		player.displayAllCards();
		System.out.println("\tTotal " + player.getHandValues());
		
		if ( player.getHandValues() == 20) {
			
		
		}// close if statment
		if (player.getHandValues() > 20) {
			System.out.println(name + " Bust!!");
			eNd=true;
			}// close if statement
		
	}//close h case
		break;
	case 'S': {
		if(dealer.hasBlackJoker() == true ){
			System.out.println( "Dealer has BlackJoker!! Dealer Wins!!");
			eNd = true;
			break;
		}// close if statement
		
		while (dealer.getHandValues() < 17) {
			dealer.drawACard(gameDeck);
		}
		System.out.print("Dealer: ");
		dealer.displayAllCards();
		}// close while statement
	
		System.out.println("\t Total " + dealer.getHandValues());
		if (dealer.getHandValues() > 20) {
			System.out.println("Dealer Bust!!");
			eNd = true;
			break;
		}// close if statement
		
		if (dealer.getHandValues() >= 17) {
			if (player.getHandValues() < dealer.getHandValues()) {
				System.out.println("Player Lost!");
				eNd = true;
			}// close if statement
			
			if (player.getHandValues() == dealer.getHandValues()) {
				System.out.println("Player wins a tie");
				eNd = true;
			}//close if statement
			
			if (player.getHandValues() > dealer.getHandValues()) {
				System.out.println("Dealer lost!");
				eNd = true;
			}// close if statement
			
		}// close s case
	}// close switch
}// close while loop
	userInput.close();
}// close main method
	
}// close Blackjoker class
