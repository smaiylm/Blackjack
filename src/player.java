import java.util.Arrays;



public class player

{

    private Card[] hand;

    private int nextIndex;

    private int winCount;

    

    

    //constructor(s)
    public player (){
    	hand = new Card[12];
    	nextIndex = 0;
    	winCount = 0;

    	
    	
	
}
    

    //add temp to this player's hand

    public  void addCardToHand( Card temp )

    { 
    	hand[nextIndex] = temp;
    	nextIndex++;
    	

        

    }

    

    //"discard" the Player's hand when a new round begins

    public  void resetHand()

    {

    	nextIndex = 0;
        for(int i =  0; i< hand.length; i++){
     	   hand[i] = null;
        }

    }

    

    //increment the player's win count

    public void countWin() {

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
    	int NumberofAces = 0;
    	int total = 0;
        for(int k = 0; k< getHandSize(); k++){
        	total = hand[k].getValue() + total;
        	if (hand[k].getValue() == 11){
        		NumberofAces ++;
        	}
        }
    	/*Another way of doing
    	for(int i = 0; i < hand.length; i++){
    		if(hand[i] != null)
    		total = total + hand[i].getValue();
    		
    	}
    	*/
    	
        while (NumberofAces > 0 && total > 21){
			total = total - 10;
			NumberofAces --;}
        return total;

    }

    

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
        return "Player's hand = " + "[" + out + "]" + " \n-  # wins " + winCount;
    }

}