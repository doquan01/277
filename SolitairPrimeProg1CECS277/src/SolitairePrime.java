/*Quan Do
  CECS 277-01
  Solitaire Prime
  9/8/2020

  I certify that this program is my is my own work. I did not copy any part of this program from
  any other source. I further certify that I typed each and every line of code in this program.
*/
import java.util.Scanner;

public class SolitairePrime {
    public static void main(String[] args) {
        int input;
        Deck D = new Deck();
        do{
            input = menu();
            if (input == 1){
                D = new Deck();
                System.out.println("New deck is created.\n");
            }
            else if (input == 2){
                D.display();
                System.out.println("Deck displayed.");
            }
            else if (input == 3){
                D.shuffle();
                System.out.println("Deck shuffled.\n");
            }
            else if (input == 4){
                playSolitaire(D);
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
    public static boolean isPrime(int x){
        if (x == 1 || x == 0){
            return false;
        }
        for (int i = 2; i <= Math.floor(Math.sqrt(x)); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int menu(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to Solitaire Prime!\n1) New Deck\n" +
                "2) Display Deck\n3) Shuffle Deck\n4) Play Solitaire Prime\n5) Exit\n" + "Please enter a number option\n");
        int x = scan.nextInt();
        return x;
    }
    public static void playSolitaire(Deck d){
        if(d.cardsLeft() == 0) {
            d = new Deck();
            d.shuffle();
        }
        System.out.println("\nPlaying Solitaire Prime!!!");
        int pileValue = 0;
        int pileCounter = 0;
        for (int i = 0; i < 52; i++) {
            Card C1 = d.deal();
            C1.display();
            System.out.print(", ");
            pileValue += C1.getValue();
            if (isPrime(pileValue)) {
                System.out.println("Prime: " + pileValue);
                pileValue = 0;
                pileCounter++;
            }
        }
        if (d.cardsLeft() == 0 && pileValue == 0){
            System.out.println("Winner in " + pileCounter + " piles!\n\n");
        }
        else{
            System.out.println("Loser\n\n");
        }
    }
}

