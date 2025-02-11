package lesson4;

public class Lesson4_1 {
    public static void main(String[] args) {
        boolean itMoves = true;
        boolean itShouldMove = false;

        //1 вариант
        //все понятно,но есть повторяющийся код
        if (itMoves){
            if(itShouldMove){
                System.out.println("No Problem");
            } else {
                System.out.println("Use duct tape!");
            }
        } else {
            if (itShouldMove){
                System.out.println("Use WD-40!");
            } else {
                System.out.println("No problem!");
            }
        }

        //2 вариант
        // c использованием операторов or и and
        if ((itMoves && itShouldMove) || (!itMoves && !itShouldMove)){
            System.out.println("No problem!");
        } else {
            if (!itMoves) {
                System.out.println("Use WD-40!");
            } else {
                System.out.println("Use duct tape!");
            }
        }

        //3 вариант
        // еще больше упрощаем
        if ((itMoves == itShouldMove)){
            System.out.println("No problem!");
        } else {
            if (!itMoves) {
                System.out.println("Use WD-40!");
            } else {
                System.out.println("Use duct tape!");
            }
        }
    }
}
