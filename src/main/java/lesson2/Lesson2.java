package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(1234 + 4467);

        int x; //тип переменной int и название переменной
        x = 1234;   //в эту переменную кладем значение. Знак равно это оператор присваивания
        int y = 4467;
        System.out.println(x + y); //достали значения из переменных, сложили и только полученный результат распечатали

        int regular = 30;
        int doppel = 10;
        int leut = 1;
        int captain = 1;

        int baseSalary = 7;

        int summa = regular * baseSalary
                + doppel * baseSalary * 2
                + leut * baseSalary * 10
                + captain * baseSalary * 100;

        System.out.println(summa);

        int regMoney = regular * baseSalary;
        int doppelMoney = doppel * baseSalary * 2;
        int leutMoney = leut * baseSalary * 10;
        int captainMoney = captain * baseSalary * 100;

        int summa2 = regMoney + doppelMoney + leutMoney + captainMoney;
        System.out.println(summa2);



    }
}
