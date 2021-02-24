import java.util.Scanner;

class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }
    public boolean isSufficientBalance(int w)
    {
        if (bal>w)
            return true;
        else
            return false;
    }
    public void withdraw(int amt)
    {
        bal = bal-amt;
        System.out.println("Withdrawl amount is "+amt);
        System.out.println("Your current balance is "+bal);
    }
}
class Customer implements Runnable
{
    private Account account;
    private String name;
    public Customer(Account account, String name)
    {
        this.account= account;
        this.name=name;
    }
    public void run() {
        Scanner s = new Scanner(System.in);
        synchronized (account) {
            System.out.println(name + ", Enter amount to withdraw");
            int amt = s.nextInt();

            if (account.isSufficientBalance(amt)) {
                System.out.println(name);
                account.withdraw(amt);
            } else
                System.out.println("Insufficient Balance");
        }
    }
}
public class Ques11 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Ram");
        Customer c2 = new Customer(a1, "Naveen");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
