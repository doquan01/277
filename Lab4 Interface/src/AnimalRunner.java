//Quan Do, Mike Gonzales, Ruben Cervantes
//Lab 4 Interface
//Demo time: 4:24
import java.util.*;
public class AnimalRunner {
    public static void main(String[] args)   {
        ArrayList<Speakable> dogcatList = new ArrayList<>();
        dogcatList.add(new Dog("Fred"));
        dogcatList.add(new Cat("Wanda"));
        for (Speakable obj: dogcatList){
             obj.speak();
        }
    }
}
