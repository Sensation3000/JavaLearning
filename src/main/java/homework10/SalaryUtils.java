package homework10;

public class SalaryUtils {
    public static double getTotalSalary(Employee[] employees, Month[] monthArray){
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary(monthArray);
        }
        return sum;
    }
}
