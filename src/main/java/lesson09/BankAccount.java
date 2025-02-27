package lesson09;

public class BankAccount {
    private String accountNo;
    private int balance;
    private int maxOverDraft;
    private boolean blocked = false;

    //модификатор доступа private - не доступность за пределами класса
    //все поля в классе делаются private
    //для всех полей, к которым хотите дать доступ на чтение создаются методы геттеры
    //для всех полей, к которым хотите дать доступ на изменение создаются методы сеттеры
    //если у приватного поля есть сеттер, любой класс может задать и изменить значение поля
    //если у приватного полясеттера нет, изменить значение поля нельзя

    // конструктор - специальный метод, который отрабатывает единственный раз в момент создания экземпляра класса

    // дефолтный конструктор - есть у каждого класса, у него нет параметр
    // public BankAccount (){} //так он выглядит если специально его написать.
    // В обычном виде не виден совсем. "Ты суслика видишь? Нет, и я нет, а он есть"
    //содержит одновременно и имя и возвращаемый тип


    //альтернативный или кастомный конструктор
    //содержит одновременно и имя и возвращаемый тип
    //передаются параметры
    //при создании кастомного конструктора, умрет конструктор по умолчанию.
    // Если конечно мы его не вернем к жинзни, специально прописав в коде
    // конструкторов может быть несколько

    //1 конструктор
    public BankAccount(String accountNo, int balance, int maxOverDraft) {
        if (accountNo.length() < 5) {
            System.out.println("Creating account with suspiciously short number");
        }
        if (balance < 0) {
            System.out.println("Shouldn't create negative balance");
        }
        if (maxOverDraft < 0) {
            System.out.println("Shouldn't create negative maxOverDraft");
        }
        this.accountNo = accountNo;
        this.balance = balance;
        this.maxOverDraft = maxOverDraft;
    }

    //2 конструктор
    public BankAccount(String accountNo) {
        this(accountNo, 0, 0);  // через this обращение к другому конструктору
    }

    //3 конструктор
    public BankAccount(String accountNo, int balance) {
        this(accountNo, balance, 0);
    }

    //4 конструктор - не сработает в глазах джавы он одинаковый с 3 конструктором,
    // т.к очередность, тип и количество параметров одинаковы
    //    public BankAccount (String accountNo, int maxOverDraft){
    //        this(accountNo, 0, maxOverDraft);
    //    }

    //геттер возвращает значение конкретного типа данных
    public String getAccountNo() {  //с названием getИмяПоля
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isBlocked() {  //если поле типа boolean, то название будет не get, а is
        return blocked;
    }

    //сеттер ничего не возвращает
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
        // this - показывает на текущий экземпляр.
        // В статических методах this не может использоваться, т.к там нет экземпляров
        // слева blocked - это поле, а справа это переменная из параметра
    }

    public void credit(int amount) {
        if (blocked) {
            System.out.println("Account is blocked");
            return;
        }
        balance += amount;
    }

    public void debit(int amount) {
        if (blocked) {
            System.out.println("Account is blocked");
            return;
        }
        if (balance < amount) {
            System.out.println("Cannot withdraw more than you have");
        } else {
            balance -= amount;
        }
    }

    public String makeSummary() {
        return (isBlocked() ? "Blocked " : "") +
                "Account: " + accountNo + ", balance: " + balance +
                "\n max over draft: " + maxOverDraft;
    }

    //factory method - статические - создание нового экземляра
    public static BankAccount withDefoultOverDraft(String accountNo, int balance) {
        return new BankAccount(accountNo, balance, 0);
    }

    //factory method - статические - создание нового экземляра
    public static BankAccount withDefoultBalance(String accountNo, int maxOverDraft) {
        return new BankAccount(accountNo, 0, maxOverDraft);
    }
}
