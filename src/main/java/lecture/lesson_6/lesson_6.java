package lecture.lesson_6;

import java.util.HashSet;

public class lesson_6 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // дублирующий элемент, будет проигнорирован

        System.out.println(set); // выводит [apple, banana, orange]

        set.remove("banana");
        System.out.println(set); // выводит [apple, orange]

        System.out.println(set.contains("apple")); // выводит true
        System.out.println(set.contains("grape")); // выводит false

        System.out.println(set.size()); // выводит 2


    }
}
