import java.util.Arrays;

public class Dealer
{
	private Deck deckOfCards;
    private Card[] hand;
    private int nextIndex;
    private int winCount;
   
    //constructor(s)
    public Dealer(){
    	
    	nextIndex = 0;
    	winCount = 0;
    	hand = new Card[12];
    	deckOfCards = new Deck();
    }
    //add temp to this player's hand
    public  void addCardToHand( Card temp )
    {
       
    	hand[nextIndex] = temp;
    	nextIndex++;
    	

        
       
    }
    
    //"discard" the dealer's hand when a new round begins
    public  void resetHand( )
    {
    	nextIndex = 0;
        for(int i =  0; i< hand.length; i++){
     	   hand[i] = null;
        }
    }
    
    //increment the dealer's win count
    public void countWin()
    {
    	 winCount ++;
    }
    
    //return this player's win count
    public int getWinCount()
    {
    	return winCount;
    }
    
    //return the number of cards in hand
    public int getHandSize()
    {
    	int sum = 0;
    	for(int x = 0; x< hand.length; x++){
    		
    		if (hand[x] != null){
    			sum ++;
    		}
    	}
    	return sum;
    }
    
    //compute the value of
    public int getHandValue()
    {
    	//counts number of aces
    	int NumberofAces = 0;
    	int total = 0;
        for(int k = 0; k< getHandSize(); k++){
        	total = hand[k].getValue() + total;
        	if (hand[k].getValue() == 11){
        		NumberofAces ++;
        	}
        }
        
    	/*
    	for(int i = 0; i < hand.length; i++){
    		if(hand[i] != null)
    		total = total + hand[i].getValue();
    		
    	}
    	*/
        
        while (NumberofAces > 0 && total > 21){
    			total = total - 10;
    			NumberofAces --;
        }
        return total;
        
    }
    //fix later
    public String toString()
    {
    	
    	String out = "";
    	for(int j = 0; j < hand.length; j++){
    		if(hand[j] != null){
    			out = out + hand[j];
    			if(j + 1 <11){
    				if(hand[j+1] != null ){
    					out = out + ", ";
    				}
    			}
    		}
    	}
        return "Dealer's hand = " + "[" + out + "]" + " \n-  # wins " + winCount;
    }

	//shuffle the deck
    public void shuffleDeck()
    {
        deckOfCards.shuffle();
    }

	//get the next card from the deckOfCards and return it
    public Card dealCard()
    {
        return deckOfCards.nextCard();
    }
    public Card visible(){
    	return hand[0];
    }


    //return true if the dealer hits, false if not
	public boolean hit()
	{
		if(getHandValue() <= 16){
			return true;
		}
		else {
			return false;
		}
	}
}