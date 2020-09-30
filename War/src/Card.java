public class Card {
    private Deck.Suit suit;
    private Deck.Rank rank;

    public Card(Deck.Rank r, Deck.Suit s){
        rank = r;
        suit = s;
    }
    public void display(){
        if(rank.getRank() == 'T'){
            System.out.printf("10%s", suit.getSuit());
        }
        else{
            System.out.printf("%s%s", rank.getRank(), suit.getSuit());
        }
    }
    public int getValue() {
        Card c = new Card(rank,suit);
        if (rank.getRank() == 'A') {
            return 1;
        }
        else if (rank.getRank() == '2') {
            return 2;
        }
        else if (rank.getRank() == '3') {
            return 3;
        }
        else if (rank.getRank() == '4') {
            return 4;
        }
        else if (rank.getRank() == '5') {
            return 5;
        }
        else if (rank.getRank() == '6') {
            return 6;
        }
        else if (rank.getRank() == '7') {
            return 7;
        }
        else if (rank.getRank() == '8') {
            return 8;
        }
        else if (rank.getRank() == '9') {
            return 9;
        }
        else if (rank.getRank() == 'T') {
            return 10;
        }
        else if(rank.getRank() == 'J'){
            return 11;
        }
        else if(rank.getRank() == 'Q'){
            return 12;
        }
        else if(rank.getRank() == 'K'){
            return 13;
        }
        else {
            return 0;
        }
    }
}
