import java.util.Random;

public class BankAccount {
    // attribute 
    private String accountNumber;
    private double checkingAccount;
    private double savingAccount;
    private static int numberOfAccounts;
    private static double totalMoney;

    //Constructors
    public BankAccount(){
        this.accountNumber = this.randNumber();
        this.checkingAccount = 0;
        this.savingAccount = 0;
        numberOfAccounts++;

    }

    //methods
    private String randNumber(){
        String acctNum = "";
        Random k = new Random();
        for (int i=0;i>10;i++){
            acctNum = acctNum.concat(String.valueOf(k.nextInt(10)));
        }
        return acctNum;
    }

    public String getTotalAccountMoney(){
        return "Total amount in Accounts: " + getCheckingAcct() + getSavingAcct(); 
    }

    public void depositMoney(double amount, String accountType) {
        if (accountType.equals("checking")){
            this.setCheckingAcct(this.getCheckingAcct() + amount);
        }else if (accountType.equals("saving")){
            this.setSavingAcct(this.getSavingAcct() + amount);
            
        }else {
            System.out.println("Invalid Account Type");
            return;
        }
        
        totalMoney += amount;
    }
    public void withdrawMoney(double amount, String accountType) {
        if (accountType.equals("checking")){
            if (this.getCheckingAcct() - amount < 0){
                System.out.println("Insufficient Funds");
            }else
            this.setCheckingAcct(this.getCheckingAcct() - amount);
            totalMoney -= amount;

        }else if (accountType.equals("saving")){
            if(this.getSavingAcct() - amount <0){
                System.out.println("Insufficient Funds");
            }else
            this.setSavingAcct(this.getSavingAcct() - amount);
            totalMoney -= amount;
        }else {
            System.out.println("Invalid account type");
            return;
        }
        
    }

    //setters and getters

    public String getAccountNumber(){
        return accountNumber;        
    }
    private void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getCheckingAcct(){
        return checkingAccount;
    }
    private void setCheckingAcct(double checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
    public double getSavingAcct(){
        return savingAccount;
    }
    private void setSavingAcct(double savingAccount) {
        this.savingAccount = savingAccount;
    }
    public int getNumberOfAccounts(){
        return numberOfAccounts;
    }
    private void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
    public double getTotalMoney(){
        return totalMoney;
    }
    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }



}
