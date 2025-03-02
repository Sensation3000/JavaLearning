package lesson10.inheritance;

public class GrandGrandChild extends Grandchild {
    private final String firstName;

    public GrandGrandChild(String lastName, String firstName) {
        super(lastName); //обращаемся к конструктору родителя
        //super ("Ivanov") //если не хотим чтобы менялась фамилия
        this.firstName = firstName;
    }
}
