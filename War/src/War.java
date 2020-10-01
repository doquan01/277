import java.util.ArrayList;
import java.util.Scanner;

/*Quan Do
  CECS 277-01
  War
  10/6/2020

  I certify that this program is my is my own work. I did not copy any part of this program from
  any other source. I further certify that I typed each and every line of code in this program.
*/
public class War {
    public static void main(String[] args) {

        int input;
        Deck d = new Deck();
        Hand player1 = new Hand(d);
        Hand player2 = new Hand(d);
        do{
            input = menu();
            if (input == 1){
                d = new Deck();
                player1 = new Hand(d);
                player2 = new Hand(d);
                System.out.println("New deck created");
            }
            else if (input == 2){
                d = new Deck();
                d.shuffle();
                player1 = new Hand(d);
                player2 = new Hand(d);
                System.out.println("Deck shuffled");
            }
            else if (input == 3){
                System.out.println("Player 1 cards: ");
                player1.display();
                System.out.println("Player 2 cards: ");
                player2.display();

            }
            else if (input == 4){
                playWar();
            }
            else if (input == 5){
                System.out.println("Exiting the game, bye.");
            }
            else{
                System.out.println("Please input a number option from the menu.\n");
            }
        }
        while(input != 5); //exit the program
    }
    public static int menu(){
        Scanner scan = new Scanner(System.in);

        System.out.print("War!\n1) New Deck\n" +
                "2) Shuffle Deck\n3) Show Deck\n4) Play War\n5) Exit\n" + "Please enter a number option\n");
        int x = scan.nextInt();
        return x;
    }
    public static void playWar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the max battle number");
        int counter = scan.nextInt();
        Deck s = new Deck();
        s.shuffle();
        Hand p1 = new Hand(s);
        Hand p2 = new Hand(s);
        System.out.println("Player 1 cards: ");
        p1.display();
        System.out.println("Player 2 cards: ");
        p2.display();
        System.out.println("Press any key to continue");
        if(scan.hasNext()) {
            while (counter != 0 && p1.cardsLeft() != 0 && p2.cardsLeft() != 0) {
                Card c1 = p1.deal();
                System.out.print("Player 1 plays " );
                c1.display();
                System.out.println();
                Card c2 = p2.deal();
                System.out.print("Player 2 plays ");
                c2.display();
                System.out.println();
                if(c1.getValue() > c2.getValue()){
                    System.out.println("Player 1 wins the round");
                    p1.add(c1);
                    p1.add(c2);
                    counter--;
                }
                else if(c1.getValue() < c2.getValue()){
                    System.out.println("Player 2 wins the round");
                    p2.add(c1);
                    p2.add(c2);
                    counter--;
                }
                else{
                    System.out.println("WAR TIME!");
                    if(p1.cardsLeft() < 4){
                        System.out.println("Player 1 does not have enough cards for war");
                        break;
                    }
                    else if(p2.cardsLeft() < 4){
                        System.out.println("Player 2 does not have enough cards for war");
                        break;
                    }
                    else{
                        warTime(c1, c2, p1, p2);
                        counter--;
                    }

                }
            }
            if(p1.cardsLeft() > p2.cardsLeft() || p2.cardsLeft() == 0){
                System.out.println("Player 1 wins the game");
                System.out.println("Player 1 cards left: " + p1.cardsLeft());
                System.out.println("Player 1 cards left: " + p2.cardsLeft());
            }
            else if(p1.cardsLeft() < p2.cardsLeft() || p1.cardsLeft() == 0){
                System.out.println("Player 2 wins the game");
                System.out.println("Player 1 cards left: " + p1.cardsLeft());
                System.out.println("Player 1 cards left: " + p2.cardsLeft());
            }
            else{
                System.out.println("Tie game");
            }
        }
    }
    public static void warTime(Card first, Card sec, Hand p1, Hand p2){
        ArrayList<Card> winner = new ArrayList<>();
        winner.add(first);
        winner.add(sec);
        boolean tie = true;
        while(tie == true){
            Card t1 = null;
            Card t2 = null;
            if(p1.cardsLeft() < 4){
                System.out.println("Player 1 does not have enough cards for war");
                p1.add(first);
                p2.add(sec);
                tie = false;
            }
            else if(p2.cardsLeft() < 4){
                System.out.println("Player 2 does not have enough cards for war");
                p1.add(first);
                p2.add(sec);
                tie = false;
            }
            else{
                for(int i = 0; i < 4; i++){
                    System.out.print("War card for player 1 Card is xx");
                    t1 = p1.deal();
                    System.out.println();
                    winner.add(t1);
                    System.out.print("War card for player 2 Card is xx");
                    t2 = p2.deal();
                    System.out.println();
                    winner.add(t2);
                }
                System.out.print("War card for player 1 is ");
                t1.display();
                System.out.println();
                System.out.print("War card for player 2 is ");
                t2.display();
                System.out.println();

                if(t1.getValue() > t2.getValue()){
                    System.out.println("Player 1 wins the war round");
                    for(int i = 0; i < winner.size(); i++){
                        p1.add(winner.get(i));
                        tie = false;
                    }
                }
                else if(t1.getValue() < t2.getValue()){
                    System.out.println("Player 2 wins the war round");
                    for(int i = 0; i < winner.size(); i++){
                        p2.add(winner.get(i));
                        tie = false;
                    }
                }
                else{
                    System.out.println("War round tie");
                    tie = true;
                }
            }
        }
    }
}
