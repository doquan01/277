/*Quan Do
  CECS 277-01
  Program #6 – Memento
  Due: Tuesday Nov 24, 2020

  I certify that this program is my is my own work. I did not copy any part of this program from
  any other source. I further certify that I typed each and every line of code in this program.
*/
import java.math.BigInteger;

public class Program6 {
    public static Originator origin = new Originator();
    public static CareTaker care = new CareTaker();
    public static void main(String[] args) {
        long start, end;
        double dur;
        BigInteger f;


        for(int i = 0; i < 1001; i++){
            start = System.nanoTime();
            f = fibo(new BigInteger(Integer.toString(i)));
            end = System.nanoTime();
            dur = (end - start) / 1000.0;
            System.out.printf("Fibo(%d): %12d (Nano Secs: %5.3f)\n", i, f, dur);
        }
    }
    public static BigInteger fibo(BigInteger n) {
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        if (n.equals(zero) || n.equals(one)){
            origin.setState(one);
            care.add(origin.saveStateToMemento());
            return origin.getState();
        }
        else {
            origin.setState(care.get(n.subtract(one).intValue()).getState().add(care.get(n.subtract(two).intValue()).getState()));
            care.add(origin.saveStateToMemento());
            return origin.getState();
        }
    }
}
