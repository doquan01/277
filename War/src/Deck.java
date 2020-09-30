import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> storage;
    private int counter = 0;
    enum Suit{
        H('H'), D('D'), S('S'), C('C');
        private char suit;
        private Suit(char s){
            this.suit = s;
        }
        public char getSuit(){
            return this.suit;
        }
    }
    enum Rank{
        A('A'), x2('2'), x3('3'), x4('4'), x5('5'), x6('6'), x7('7'), x8('8'),
        x9('9'), T('T'), J('J'), Q('Q'), K('K');
        private char rank;
        private Rank(char r){
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
