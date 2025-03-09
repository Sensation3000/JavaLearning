package lesson11;

import org.apache.commons.lang3.StringUtils;

public class Lesson11 {
    public static int getSum(int x, int y) {
        return x + y;
    }

/*
    public static boolean testSum() {
        if (getSum(1, 1) != 2) {
            return false;
        }

        if (getSum(0, 0) != 0) {
            return false;
        }

        if (getSum(-10, -5) != -15) {
            return false;
        }

        if (getSum(-10, 5) != -5) {
            return false;
        }

        return true;
    }
*/

    public static void main(String[] args) {
        System.out.println(getSum(4, 5));  //обычный вызов метода

        // System.out.println(testSum());
        // тест метода, переносим cам тест в папку test.
        // там он будет выглядеть по-другому

        String paddedLeft = StringUtils.leftPad("A", 10, '0'); // "000000000A"
        System.out.println(paddedLeft);

        String paddedRight = StringUtils.leftPad("text", 10, '*'); // "text******"
        System.out.println(paddedRight);
    }
}
