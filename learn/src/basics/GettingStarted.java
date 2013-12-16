package basics;
import java.util.Arrays;
public class GettingStarted {
	public static void main(String[] args) {
		System.out.println("Hello World");
		/**
		 * Documentation
		 * @author studentstach
		 */
		int[][] ba = new int[3][3];
		int[][] cd = {{1,2,3},{123},{123}};
		System.out.println(Arrays.deepToString(cd));
		boolean bol = false;
		int  ah= bol ? 1 : 2;
		PlayingCard c = new PlayingCard( 2, "red");
		byte a = 20;
		System.out.println(a+""+ah);
		 int zahl = 8;
				 switch (zahl) {
				 case 8: System.out.println("tikk");
				 			break;
				 
				 default : System.out.println("tack");
				 			break;
				 }
		
		
		
		
		Integer b = new Integer(20);
		CardDeck cardd = new CardDeck(13);
		Arrays.toString((cardd.getCards()));
		System.out.println(cardd.getCard(0));
		for(PlayingCard caa: cardd.getCards()){
			caa.toString();
		}
	}
}
