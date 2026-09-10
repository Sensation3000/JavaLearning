package codewars;

//Перевернуть строку (Reverse String)
//Описание: Написать функцию, которая принимает строку и возвращает её в перевернутом виде. (Проверяет: работа со строками, циклы/рекурсия/StringBuilder)
//Задание: Напишите метод String reverseString(String str), который принимает строку и возвращает новую строку, являющуюся перевернутой версией исходной.
//Пример: reverseString("hello") -> "olleh", reverseString("Java") -> "avaJ".

public class ReverseString {

    //вариант 1
    // O(n) сложность — работает с изменяемым массивом char[]
    //Обмен символов происходит in-place (без создания новых объектов на каждой итерации)
    //Создается только один новый объект String в конце
    public static String reverseString(String str){
        if(str == null){
            return null;
        }
        if(str.isEmpty()){
            return "";
        }

        char[] charArray = str.toCharArray();
        int leftPointer = 0;
        int rightPointer = charArray.length - 1;
        while (leftPointer < rightPointer){
            char temp = charArray[rightPointer] ;
            charArray[rightPointer] = charArray[leftPointer];
            charArray [leftPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        return new String(charArray);
    }

    // вариант 2 с помощью StringBuilder
    // Внутри StringBuilder используется изменяемый массив символов (char[]).
    // Когда вызываем метод .reverse(), он меняет местами символы внутри этого массива (похоже на первый ручной вариант),
    // но делает это очень оптимизированно на уровне JVM.
    // Никаких лишних созданий объектов String в цикле.

    public static String reverseStringStringBuilder(String str){
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // 3 вариант не очень хороший т.к  сложность  O(n².
    // При каждой итерации result += str.charAt(i) создается новый объект String,
    // так как String в Java иммутабельный
    public static String reverseString2(String str){
        if(str == null){
            return null;
        }
        if(str.isEmpty()){
            return "";
        }
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("Привет"));
        System.out.println(reverseStringStringBuilder("Привет"));
        System.out.println(reverseStringStringBuilder(null));
        System.out.println(reverseStringStringBuilder(""));
        System.out.println(reverseString2("Привет"));
    }
}
