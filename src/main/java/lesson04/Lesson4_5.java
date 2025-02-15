package lesson04;

public class Lesson4_5 {
    public static void main(String[] args) {
        //вложенные циклы

        boolean lefToRight = true;
        for (int i = 0; i < 10; i++) {
            if(lefToRight){
                for (int j = 0; j < 5; j++) {
                    System.out.print(j); //напечатай без перевода на новую строку
                }
            } else {
                for (int j = 5; j > 0; j--) {
                    System.out.print(j); //напечатай без перевода на новую строку
                }
            }
            lefToRight = !lefToRight; //меняем значение флага наоборот
            System.out.println(); //после каждого прохода цикла сделай перейди на новую строку
        }
        System.out.println("Done");
    }
}