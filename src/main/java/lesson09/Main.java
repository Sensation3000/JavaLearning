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

        BankAccount anotherAccount3 = BankAccount.withDefoultOverDraft("765", 1000);
        System.out.println(anotherAccount3.makeSummary());

        BankAccount anotherAccount4 = BankAccount.withDefoultBalance("764353455", 1000);
        System.out.println(anotherAccount4.makeSummary());





    }
}
