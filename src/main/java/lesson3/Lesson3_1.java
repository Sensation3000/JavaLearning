package lesson3;

public class Lesson3_1 {
    public static void main(String[] args) {

        int baseSalary = 1000;
        int h1 = 65;

        int hCount = 40;
        int payment = baseSalary + (h1 * hCount);

        if (payment < 2000) {
            System.out.println("ЗП меньше, чем должна быть, итого " + payment);
        } else if (payment > 2000) {
            System.out.println("ЗП больше, чем должна быть, итого " + payment);
            if (payment > 3000) {
                payment = payment - (payment / 100 * 3);
                System.out.println("Минус налоги, итого " + payment);
            } else {
                //блок else опциональный
                System.out.println("ЗП соответствует требованиям, итого " + payment);
            }
        }
    }
}