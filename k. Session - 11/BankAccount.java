public class BankAccount {

    private static  String nameOfAccount;
    private static double balance;

    public BankAccount(){
    nameOfAccount = "";
    balance = 0;
    }
    
    public BankAccount(String accountName, double accountBalance){
        nameOfAccount = accountName;
        balance = accountBalance; 
    }
    
    public String toString(){
        String output = String.format("The name of the account: %s, ", nameOfAccount );
        output += String.format("Balance of the account: $%.2f", balance);
        return output;
    }
}
