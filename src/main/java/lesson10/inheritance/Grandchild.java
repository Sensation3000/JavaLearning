package lesson10.inheritance;

public class Grandchild extends Child {
    final String lastName;

    public Grandchild(String lastName) {
        this.lastName = lastName;
    }

    //через Generate -> Override methods
    @Override
    public String whoAmI() {
        //по умолчанию делает его таким же как и у родителя с помощью слова super
        return "NOT " + super.whoAmI() + "\n I'm a Grandchild with name " + name;
        //мы можем вызвать имплементацию методов родителя через super.
        //имеем доступ только к предыдущему уровню. К дедуле доступа нет
        //super - на 1 уровень наследования вверх, не на самый верх
    }
}
