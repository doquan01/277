//Jacob Samson, Quan Do, Hagop Tanashian
//CECS 277 Sec 02
//Week 11 Lab
//Due Nov 3, 2020
//Demo Time: 4:06
//

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> people = new HashMap<>();
        ArrayList<String> sueFriends = new ArrayList<>(Arrays.asList("Bob", "Jose", "Alex", "Cathy"));
        ArrayList<String> cathyFriends = new ArrayList<>(Arrays.asList("Bob", "Alex"));
        ArrayList<String> bobFriends = new ArrayList<>(Arrays.asList("Alex", "Jose", "Jerry"));
        people.put("Sue", sueFriends);
        people.put("Cathy", cathyFriends);
        people.put("Bob", bobFriends);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scan.nextLine();

        if (people.containsKey(name)) {
            System.out.println(people.get(name));
        }
        else {
            System.out.println("Name not in HashMap!");
        }
    }
}