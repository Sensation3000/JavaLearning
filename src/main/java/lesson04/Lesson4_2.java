package lesson04;

public class Lesson4_2 {
    public static void main(String[] args) {

        // цикл while
        int a = 4;
        while (a > 1) {
            System.out.println("a > 1: " + a);
            a = a - 1; //другое написание a-=1 или a--
        }
        System.out.println("Done");
    }
}
