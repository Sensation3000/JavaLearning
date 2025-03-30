package homework16;

import java.util.ArrayList;
import java.util.List;

public class Homework16_3 {
    public static void main(String[] args) {

        //Экстра задача
        //Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче,
        // на Integer (не int, а Integer) и добиться такого же результата как и с типом int.


        List<Integer> list1000 = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            list1000.add(i);
        }
        System.out.println(list1000);

        for (Integer i = 0; i < list1000.size(); i++) {
            if ((list1000.get(i) % 2) == 0) {
                list1000.remove(list1000.get(i));
            }
        }
        System.out.println(list1000);
    }
}
