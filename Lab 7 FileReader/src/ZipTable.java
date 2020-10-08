//Quan Do, Hunter Lewis, Brooke Yale
//Demo Time:5:11
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZipTable {
    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("ziptable.txt");
        Scanner num1 = new Scanner(fl);
        Scanner num2 = new Scanner(fl);
        Scanner num3 = new Scanner(fl);
//        Number 1
        while(num1.hasNext()){
            System.out.println(num1.nextLine());
        }
//        Number 2
        PrintWriter pw = new PrintWriter("output.txt");
        while(num2.hasNext()) {
            pw.println(num2.nextLine());
        }
        pw.close();
//        Number 3
        PrintWriter vw = new PrintWriter("vowel.txt");
        PrintWriter cw = new PrintWriter("consonant.txt");
        while(num3.hasNext()){
            String curr = num3.nextLine();
            if(curr.startsWith("A") || curr.startsWith("E") || curr.startsWith("I") || curr.startsWith("O") || curr.startsWith("U") ){
                vw.println(curr);
            }
            else{
                cw.println(curr);
            }
        }
        vw.close();
        cw.close();
    }
}
