package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(1234 + 4467);

        int x; //тип переменной int и название переменной
        x = 1234;   //в эту переменную кладем значение. Знак равно это оператор присваивания
        x = x + 1;  //можно переприсваивать данные в переменную
        int y = 4467;
        System.out.println(x + y); //достали значения из переменных, сложили и только полученный результат распечатали

        int regular = 30;
        int doppel = 10;
        int archers = 15;
        int leut = 1;
        int captain = 1;

        int baseSalary = 7;

        int summa = regular * baseSalary
                + (doppel + archers) * baseSalary * 2
                + leut * baseSalary * 10
                + captain * baseSalary * 100;

        System.out.println(summa);

        int regMoney = regular * baseSalary;
        int doppelMoney = (doppel + archers) * baseSalary * 2;
        int leutMoney = leut * baseSalary * 10;
        int captainMoney = captain * baseSalary * 100;

        int summa2 = regMoney + doppelMoney + leutMoney + captainMoney;
        System.out.println(summa2);
        System.out.println("=====================================");

        long b = 10L; //long
        float a = 10F; //float, тип данных float можно положить в переменную типа double, но не наоборот
        double c = 10.0; //double

        int oranges = 11;
        //double half = oranges / 2;  // если с обеих сторон целочисленные числа, то и деление целочисленное
        //даже если результат кладем в double
        double half = oranges / 2.0;
        double testTesult = half * 2;

        System.out.println(half);
        System.out.println(testTesult);

        int oranges2 = 11;
        int half2 = oranges2 / 2;
        int remainder = oranges2 % 2; //остаток от целочисленного деления
        System.out.println(remainder);

        //CHAR
        char f = 80;
        System.out.println(f); //напечатает символ P т.к код 80 соответствует этой латинской букве

        char r = 100;
        char d = 'd';   //пишем в одинарных кавычках
        System.out.println(r == d); // true т.к они идентичны
        System.out.println(r);  //напечатает символ d
        System.out.println(d);  //напечатает символ d

        char letterD = 'd';
        char result = (char) (letterD +1);  // 100+1 перевод в char
        System.out.println(result);   //напечатает символ e

        int a1 = 100;
        System.out.println((char) a1);  //напечатает символ d  т.к мы перевели значение переменной типа int в char
    }
}
