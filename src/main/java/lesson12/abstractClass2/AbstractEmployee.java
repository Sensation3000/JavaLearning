package lesson12.abstractClass2;

public abstract class AbstractEmployee {

    private  final String name;

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getDaylySalary();
}
