package homework02;

public class HW2_3_second_edition {
    public static void main(String[] args) {
        //Задача №3
        //
        //Создать программу дележа добычи на пиратском корабле.
        // По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
        // остальное делится поровну между всеми членами команды, включая капитана.
        //
        //Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
        //
        //Вывести на экран кому сколько пиастров полагается
        //Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

        int loot = 1000;
        int pirates = 38;

        divideLoot(loot, pirates);
    }

    public static void divideLoot(int loot, int pirates){
        int shipOwnerLoot = loot / 2;
        int remainder = loot - shipOwnerLoot;

        int captainLoot = remainder / 2;
        remainder = remainder - captainLoot;

        int everyPiratLoot = remainder / pirates;
        remainder = remainder - (everyPiratLoot * pirates);

        int jackSparrowLoot = shipOwnerLoot + captainLoot + everyPiratLoot;

        int isLoot = shipOwnerLoot + captainLoot + (everyPiratLoot * pirates) + remainder;

        System.out.println("How much loot has ship owner? "+ shipOwnerLoot);
        System.out.println("How much loot has captain? "+ captainLoot);
        System.out.println("How much loot has ordinary pirat? "+ everyPiratLoot);
        System.out.println("How much is the remainder? " + remainder);
        System.out.println("How much has Captain Jack Sparrow? " + jackSparrowLoot);
        System.out.print("The loot was " + loot + "? ");
        System.out.println(isLoot == loot);
    }
}
