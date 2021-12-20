
package sajd522;

import javax.swing.JOptionPane;

class Account{
    private int id;
    private double balance;
    private String name;
    
    private java.util.Date dateCreated;
    

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void printStatement(){
        System.out.println("Name:" + getName() 
                                    +"\nBalance: " + getBalance()
                                    +"\nDate Created: " + getDateCreated());
    }

    
}
