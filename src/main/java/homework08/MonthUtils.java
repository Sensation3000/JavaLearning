package homework08;

public class MonthUtils {

    static Month january = makeMonth("January", 31, 23);
    static Month february = makeMonth("February", 28, 20);
    static Month march = makeMonth("March", 31, 22);
    static Month april = makeMonth("April", 30, 22);
    static Month may = makeMonth("May", 31, 22);
    static Month june = makeMonth("June", 30, 21);
    static Month july = makeMonth("July", 31, 22);
    static Month august = makeMonth("August", 31, 23);
    static Month september = makeMonth("September", 30, 22);
    static Month october = makeMonth("October", 31, 23);
    static Month november = makeMonth("November", 30, 20);
    static Month december = makeMonth("December", 31, 23);

    //factory method
    static Month makeMonth(String monthName, int numberOfDays, int numberOfWorkDays) {
        Month month = new Month();
        month.monthName = monthName;
        month.numberOfDays = numberOfDays;
        month.numberOfWorkDays = numberOfWorkDays;
        return month;
    }

/*
    other way (when there is yet no knowledge about constructors or factory method
    public static Month getJanuary () {
        Month january = new Month();
        january.monthName = "January";
        january.numberOfWorkDays = 31;
        january.numberOfDays = 23;
        return january;
    }
*/

}
