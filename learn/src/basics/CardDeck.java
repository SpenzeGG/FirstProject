package basics;

public class CardDeck {
	//private static int NUMBER_OF_CARDS = 52;
	private PlayingCard[] cards;
	private int size;
	private int ranks;
	private String[] suits = {"Spade","Heart","Diamond", "Club"};
	
	public CardDeck (int numberOfRanks){
		size = numberOfRanks*4;
		ranks = numberOfRanks;
		cards = makeDeck(ranks);
	}
	
	private PlayingCard[] makeDeck(int r){
		int suit;		// decides the suit
		int rank=1;		//decides the rank
		PlayingCard[] c = new PlayingCard[r*4];	
		
		for(int i=0; i<size; i++){	//Fills the deck-array
			suit = i % 4;
			c[i] = new PlayingCard(rank, suits[suit]);
			
			if(suit == 3){
				rank++;
			}
		}
		return c;
	}

	public PlayingCard[] getCards() {
		return cards;
	}

	public void setCards(PlayingCard[] cards) {
		this.cards = cards;
	}
	
	public PlayingCard getCard(int index){
		if(index >=0 && index < cards.length){
			return cards[index];
		}
		return null;
	}
}
