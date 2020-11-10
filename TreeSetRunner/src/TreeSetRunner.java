/*
Quan Do, Eric Dao, John Marion, Brenda Solis
Demo Time: 4;37
 */
import java.util.*;

class TreeSetRunner {
    public static void main(String args[]) {

        //Initailizing tree set
        TreeSet<String> part2 = new TreeSet<>();
        part2.add("iii");
        part2.add("hhh");
        part2.add("ggg");
        part2.add("fff");
        part2.add("eee");
        part2.add("ddd");
        part2.add("ccc");
        part2.add("bbb");
        part2.add("aaa");
        part2.add("iii");
        part2.add("hhh");
        part2.add("ggg");
        part2.add("fff");
        part2.add("eee");
        part2.add("ddd");
        part2.add("ccc");
        part2.add("bbb");
        part2.add("aaa");

        //Print each value of tree set
        for (String a : part2) {
            System.out.println(a);
        }
    }
}