package Day5;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //Getter for accountNumber
    public String getAccountNumber(){
        return accountNumber;
    }
    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Getter for AccountHolderName
    public String getAccountHolderName(){
        return accountHolderName;
    }
    //Setter for AccountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Bank Balance: " + balance);
    }
}
