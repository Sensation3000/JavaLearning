package lesson12.abstractClass1;

public class Main {
    public static void main(String[] args) {
        DogBreed shepard = new GermanShepard();
        System.out.println(shepard.getColor());
        System.out.println(shepard.bark());
        System.out.println(shepard.getHeight());

        //DogBreed someBreed = new DogBreed();
        //т.к это абстрактный класс его нельзя инстанциировать
        //это не полный, недоделанный чертеж

        DogBreed chihuahua = new Chihuahua();
        System.out.println(chihuahua.getColor());
        System.out.println(chihuahua.bark());
        System.out.println(chihuahua.getHeight());
    }
}
