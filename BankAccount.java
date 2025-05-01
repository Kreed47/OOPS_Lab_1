 class BankAccount {
     private double balance;


     public void deposit(double amount) {
         if (amount > 0) {
             balance += amount;
             System.out.println("Deposited: " + amount);
         } else {
             System.out.println("Invalid deposit amount");
         }
     }


     protected void withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
             balance -= amount;
             System.out.println("Withdrawn: " + amount);
         } else {
             System.out.println("Invalid withdraw amount or insufficient balance");
         }
     }


     void checkBalance() {
         System.out.println("Current Balance: " + balance);
     }
}


