//Quan Do
//Brian Vu
//Kevin Cordray
//CECS 277 Lab sec 02
//Demo time: 9/1/2020 5:59pm
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListStats {
    public static int max(ArrayList<Integer> n){
        int big = 0;
        for(Integer i: n){
            if(big < i){
                big = i;
            }
        }
        return big;
    }
    public static int min(ArrayList<Integer> n){
        int smll = n.get(0);
        for (Integer i: n){
            if (smll > i){
                smll = i;
            }
        }
        return smll;
    }
    public static double ave(ArrayList<Integer> n){
        double avg = 0;
        for (Integer i: n){
            avg += i;
        }
        avg = avg/n.size();
        return avg;
    }
    public static int sum(ArrayList<Integer> n){
        int sum = 0;
        for (Integer i: n){
            sum += i;
        }
        return sum;
    }
    public static void display(ArrayList<Integer> n){
        Collections.sort(n);
        int counter = 0;
        System.out.print("The numbers in the array are: \n" );
        for(Integer i: n){
            counter++;
            if(counter % 40 == 0){
                System.out.println();
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
    static int mode(ArrayList<Integer> n) {
        Collections.sort(n);
        int mode = 0, maxCnt = 0;
        for (Integer i : n) {
            int cnt = 0;
            for (Integer j : n) {
                if (j == i)
                    ++cnt;
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    mode = i;
                }
            }
        }
        return mode;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            int num = 100 + rand.nextInt(500 - 100 + 1);
            numbers.add(num);
        }
        double ave = ave (numbers);
        int max = max(numbers);
        int min = min(numbers);
        int sum = sum(numbers);
        int mode = mode(numbers);
        display(numbers);
        System.out.println();
        System.out.println("Ave:" + ave);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Sum:" + sum);
        System.out.println("Mode:" + mode);

    }
}
