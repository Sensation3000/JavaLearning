package homework06;

public class Homework6_2 {
    public static void main(String[] args) {
//        Задача №2
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
        String s = "Перевыборы выбранного президента";

        //1 вариант
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                counter++;
            }
        }
        System.out.println(counter);

        //2 вариант
        int counter2 = 0;
        for (char c : s.toCharArray()) {
            if (c == 'е') {
                counter2++;
            }
        }
        System.out.println(counter2);
    }
}
