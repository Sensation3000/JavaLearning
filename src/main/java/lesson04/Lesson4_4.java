package lesson04;

public class Lesson4_4 {
    public static void main(String[] args) {

        //цикл for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Done!");

        //тоже самое в циклe while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; //i = i + 1;  //i += 1
        }
        System.out.println("Done!");

        for (String x = ""; x.length() < 10; x = x + "."){
            System.out.println(x);
        }

        int i2 = 0;
        for (; i2 < 10;){
            System.out.println(i2);
            i2++;
        }
        System.out.println("Done!");

        //while проверяет условие прежде чем заходить в цикл
        //do while первый раз все равно заходим в цикл, а потом проверяем верно ли условие и нужно ли повторять
        //for удобно проверяет изменение переменной
    }
}
