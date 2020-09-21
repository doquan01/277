//Quan Do
//Michael Gonzales
//Hagop Tanashian
//CECS 277 Lab sec 02
//Demo time: 5:10 pm 8/25/2020
import java.util.Random;

public class ArrayStats {
    public static int max(int [] n){
        int big = 0;
        for(int i = 0; i < n.length; i++){
            if(big < n[i]){
                big = n[i];
            }
        }
        return big;
    }
    public static int min(int [] n){
        int smll = n[0];
        for (int i = 1; i < n.length; i++){
            if (smll > n[i]){
                smll = n[i];
            }
        }
        return smll;
    }
    public static double ave(int [] n){
        double avg = 0;
        for (int i = 0; i < n.length; i++){
            avg += n[i];
        }
        avg = avg/20.0;
        return avg;
    }
    public static int sum(int [] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            int num = 100 + rand.nextInt(500 - 100 + 1);
            numbers[i] = num;
        }
        double ave = ave (numbers);
        int max = max(numbers);
        int min = min(numbers);
        int sum = sum(numbers);
        System.out.println("Print the list of numbers here");
        System.out.println("Ave:" + ave);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Sum:" + sum);
        for(int i = 0; i < numbers.length; i++){
            System.out.print("The numbers in the array are: " + numbers[i] + " ");
        }
    }
}
