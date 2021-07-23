package Collections;
import java.util.*;
public class HW3 {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "apple", "potato", "tomato", "cucumber", "potato", "watermelon", "bread", "wood", "wood"};

        // ex 1.1
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // ex 1.2
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // ex 2

        Phonebook pb = new Phonebook();


        pb.add("Ogurtsov", "444");
        pb.add("Ogurtsov", "888");
        pb.add("Ivanov", "001");
        pb.add("Gromov", "002");
        pb.add("Khromykh", "100");
        pb.add("Krivykh", "500");

        System.out.println(pb.get("Ogurtsov"));
        System.out.println(pb.get("Gromov"));
        System.out.println(pb.get("Khromykh"));

    }
}
