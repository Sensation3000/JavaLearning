package homework04;

public class homework4_2 {
    public static void main(String[] args) {
        //Задача №2
        //Необходимо вывести все положительные степени числа 5 до тех пор,
        // пока результат возведения в степень меньше 100000,
        // вывести результат возведения в степень.

        //1 вариант
        int result = 1;
        while (result < 100000){
            result = result * 5;
            if (result > 100000){
                break;
            }
            System.out.println(result);
        }

//        2 вариант
        int number = 5;
        int res = 1;

        for (int i = 1; res * number < 100000; i++) {
            res *= number;
            System.out.println(res);
        }

//        3 вариант
        int num = 5;
        for (int i = 1; i < 100000; i *= num) {
            System.out.println(i);
        }

//       4 вариант. Преподавательский
//        в цикле for
        int limit = 100000;
        int base = 5;
        for (int result2 = 1, power = 0; result2 < limit; result2 *= base) {
            System.out.println(base + "^" + power + "=" + result2);
            power++;
        }

//        тоже самое в цикле do while
//        int result2 = 1, power = 0;
//        do {
//         System.out.println(base + "^" + power + "=" + result2);
//             power++;
//         result2*= base;
//          } while (result2 < limit);


//        тоже самое в цикле while
//         int result2 = 1, power = 0;
//         while (result2 < limit){
//           System.out.println(base + "^" + power + "=" + result2);
//           power++;
//           result2*= base;
//         }
        }
    }