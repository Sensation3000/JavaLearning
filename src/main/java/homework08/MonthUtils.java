package homework08;

public class MonthUtils {

    public static Month[] monthArray = {
            makeMonth("January", 31, 23),
            makeMonth("February", 28, 20),
            makeMonth("March", 31, 22),
            makeMonth("April", 30, 22),
            makeMonth("May", 31, 22),
            makeMonth("June", 30, 21),
            makeMonth("July", 31, 22),
            makeMonth("August", 31, 23),
            makeMonth("September", 30, 22),
            makeMonth("October", 31, 23),
            makeMonth("November", 30, 20),
            makeMonth("December", 31, 23),
    };

    //factory method
    static Month makeMonth(String monthName, int numberOfDays, int numberOfWorkDays) {
        Month month = new Month();
        month.monthName = monthName;
        month.numberOfDays = numberOfDays;
        month.numberOfWorkDays = numberOfWorkDays;
        return month;
    }
}
