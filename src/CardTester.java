
public class CardTester {
		public static void main(String[] args){
			
			/*Deck k = new Deck();
			k.shuffle();
			System.out.println(k.toString());
			Deck m = new Deck();
			m.numCardsLeft();
			System.out.println(m.numCardsLeft());*/
			
				
				Dealer dlr = new Dealer();
				
				dlr.addCardToHand(new Card(1,1));
				dlr.addCardToHand(new Card(2,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				dlr.addCardToHand(new Card(3,1));
				
				System.out.println(dlr);
			
				
				
		}
}
