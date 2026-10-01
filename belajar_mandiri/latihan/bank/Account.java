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

    public double deposit(double amount){
        if(amount > 0){
             this.balance += amount;
             System.out.println("Deposit berhasil! Saldo baru: "+ this.balance);
        }
        else{
            System.out.println("Jumlah deposit harus lebih dari 0");
        }
        return this.balance;
    }   

    public double withDraw(double amount){
        if(amount <= this.balance && amount > 0){
            this.balance -= amount;
        }else{
            System.out.println("Saldo anda tidak mencukupi");
        }
        return this.balance;
    }

    public void displayInfo() {
        System.out.println("\n=== INFORMASI AKUN ===");
        System.out.println("No. Rekening : " + this.accountNumber);
        System.out.println("Nama Pemilik : " + this.ownerName);
        System.out.println("Saldo Anda   : Rp " + this.balance);
    }

    //Getter
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public double getBalance(){
        return this.balance;
    }
}
