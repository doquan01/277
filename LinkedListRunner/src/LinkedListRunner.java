/*
Quan Do, Eric Dao, John Marion, Brenda Solis
Demo Time: 4;37
 */
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListRunner{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        list.add("hhh");
        list.add("iii");

        ListIterator<String> itr = list.listIterator();
        System.out.println("Printing strings in list");
        while(itr.hasNext())
        {
            String str = itr.next();
            System.out.println(str);
        }

        while(itr.hasPrevious())
        {
            String strP = itr.previous();
            if(strP.charAt(0) == 'a' || strP.charAt(0) == 'e' || strP.charAt(0) == 'i' || strP.charAt(0) == 'o' || strP.charAt(0) == 'u' ){
                itr.remove();
            }
        }

        System.out.println("----------");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}