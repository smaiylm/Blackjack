import java.util.Scanner;

public class BlackJack
{
    private player player;
    private Dealer dealer;
    
	public BlackJack()
	{
		System.out.println("Welcome to Blackjack!");
		player = new player();
		dealer = new Dealer();
		//dealer.getHandSize() = new int k;

	}

    //play a game of blackjack with one player and one dealer
	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		boolean playAgain = true;
		// 
		while (playAgain == true){
			
			dealer.shuffleDeck();
			player.resetHand();
			dealer.resetHand();
			dealer.addCardToHand(dealer.dealCard());
			dealer.addCardToHand(dealer.dealCard());
			player.addCardToHand(dealer.dealCard());
			player.addCardToHand(dealer.dealCard());
			
			System.out.println("The dealer's card is: " + dealer.visible());
			System.out.println(player);
			
			System.out.println("Hit or Stay? Press 1 if hit, press 2 if stay");
			int k = keyboard.nextInt();
			
			
			// Making sure if the dealer goes over 21 and has an ace, the ace turns into 1
			
			boolean hasAce = false;
			// Check for the value of Ace - if it's 11, there is an ace!
			
			
			
			while(k==1 && player.getHandValue() <= 21){
				
				player.addCardToHand(dealer.dealCard());
				System.out.println(player);
				if(player.getHandValue() <= 21){
				System.out.println("Hit or Stay? Press 1 if hit, press 2 if stay");
				k = keyboard.nextInt();
				}
			}
			
			
			
			
			
			while (dealer.hit() && player.getHandValue()<= 21){
				dealer.addCardToHand(dealer.dealCard());
			}
			System.out.println(dealer);
			
			// checks win conditions
			if(player.getHandValue() >  21 || player.getHandValue() == dealer.getHandValue()){
				dealer.countWin();
				System.out.println("Sorry, but the dealer won.");
			}
			
			else if(dealer.getHandValue() > 21){
				player.countWin();
				System.out.println("Congratulations! You won!");
			}
			
			else if(player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21){
				player.countWin();
				System.out.println("Congratulations! You won!");
				
			}
			
			else if (dealer.getHandValue() > player.getHandValue() && dealer.getHandValue() <= 21){
				dealer.countWin();
				System.out.println("Sorry, but the dealer won.");
	
			}
			// game of black jack ends
			System.out.println("Do you want to play again? If yes, press 1, if not, press 2");
			int f = keyboard.nextInt();
			if(f == 2){
				playAgain = false;
				System.out.println("The amount of games you won: " + player.getWinCount ());
			}
			else{
				playAgain = true;
			}
					
		}
		// while (playAgain == true)
		// game loop start
		//shuffle cards
		// Cards dealt (only one of dealer's cards is visible)
		// Player is asked hit or stay?
		//Player decides 
		// If hit
			// get card
		// ....
		// if stay
			// dealer's turn straight away (hit/turn)
		// who wins?
		//count the win (whoever won)
		// Reset 
		// Ask if the player wants to play again
		//Play again
		/*if (player == player.w){
			System.out.println("Congratulations player, you won! Do you want to play again?");
		}*/
		 
	       

	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}
