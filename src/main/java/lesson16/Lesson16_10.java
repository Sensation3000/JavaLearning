package lesson16;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lesson16_10 {
    public static void main(String[] args) {

        // DEQUE
        // double ended queue

        Deque<Integer> q = new ArrayDeque<>();
        q.addFirst(1); //добавлять с головы
        System.out.println(q);
        q.addFirst(2); //добавлять с головы
        System.out.println(q);
        q.addFirst(3); //добавлять с головы
        System.out.println(q);
        q.addLast(4); //добавлять с хвоста
        System.out.println(q);
        q.addLast(5); //добавлять с хвоста
        System.out.println(q);
        q.addLast(6); //добавлять с хвоста
        System.out.println(q);

        System.out.println(q.removeFirst()); //удаляем с головы
        System.out.println(q);
        System.out.println(q.removeLast()); //удаляем с хвоста
        System.out.println(q);
    }
}
