package lesson16;

import java.util.List;

public class Lesson16_3 {
    public static void main(String[] args) {

        // список списков
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        );

        System.out.println(matrix);
    }
}
