package Lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lesson_5Sem {
    public static void main(String [] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "value");
        hashMap.put(4, "value");
        hashMap.put(1, "value");
        hashMap.put(5, "value");

        System.out.println(hashMap);
//        Map<Integer, String> map = new HashMap<>();
//
//        for (int i = 1; i <= 1_000_000 ; i++) {
//            map.put(i, String.valueOf(i));
//        }
//
//        Set<Map.Entry<Integer, String>> pairs = map.entrySet();
//        int counter = 1;
//        for (Map.Entry<Integer, String> pair : pairs) {
//            Integer key = pair.getKey();
//            if (key != counter) {
//                System.out.println("Нарушен порядок чисел " + counter + "-го элемента");
//                System.out.println(key);
//                System.out.println(counter);
//                break;
//            }
//            counter++;
//        }

    }
}
