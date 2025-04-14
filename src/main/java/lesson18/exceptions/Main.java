package lesson18.exceptions;

public class Main {
    public static void main(String[] args) {

        Grade grade1 = new Grade(5);
        Grade grade2 = new Grade(5);

        System.out.println(grade1.equals(grade2));
        // выдаст false если в классе Grade нет override метода equals
        // т.к если это два разных объекта, то они по умолчанию не равны

        // если нам важно сравнить саму оценку, то делаем override метода equals
        // и тогда будет true

        System.out.println(grade1 == grade2); // объекты по прежнему не равны
        // Через == проверка, что это именно тот самый объект

        System.out.println("=============Exceptions===========");

        Grade grade3 = new Grade(4);
        System.out.println(grade3);
        System.out.println("Graded as 5");

        // Grade grade4 = new Grade(10); //произошла ошибка
        // System.out.println(grade4);
        // System.out.println("Graded as 10");

        // Перехватываем Exception
        // и говорим, что с оценкой какая-то проблема
        // Когда используем try and catch вся джава как программа не заканчивается в выполнении
        // программа не вывалилась с ошибкой, а продолжает выполнение
        // можем ловить разные ошибки, а не только одну
        try {
            //try ознает код внутри выполнить, но быть готовым реагировать на ошибки

            Grade grade5 = new Grade(5);
            System.out.println(grade5);
            System.out.println("Graded as 5");

            //создаем кучу оценок, чтобы повысить вероятность возникновения Exception
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);
            new Grade(10);


        } catch (IllegalArgumentException e) {
            // это RunTime Exception, его не обязательно ловить

            System.out.println("Problem with the grade: " + e.getMessage());
            //вывести сообщение с ошибкой
            System.out.println("Please try again");
        } catch (Exception e) {
            //Checked Exception
            System.out.println("Something unexpected happened");
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("I'm done");

        System.out.println("=============Exceptions2===========");
        // System.out.println(divide(10,5));
        // если в методе не было предусмотрено, что делать с ошибкой, то управление передается выше
        // в данном случае должны положить вызов метода  divide try and catch

        try {
            System.out.println(divide(10, 5));
        } catch (ZeroException e) {
            System.out.println("Cannot divide by zero, try again");
        } finally {
            // будет выполненно всегда
            // нужно для контроля за ресурсами, закрываем connection
            System.out.println("this will always execute");
        }

        try {
            System.out.println(divide(10, 0));
        } catch (ZeroException e) {
            System.out.println("Cannot divide by zero, try again");
        } finally {
            System.out.println("this will always execute");
        }
    }

    //ошибки бывают 2 видов: Checked Exception and RunTime Exception
    //раньше все ошибки были Checked, их обязаны были объявлять в методе и соответственно писать на них обработчики ошибок
    //RunTime - не обязательно писать обработчики

    public static int divide(int a, int b) throws ZeroException {
        if (b == 0) throw new ZeroException();
        return a / b;
    }
}

class ZeroException extends Exception {
    //это Checked Exception
}
