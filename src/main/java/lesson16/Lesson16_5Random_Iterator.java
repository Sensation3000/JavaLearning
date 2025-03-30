package lesson16;

import java.util.Iterator;
import java.util.Random;

//пишем свою собственную версию итератора

public class Lesson16_5Random_Iterator implements Iterator {

    private Random random = new Random();
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return random.nextInt();
    }

    public static void main(String[] args) {
       Iterator<Integer> iter = new Lesson16_5Random_Iterator();
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
    }
}
