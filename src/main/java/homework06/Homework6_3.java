package homework06;

public class Homework6_3 {
    public static void main(String[] args) {
//        Задача №3
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.

        String s = "Посмотрите как Рите нравится ритм";
        String str = s.toLowerCase();  //все делаем маленькими буквами

        String strLookingFor = "рит";  //что ищем

        int startIndex = 0;
        while ((startIndex = str.indexOf(strLookingFor, startIndex)) != -1) {
            int endIndex = startIndex + strLookingFor.length();

            System.out.println("Индекс начала подстроки " + startIndex);
            startIndex = endIndex; // Перемещаемся к концу текущего вхождения
        }
    }
}