
public class Card {
	final String []SUITS = {"Spades","Clubs","Hearts","Diamonds"};
	final String []FACES = {"Zero","Ace", "Two", "Three", "Four", "Five", "Six", 
							"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	private int suit;
	
	private int value;
	
	private boolean faceUp;
	
	// constructor
	// no return type
	// same name as class
	public Card(int s, int v){
		suit = s;
		value = v;
		faceUp = true;
	}
	
	 //return the blackjack value for the card
    //(2-10 for number cards, 10 for jack/queen/king, 11 for ace
    public int getValue()
   
    {
    	if (value == 1){
    		return 11;
    	}
    	if (value >= 10 && value <= 13){
    		return 10;
    	}
    	else{
    		return value;
    	}
    		
    	}
	public String toString()
	{
		//value + "of"+  suit
		
		String out = FACES[value] + " of "+  SUITS[suit];
		
		return out;
			
	}
	
}
