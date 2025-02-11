package lesson03;

public class Lesson3_2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        boolean res = x == y; //строгое сравнение
        //>= больше или равно
        //<= меньше или равно

        //приоритет операторов - умножение первое, сложение второе.
        //у операторов сравнения наименьший приоритет
        System.out.println(res);
        System.out.println(!res);//не равно
        System.out.println(!(x == y));// не равно применяем к выражению

        if (!(x < y)){
            System.out.println("true!");
        } else {
            System.out.println("false!");
        }

        //or
        // true or true == true
        // true or false == true
        // false or true == true
        // false or false == false

        if (x == y || x + 2 > 3){
            System.out.println("or!");
        }

        //and
        // true and true == true
        // true and false == false
        // false and true == false
        // false and false == false

        if (x == y && x + 2 < 10){
            System.out.println("and!");
        } else {
            System.out.println("false!");
        }
    }
}
