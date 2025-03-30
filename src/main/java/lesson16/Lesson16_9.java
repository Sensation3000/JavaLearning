package lesson16;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson16_9 {
    public static void main(String[] args) {

        //QUEUE - очередь
        //добавляем в конец очереди, а забираем с головы
        // first in, first out - fifo

        Queue<Integer> queue = new LinkedList<>(); //обычно priority list
        queue.add(1);
        System.out.println(queue);
        queue.add(2);
        System.out.println(queue);
        queue.add(3);
        System.out.println(queue);
        queue.add(4);
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.remove()); //убрать можно первый элемент - метод возвращает
        System.out.println(queue);
    }
}
