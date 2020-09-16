import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> storage;
    private int counter;

    public Deck()
    {
        int counter = 0;

        char [] suits = {'H', 'D', 'S', 'C'};
        char [] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        storage = new ArrayList<Card>();

        Card C1;
        for (int s = 0; s < suits.length; s++)
            for (int r = 0; r < ranks.length; r++)
            {
                C1 = new Card(ranks[r], suits[s]);
                storage.add(C1);
            }
    }
    public void display(){
        for (int i = 0; i < 52; i++){
            if (i%13==0){
                System.out.print("\n");
            }
            storage.get(i).display();
            System.out.print(", ");
        }
        System.out.print("\n\n");
    }
    public void shuffle(){
        Random rand = new Random();

        for(int i = 0; i < 52; i++){
            int x = rand.nextInt(52);
            int y = rand.nextInt(52);
                Card temp = storage.get(x);
                storage.set(x,storage.get(y));
                storage.set(y,temp);
        }
    }
    public Card deal(){
        return storage.get(counter++);
    }
    public int cardsLeft(){
        return 52 - counter;
    }
}
