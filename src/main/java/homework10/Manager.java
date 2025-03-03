package homework10;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, double salaryInDay, int numberOfSubordinates) {
        super(name, salaryInDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray){
        double baseSalary = 0.0;
        for (Month month : monthArray)  {
            baseSalary = baseSalary + (getSalaryInDay() * month.getNumberOfWorkDays());
        }
        return baseSalary + baseSalary * 0.01 * numberOfSubordinates;
    }

    @Override
    public String printSalary(Month[] monthArray){
        String whichMonths = "";
        for (int i = 0; i < monthArray.length; i++) {
            whichMonths += monthArray[i].getMonthName() + " ";
        }
        return "For " + whichMonths + "salary of manager " + this.getName() + " " + getSalary(monthArray);
    }
}
