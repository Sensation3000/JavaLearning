package lesson06;

public class Lesson6_10 {
    public static void main(String[] args) {

        int[][] dailyCalories = {
                {343, 546, 565, 520},
                {573, 458, 378, 654},
                {666, 777, 124, 465, 100},
        };

        int maxCalories = Integer.MIN_VALUE;
        for (int i = 0; i < dailyCalories.length; i++) {
            //once pre line
            for (int j = 0; j < dailyCalories[i].length; j++) {
                //once per meal
                if (dailyCalories[i][j] > maxCalories) {
                    maxCalories = dailyCalories[i][j];
                }
            }
        }
        System.out.println(maxCalories);
    }
}