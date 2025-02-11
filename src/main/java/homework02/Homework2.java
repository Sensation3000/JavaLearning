package homework02;

public class Homework2 {
//    Задача №1
//    Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
//    и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание,
//    деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Сложение a и b равно " + (a + b));
        System.out.println("Умножение a и b равно " + (a * b));
        System.out.println("Вычитание a и b равно " + (a - b));
        System.out.println("Деление a и b равно " + (a / b));
        System.out.println("Остаток от деления a и b равно " + (a % b));

        if (a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }

        if (b % 2 == 0) {
            System.out.println("b is even");
        } else {
            System.out.println("b is odd");
        }

//        Задача №2
//        Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
//        а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).

        int m = 10;
        int n = 15;
        int temp;
        System.out.println("m is " + m);
        System.out.println("n is " + n);

        //1 вариант
        temp = m;
        m = n;
        n = temp;

        //второй вариант
//        m = m + n; //a = 25, b = 10
//        n = m - n; //a = 25, b = 10
//        m = m - n; //a = 15, b = 10

        System.out.println("m is " + m);
        System.out.println("n is " + n);

//        Задача №3
//        Создать программу дележа добычи на пиратском корабле.
//        По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
//        остальное делится поровну между всеми членами команды, включая капитана.
//
//        Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
//
//        Вывести на экран кому сколько пиастров полагается
//        Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
//
//        Дополнительное задание со звездочкой
//        Попробовать придумать как программа может проверить правильность дележа.


//        1 вариант
        int treasure = 18000;
        int regularPirates = 14;
        double shipOwner = treasure / 2;
        double captain = shipOwner / 2;
        double regularPirate = (treasure - shipOwner - captain)/(regularPirates + 1);
        boolean isOwner = true;


        System.out.println("treasure is " + treasure);
        System.out.println("ship owner gets " + shipOwner);
        System.out.println("jack sparrow gets " + (captain + regularPirate));
        System.out.println("regular pirate gets " + regularPirate);
        System.out.println("Captain Kack Sparrow gets " + (captain + shipOwner));
        System.out.println(shipOwner + captain + regularPirate * 15);

        if (shipOwner + captain + (regularPirate * 15) == (int) Math.round(treasure)){
            System.out.println("sharing was true");
        } else {
            System.out.println("sharing was false");
        }



//        2 вариант
        int totalLoot = 2599;
        int numberOfPirates = 37;
        int remaider = totalLoot;

        int ownerShare = remaider / 2;
        remaider = remaider - ownerShare;

        int captainShare = remaider / 2;
        remaider = remaider - captainShare;

        int eachRegularPirate = remaider / (numberOfPirates + 1);
        remaider = remaider % (numberOfPirates + 1); //остаток от деления

        captainShare = captainShare + eachRegularPirate;

        System.out.println("total Loot is " + totalLoot);
        System.out.println("ownerShare is " + ownerShare);
        System.out.println("captainShare is " + captainShare);
        System.out.println("eachRegularPirate gets " + eachRegularPirate);
        System.out.println("Captain Kack Sparrow gets " + (captainShare + ownerShare));
        System.out.println("remainder " + remaider);

        System.out.println("The sharing is ");
        System.out.println(ownerShare + captainShare + eachRegularPirate * numberOfPirates + remaider == totalLoot);
    }
}
