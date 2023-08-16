package lesson3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Lesson_3_sem {
    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        for (int i = 0; i < 10; i++) {
           arrayList.add(i);
        }
//        Вариант для автозаполнения списка:
//        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));
//        arrayList.add(4, -1); // для добавления элемента по указанному индексу
        //Для заполнения рандомными значениями:
//        int [] array1 = IntStream.rangeClosed(1, 10).toArray();
//        list <Integer> ints = IntStream.rangeClosed(1, 10).boxed().toList();
//        int [] array2 = IntStream.generate(()-> ThreadLocalRandom.current().nextInt(100))
//                .limit(100)
//                        .toArray();


//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(8);
//        arrayList.add(9);
//        arrayList.add(10);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(8); // удалить элемент по указанному индексу
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        Integer secondElement = arrayList.get(1);
        System.out.println(secondElement);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)); // для печати всего массива элементов (перебор всех значений
        }
        for (Integer x : arrayList) {
            System.out.println(x); // для печати всего массива элементов (перебор всех значений, второй вариант
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Integer x = arrayList.get(i);
            System.out.println(x);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        // Поменять местами два элемента (1 и 2)
        Integer temp = arrayList.get(0);
        arrayList.set(0, arrayList.get(1));
        arrayList.set(1, temp);
        System.out.println(arrayList);
// Список превратить в массив:
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth"));
        Object[] array = strings.toArray();
        String[] arrayString = strings.toArray(new String[]{});
        String[] array1String = strings.toArray(String[]::new);

        System.out.println(Arrays.toString(arrayString));
        List<String> list = Arrays.asList(arrayString); // изменение массива преобразуя его в список
        System.out.println(list);
        arrayString[0] = "skdfbshjfbshbf"; // изменение
        System.out.println(list);





    }


}
