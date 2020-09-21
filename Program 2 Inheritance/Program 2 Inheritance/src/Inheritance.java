import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        ShippingContainer storage = new ShippingContainer();
        Scanner scan = new Scanner(System.in);
        int input;
        do{
            input = menu();
            if(input == 1){
                storage = new ShippingContainer();
            }
            else if(input == 2){
                System.out.println("Luggage options: \n1) box\n2) sphere\n3) cube\n4) pyramid\n5) cylinder\n" +
                        "6) cone\n7) triangular prism\n8) hexagonal prism\nEnter a number option");
                int x = scan.nextInt();
                storage.add(x);
            }
            else if(input == 3){
                if(storage.size() == 0){
                    storage.display();
                    System.out.println("There are no more luggage items.\n");
                }
                else{
                    storage.display();
                    System.out.println("Which luggage would you want to remove?");
                    int x = scan.nextInt();
                    storage.remove(x);
                }
            }
            else if(input == 4){
                storage.display();
            }
            else if(input == 5){
                System.out.println("Ending program");
            }
            else{
                System.out.println("Please input a number option from the menu. \n");
            }
        }
        while(input != 5);
    }

    public static int menu(){
        Scanner scan = new Scanner(System.in);

        System.out.print("1) Create new shipping container\n2) Add luggage\n" +
                "3) Remove luggage\n4) Show luggage\n5) Quit\n");
        int x = scan.nextInt();
        return x;
    }
}
