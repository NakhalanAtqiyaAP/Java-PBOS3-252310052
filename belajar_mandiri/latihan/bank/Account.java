package bank;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;


    public Account(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double Deposit(double amount){
        if(amount > 0){
             this.balance += amount;
             System.out.println("Deposit berhasil! Saldo baru: "+ this.balance);
        }
        else{
            System.out.println("Jumlah deposit harus lebih dari 0");
        }
        return this.balance;
    }   

    public double WithDraw(double amount){
        if(amount <= this.balance && amount > 0){
            this.balance -= amount;
        }else{
            System.out.println("Saldo anda tidak mencukupi");
        }
        return this.balance;
    }

    public void DisplayInfo(){
        System.out.println("=== ATM ===");
        System.out.println("Saldo Anda:");
    }

    //Getter
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String ownerName(){
        return this.ownerName;
    }

    public double balance(){
        return this.balance;
    }
}
