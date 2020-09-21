import java.util.ArrayList;
import java.util.Scanner;

public class ShippingContainer {
    private ArrayList<Luggage> container = new ArrayList<>();

    public ShippingContainer(){
        container.add(new box(6,9,4));
        container.add(new sphere(5));
        container.add(new cube(9));
        container.add(new pyramid(6,5));
        container.add(new cylinder(6,8));
        container.add(new cone(5,7));
        container.add(new hexagonalPrism(7,3));
        container.add(new triangularPrism(4,6,8));
        container.add(new box(5,7,8));
        container.add(new cone(6, 5));
        sortArray();
    }
    public void sortArray() {
        for (int i = 0; i < container.size(); i++) {
            for (int j = container.size() - 1; j > i; j--) {
                if (container.get(i).compareTo(container.get(j)) == 1) {
                    Luggage temp = container.get(i);
                    container.set(i,container.get(j));
                    container.set(j, temp);
                }
            }
        }
    }
    public void add(int x){
        Scanner scan = new Scanner(System.in);
        if(x == 1){
            System.out.println("Enter the length of the box.");
            int l = scan.nextInt();
            System.out.println("Enter the width of the box.");
            int w = scan.nextInt();
            System.out.println("Enter the height of the box");
            int h = scan.nextInt();
            container.add(new box(l,w,h));
            sortArray();
        }
        else if(x == 2){
            System.out.println("Enter the radius of the sphere.");
            int r = scan.nextInt();
            container.add(new sphere(r));
            sortArray();
        }
        else if(x == 3){
            System.out.println("Enter the width of the cube");
            int w = scan.nextInt();
            container.add(new cube(w));
            sortArray();
        }
        else if(x == 4){
            System.out.println("Enter the base length of the pyramid");
            int b = scan.nextInt();
            System.out.println("Enter the height of the pyramid");
            int h = scan.nextInt();
            container.add(new pyramid(b, h));
            sortArray();
        }
        else if(x == 5){
            System.out.println("Enter the radius of the cylinder");
            int r = scan.nextInt();
            System.out.println("Enter the length of the cylinder");
            int l = scan.nextInt();
            container.add(new cylinder(r,l));
            sortArray();
        }
        else if(x == 6){
            System.out.println("Enter the radius of the cone");
            int r = scan.nextInt();
            System.out.println("Enter the height of the cone");
            int h = scan.nextInt();
            container.add(new cone(r, h));
            sortArray();
        }
        else if(x == 7){
            System.out.println("Enter the width of the triangular prism");
            int w = scan.nextInt();
            System.out.println("Enter the height of the triangular prism");
            int h = scan.nextInt();
            System.out.println("Enter the length of the triangular prism");
            int l = scan.nextInt();
            container.add(new triangularPrism(w,h,l));
            sortArray();
        }
        else if(x == 8){
            System.out.println("Enter the edge length of the hexagonal prism");
            int e = scan.nextInt();
            System.out.println("Enter the height of the hexagonal prism");
            int h = scan.nextInt();
            container.add(new hexagonalPrism(e,h));
            sortArray();
        }
        else{
            System.out.println("Invalid option");
        }
    }
    public void remove(int x){
        int y = x -1;
        if(container.size() == 0){
            System.out.println("There are no more luggage items.");
        }
        else if(x > container.size() || y < 0 || container.size() == 0){
            System.out.println("Not a valid removal.");
        }
        else if(container.size() > 0 && y < container.size() && y > 0){
            System.out.println("Removed " + container.get(y));
            container.remove(y);
        }
        else if(y == 0 || container.size() == 1){
            container = new ArrayList<>();
            System.out.println("There are no more luggage items.");
        }
    }
    public void display(){
        int x = 1;
        float vol = 0;
        for(int i = 0; i < container.size(); i++){
            System.out.print(x++ + ") ");
            System.out.println(container.get(i).toString());
            vol += container.get(i).getVolume();
        }
        System.out.println("Total number of luggage: " + container.size() + ", Total volume: " + Math.round(vol * 100.0)/100.0);
        System.out.println();
    }
    public int size(){
        return container.size();
    }
}
