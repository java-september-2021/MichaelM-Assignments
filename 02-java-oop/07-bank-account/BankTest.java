public class BankTest {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount();
        myBank.depositMoney(10,"checking");
        myBank.getTotalAccountMoney();
        myBank.depositMoney(100, "saving");
        myBank.getTotalAccountMoney();
        myBank.withdrawMoney(50, "saving");
        myBank.getTotalAccountMoney();
        // myBank.withdrawMoney(50, "checking");
        // myBank.getTotalAccountMoney();
    }
}
