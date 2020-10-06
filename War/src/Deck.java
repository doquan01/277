import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> storage;
    private int counter = 0;
    public enum Suit{
        H, D, S, C;
    }
    public enum Rank{
        A('A'), Two('2'), Three('3'), Four('4'), Five('5'), Six('6'), Seven('7'), Eight('8'),
        Nine('9'), Ten('T'), Jack('J'), Queen('Q'), King('K');
        private char rank;
        Rank(char r){
            this.rank = r;
        }
        public char getRank(){
            return this.rank;
        }
    }
    public Deck()
    {
        storage = new ArrayList<>();
        Card C1;
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
            {
                C1 = new Card(rank, suit);
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
        return storage.size() - counter;
    }
}
