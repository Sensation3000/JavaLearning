package lesson09;

public class Main {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount("123456");
        System.out.println(checking.makeSummary());
        checking.credit(100);

        System.out.println(checking.makeSummary());

        checking.credit(100);
        System.out.println(checking.makeSummary());

        checking.debit(150);
        System.out.println(checking.makeSummary());

        //checking.balance = - 1900;
        System.out.println(checking.getBalance());

        checking.setBlocked(true);

        checking.credit(100);
        System.out.println(checking.isBlocked());
        System.out.println(checking.makeSummary());

        BankAccount anotherAccount1 = new BankAccount("78343658695");
        System.out.println(anotherAccount1.makeSummary());

        BankAccount anotherAccount2 = new BankAccount("78343245345", 10000);
        System.out.println(anotherAccount2.makeSummary());

        BankAccount anotherAccount3 = BankAccount.withDefaultOverDraft("764353455", 1000);
        System.out.println(anotherAccount3.makeSummary());

        BankAccount anotherAccount4 = BankAccount.withDefaultBalance("764353455", 1000);
        System.out.println(anotherAccount4.makeSummary());

        BankAccount[] myAccounts = {
                new BankAccount("1233444"),
                new BankAccount("45434636", 0, 0),
                new BankAccount("0987654567890")
        };

        Grade five = new Grade(5);
        System.out.println(five.getNumGrade());

        Grade anotherFive = new Grade(5);
        System.out.println(anotherFive.getNumGrade());

        System.out.println(five.equals(anotherFive));
        // изначально false т.к это разные объекты класса Grade
        // делаем свой метод через generate equals и теперь будет true

        Grade ef = new Grade('A');
        System.out.println(ef.getNumGrade());
    }
}
