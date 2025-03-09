package lesson10;

//если не показано отчего наследуется класс, то он всегда наследуется от Object
public class Calc extends Object {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1, 2));  //вызов метода с аргументами int и int
        System.out.println(c.add(1, 2f)); //вызов метода с аргументами int и float
        System.out.println(c.add(1f, 2)); //вызов метода с аргументами float и int
    }

    public double add(int a, int b) {
        return a + b;
    }

    public double add(int a, float b) {
        return a + b;
    }

    public double add(float a, int b) {
        return a + b;
    }
}
