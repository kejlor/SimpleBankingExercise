public class Transferring implements BankTransfer {
    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount);
        to.deposit(amount);
        from.withdraw(1);
    }
}
