import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File qW = new File("qWords.txt");
        Scanner scan = new Scanner(System.in);
        Scanner scHash = new Scanner(qW);
        HashMap<String, Integer> testHashMap = new HashMap<>();
        long time1, time2;
        time1 = System.nanoTime();
        while(scHash.hasNextLine()){
            testHashMap.put(scHash.next(), 0);
        }
        time2 = System.nanoTime();
        System.out.println("Time for loading into HashMap " + (time2 - time1) + " nano-seconds");
        for(String i : testHashMap.keySet()){
            String temp = i;
            int score = 0;
            for(int j = 0; j < temp.length(); j++){
                if((temp.charAt(j) == 'a') || (temp.charAt(j) == 'e') || (temp.charAt(j) ==  'i') ||
                        (temp.charAt(j) == 'o') || (temp.charAt(j) == 'u') || (temp.charAt(j) ==  'l') ||
                        (temp.charAt(j) == 'n') || (temp.charAt(j) == 's') || (temp.charAt(j) ==  't') || (temp.charAt(j) ==  'r')){
                    score += 1;
                }
                else if((temp.charAt(j) == 'd') || (temp.charAt(j) == 'g')){
                    score += 2;
                }
                else if((temp.charAt(j) == 'b') || (temp.charAt(j) == 'c') || (temp.charAt(j) == 'm') || (temp.charAt(j) == 'p')){
                    score += 3;
                }
                else if((temp.charAt(j) == 'f') || (temp.charAt(j) == 'h') || (temp.charAt(j) == 'v') || (temp.charAt(j) == 'w') ||
                        (temp.charAt(j) == 'y')){
                    score += 4;
                }
                else if((temp.charAt(j) == 'k')){
                    score += 5;
                }
                else if((temp.charAt(j) == 'j') || (temp.charAt(j) == 'x')){
                    score += 8;
                }
                else if((temp.charAt(j) == 'q') || (temp.charAt(j) == 'z')){
                    score += 10;
                }
            }
            testHashMap.replace(i, score);
        }
        System.out.println("Using HashMap");
        time1 = System.nanoTime();
        Iterator hmItr = testHashMap.entrySet().iterator();
        while(hmItr.hasNext()){
            Map.Entry k = (Map.Entry)hmItr.next();
            System.out.println(k.getKey() + " --> " + k.getValue());
        }
        System.out.println();
        time2 = System.nanoTime();
        System.out.println("Time for printing HashMap " + (time2 - time1) + " nano-seconds");

        System.out.print("Press any key to continue . . . ");
        String cont = scan.nextLine();
        System.out.println();


        System.out.println("Using TreeMap");
        Scanner scTree = new Scanner(qW);
        TreeMap<String, Integer> testTreeMap = new TreeMap<>();
        time1 = System.nanoTime();
        while(scTree.hasNextLine()){
            testTreeMap.put(scTree.next(), 0);
        }
        time2 = System.nanoTime();
        System.out.println("Time for loading into HashMap " + (time2 - time1) + " nano-seconds");
        for(String i : testTreeMap.keySet()){
            String temp = i;
            int score = 0;
            for(int j = 0; j < temp.length(); j++){
                if((temp.charAt(j) == 'a') || (temp.charAt(j) == 'e') || (temp.charAt(j) ==  'i') ||
                        (temp.charAt(j) == 'o') || (temp.charAt(j) == 'u') || (temp.charAt(j) ==  'l') ||
                        (temp.charAt(j) == 'n') || (temp.charAt(j) == 's') || (temp.charAt(j) ==  't') || (temp.charAt(j) ==  'r')){
                    score += 1;
                }
                else if((temp.charAt(j) == 'd') || (temp.charAt(j) == 'g')){
                    score += 2;
                }
                else if((temp.charAt(j) == 'b') || (temp.charAt(j) == 'c') || (temp.charAt(j) == 'm') || (temp.charAt(j) == 'p')){
                    score += 3;
                }
                else if((temp.charAt(j) == 'f') || (temp.charAt(j) == 'h') || (temp.charAt(j) == 'v') || (temp.charAt(j) == 'w') ||
                        (temp.charAt(j) == 'y')){
                    score += 4;
                }
                else if((temp.charAt(j) == 'k')){
                    score += 5;
                }
                else if((temp.charAt(j) == 'j') || (temp.charAt(j) == 'x')){
                    score += 8;
                }
                else if((temp.charAt(j) == 'q') || (temp.charAt(j) == 'z')){
                    score += 10;
                }
            }
            testTreeMap.replace(i, score);
        }
        time1 = System.nanoTime();
        Iterator tmItr = testTreeMap.entrySet().iterator();
        while(tmItr.hasNext()){
            Map.Entry k = (Map.Entry)tmItr.next();
            System.out.println(k.getKey() + " --> " + k.getValue());
        }
        time2 = System.nanoTime();
        System.out.println("Time for printing TreeMap " + (time2 - time1) + " nano-seconds");

        System.out.print("Press any key to continue . . . ");
        cont = scan.nextLine();
        System.out.println();

        File alice = new File("Alice.txt");
        System.out.println("Using HashSet");
        Scanner scHashSet = new Scanner(alice);

        HashSet<String> testHashSet = new HashSet<>();
        time1 = System.nanoTime();
        while(scHashSet.hasNextLine()){
            String temp = scHashSet.next().replaceAll("[^a-zA-Z]","").toLowerCase();
            testHashSet.add(temp);
        }
        time2 = System.nanoTime();
        System.out.println("Elapsed time for loading hash set: " + (time2 - time1) + " nano-seconds");

        String[] hash100 = new String[100];
        Random rand = new Random();
        Iterator<String> hashSetitr = testHashSet.iterator();
        int rdHashSetEl = rand.nextInt(testHashSet.size());
        int count = 0;
        int i = 0;
        time1 = System.nanoTime();
        while(hashSetitr.hasNext() && i < hash100.length){
            String temp = hashSetitr.next();
            if(count == rdHashSetEl){
                hash100[i] = temp;
                i++;
                hashSetitr = testHashSet.iterator();
            }
            count++;
        }
        time2 = System.nanoTime();
        System.out.println("Elapsed time for searching hash set: " + (time2 - time1) + " nano-seconds");

        System.out.print("Press any key to continue . . . ");
        cont = scan.nextLine();
        System.out.println();

        System.out.println("Using TreeSet");
        Scanner scTreeSet = new Scanner(alice);

        TreeSet<String> testTreeSet = new TreeSet<>();
        time1 = System.nanoTime();
        while(scTreeSet.hasNextLine()){
            String temp = scTreeSet.next().replaceAll("[^a-zA-Z]","").toLowerCase();
            testTreeSet.add(temp);
        }
        time2 = System.nanoTime();
        System.out.println("Elapsed time for loading tree set: " + (time2 - time1) + " nano-seconds");

        String[] tree100 = new String[100];
        rand = new Random();
        Iterator<String> treeSetitr = testTreeSet.iterator();
        int rdTreeSetEl = rand.nextInt(testTreeSet.size());
        count = 0;
        i = 0;
        time1 = System.nanoTime();
        while(treeSetitr.hasNext() && i < tree100.length){
            String temp = treeSetitr.next();
            if(count == rdTreeSetEl){
                tree100[i] = temp;
                i++;
                treeSetitr = testTreeSet.iterator();
            }
            count++;
        }
        time2 = System.nanoTime();
        System.out.println("Elapsed time for searching tree set: " + (time2 - time1) + " nano-seconds");

        System.out.print("Press any key to continue . . . ");
        cont = scan.nextLine();
        System.out.println();

    }
}
