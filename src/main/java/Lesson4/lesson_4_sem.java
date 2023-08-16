package Lesson4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class lesson_4_sem {
    public static void main (String[] args) {
        // очередь Queue (первый вошёл, первый вышел)
        // 1, 2, 3, 4 -> 1, 2, 3, 4

        // Stack (первый вошёл последний вышел)
        // 1, 2, 3, 4 -> 4, 3, 2, 1
        Deque<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue1 = new ArrayDeque<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue1.remove());

        // [0] <-> [1] <-> [2] <-> [3] <-> ... [10] для LinkedList
        Queue<Integer> linkedList = new LinkedList<>();
//        String s = LinkedList.get(3);
//        List<String> LinkedList = new LinkedList<>();

    }

}
