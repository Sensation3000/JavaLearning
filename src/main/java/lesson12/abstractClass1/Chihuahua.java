package lesson12.abstractClass1;

public class Chihuahua extends DogBreed {

    @Override
    public String bark() {
        return "Тяв-тяв";
    }

    @Override
    public String getColor() {
        return "tan";
    }

    @Override
    public int getHeight() {
        return 15;
    }
}
