package lesson12.abstractClass2;

public class Worker extends AbstractEmployee {

    private final double hourlyWage;

    protected Worker(String name, double hourlyWage) {
        super(name);
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double getDaylySalary() {
        return hourlyWage * 8;
    }

    public String getNameTag() {
        return String.format("Hello, I'm %s", getName());
    }
}
