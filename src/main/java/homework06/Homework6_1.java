package homework06;

public class Homework6_1 {
    public static void main(String[] args) {
//        Задача №1
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)

        //1 вариант
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о'){
                System.out.print(s.charAt(i));;
            }
        }

        System.out.println(" ");

        //2 вариант c циклом forEach
        for (char c : s.toCharArray()){ // перевели строку в массив символов
            if (c == 'о'){
                System.out.print(c);;
            }
        }
    }
}
