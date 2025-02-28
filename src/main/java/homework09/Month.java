package homework09;

public class Month {
    private final String monthName;
    private final int numberOfDays;
    private final int numberOfWorkDays;

    public Month(String monthName, int numberOfDays, int numberOfWorkDays) {
        this.monthName = monthName;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }
}
