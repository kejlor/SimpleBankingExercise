public class BankAccount implements Account {

    int accountBalance;


    @Override
    public void deposit(int amount) {
        accountBalance += amount;
    }

    @Override
    public void withdraw(int amount) {
        accountBalance -= amount;
    }
}
