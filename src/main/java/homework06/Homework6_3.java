package homework06;

public class Homework6_3 {
    public static void main(String[] args) {
//        Задача №3
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.

        String s = "Посмотрите как Рите нравится ритм";
        String loweredStr = s.toLowerCase();  //все делаем маленькими буквами
        String strLookingFor = "рит";  //что ищем

        //1 вариант
        int startIndex = 0;
        while ((startIndex = loweredStr.indexOf(strLookingFor, startIndex)) != -1) {
            int endIndex = startIndex + strLookingFor.length();
            System.out.println("Индекс начала подстроки " + startIndex);
            startIndex = endIndex; // Перемещаемся к концу текущего вхождения
        }

        //2 вариант
        int lastFound = loweredStr.indexOf(strLookingFor);
        while (lastFound > -1) {
            System.out.println(lastFound);
            lastFound = loweredStr.indexOf(strLookingFor, lastFound + 1);
        }

        //3 вариант
        for (
                int lastFound2 = loweredStr.indexOf(strLookingFor);
                lastFound2 > -1;
                lastFound2 = loweredStr.indexOf(strLookingFor, lastFound2 + 1)) {
            System.out.println(lastFound2);
        }
    }
}