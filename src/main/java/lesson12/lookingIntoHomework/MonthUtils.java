package lesson12.lookingIntoHomework;

public class MonthUtils {
    //public static Month JANUARY = makeMonth("January");
    //JANUARY.name = "January"; //так джава не понимает, т.к. непонятно когда запускать это присваивание
    // когда класс только определился? это невозможно, т.к. там никакого кода еще не исполняем и никакие действия не делаем
    // когда инстанциируем новый инстанс? тоже неправильно, для этого есть конструкторы, и еще январь определен как статик
    //нужно писать внутри метода

    //    private static Month makeMonth (String name){
//        Month month = new Month();
//        month.name = name;
//        return month;
//    }

    public static Month JANUARY = new Month();

    //анонимный статический метод, который сразу запустится
    //это костыль
    //лучше все через конструктор делать

    static {
        JANUARY.name = "January";
    }
}
