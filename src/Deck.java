
public class Deck {
	final String []SUITS = {"Spades","Clubs","Hearts","Diamonds"};
	final String []FACES = {"Zero","Ace", "Two", "Three", "Four", "Five", "Six", 
							"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	int MAX = 3;
	
	int suit = 0;
	int value = 1;
	private int numCards;
	private Card[] cards;
	private int topCardIndex;
	
	//constructor
	public Deck(){
		topCardIndex = 51;
		cards = new Card [52];
		
		
		
		for (int m = 0; m<= 51; m++){
			
		cards[m] = new Card(suit, value);
		//System.out.println(cards [m]);
		
			if (value == 13){
				suit++;
				value = 0;
			}
			
			value++;
		}
		
		}
	//return how many cards remain undealt
	
		public int numCardsLeft()
		{
			return topCardIndex + 1;		
			}

	    //"deals" a Card from the stack
		public Card nextCard()
		{
	        Card next = cards[topCardIndex];
	        topCardIndex--;
			return next;
		}
	public void shuffle()
	  {
			topCardIndex = 51;
			for (int k = 0; k< 100000; k++){
			int rand1 = (int)(Math.random() * 52);
			int rand2 = (int)(Math.random() * 52);
			
			Card tmp = cards[rand1];
			cards[rand1] = cards[rand2];
			cards[rand2] = tmp;
			
		    //your code here (need to fix)
			
			}
		  }
		 public String toString()
		 {
			 String out = "";

			 for(int i = 0;i < cards.length;i++)
			 {
			 out = out + cards[i] + "\n";
			 }

			 return out;
			 }
	

	//operations/methods
	//shuffle
	//pick/reveal a card
	//turn/show a card
	

}
