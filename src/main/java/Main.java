public class Main {

    public static void main(String[] args) throws InterruptedException {
        withdrawAndPrint(new AbnAmroBankAccount(1500, "A Koehler"), 500);

        OtherBankAccount otherBankAccount = new OtherBankAccount(4500, "R Slot");
        withdrawAndPrint(otherBankAccount, 2500);

//        Thread.sleep(300);
//        withdrawAndPrint(otherBankAccount, 2500);

    }

    private static void withdrawAndPrint(BankAccount bankAccount, int amount) {
        System.out.println("accessing account of: " + bankAccount.getHolder());
        int money = bankAccount.withdrawMoney(amount);
        System.out.println("I have withdrawn " + money);
        System.out.println(bankAccount.getAmount() + " left in account!\n");
    }
}
