package lesson10.inheritance;

//если у класса стоит слово extends,
//это значит что это прямой наследник другого класса
//родитель может быть только один
//цепочка может быть сколь угодно длинной
//автоматически получаем все поля и методы родительского класса
public class Child extends Parent {
    protected String name;
    //protected - будет доступно наследникам и всем классам в этом package

    public String getName() {
        return name;
    }

    @Override
    //если мы поставим final это значит наследникам более не разрешаем менять имплементацию
    public String whoAmI() {
        return "Nope I am a Child";
    }
}
