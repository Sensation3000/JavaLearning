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

//    public static void main(String[] args) {
//        //other way
//        Month month1 = new Month();
//        month1.monthName = "January";
//        month1.numberOfWorkDays = 31;
//        month1.numberOfDays = 23;
//
//        Month month2 = new Month();
//        month2.monthName = "February";
//        month2.numberOfWorkDays = 28;
//        month2.numberOfDays = 20;
//
//        Month month3 = new Month();
//        month3.monthName = "March";
//        month3.numberOfWorkDays = 31;
//        month3.numberOfDays = 22;
//
//        Month month4 = new Month();
//        month4.monthName = "April";
//        month4.numberOfWorkDays = 30;
//        month4.numberOfDays = 22;
//
//        Month month5 = new Month();
//        month5.monthName = "May";
//        month5.numberOfWorkDays = 31;
//        month5.numberOfDays = 22;
//
//        Month month6 = new Month();
//        month6.monthName = "June";
//        month6.numberOfWorkDays = 30;
//        month6.numberOfDays = 21;
//
//        Month month7 = new Month();
//        month7.monthName = "July";
//        month7.numberOfWorkDays = 31;
//        month7.numberOfDays = 22;
//
//        Month month8 = new Month();
//        month8.monthName = "August";
//        month8.numberOfWorkDays = 31;
//        month8.numberOfDays = 23;
//
//        Month month9 = new Month();
//        month9.monthName = "September";
//        month9.numberOfWorkDays = 30;
//        month9.numberOfDays = 22;
//
//        Month month10 = new Month();
//        month10.monthName = "October";
//        month10.numberOfWorkDays = 31;
//        month10.numberOfDays = 23;
//
//        Month month11 = new Month();
//        month11.monthName = "November";
//        month11.numberOfWorkDays = 30;
//        month11.numberOfDays = 20;
//
//        Month month12 = new Month();
//        month12.monthName = "December";
//        month12.numberOfWorkDays = 31;
//        month12.numberOfDays = 23;
//
//        Month[] months = {month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
//    }
}
