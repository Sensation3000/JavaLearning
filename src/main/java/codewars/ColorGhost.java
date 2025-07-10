package codewars;

//https://www.codewars.com/kata/53f1015fa9fe02cbda00111a/train/java
//Color Ghost
//Create a class Ghost
//
//Ghost objects are instantiated without any arguments.
//
//Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
//
//Ghost ghost = new Ghost();
//ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"

import java.util.Random;

public class ColorGhost {
    private String[] colors = {"white","yellow", "purple", "red"};
    private String color;

    public ColorGhost(){
        Random random = new Random();
        String randomColor = colors[random.nextInt(colors.length)];
        this.color = randomColor;
    }

    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        ColorGhost colorGhost1 = new ColorGhost();
        System.out.println(colorGhost1.getColor());

        ColorGhost colorGhost2 = new ColorGhost();
        System.out.println(colorGhost2.getColor());

        ColorGhost colorGhost3 = new ColorGhost();
        System.out.println(colorGhost3.getColor());
    }
}


