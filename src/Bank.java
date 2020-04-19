public class Bank {

    public static void main(String[] args) {

        BankAccount someBankAccount = new BankAccount();
        BankAccount anotherBankAccount = new BankAccount();

        anotherBankAccount.accountBalance = 100;
        someBankAccount.accountBalance = 500;

        System.out.println(someBankAccount.accountBalance);

        someBankAccount.withdraw(100);
        System.out.println(someBankAccount.accountBalance);

        someBankAccount.deposit(200);
        System.out.println(someBankAccount.accountBalance);

        Transferring transferring = new Transferring();

        transferring.transfer(someBankAccount, anotherBankAccount, 200);

        System.out.println("Transfer complete!");

        System.out.println(someBankAccount.accountBalance);
        System.out.println(anotherBankAccount.accountBalance);

    }

}
