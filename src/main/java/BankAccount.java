abstract class BankAccount {

    private int amount;
    private final String holder;

    public BankAccount(int initialBalance, String holder) {
        this.amount = initialBalance;
        this.holder = holder;
    }

    public abstract String getBic();

    public int withdrawMoney(int amount) {
        if (amount > this.amount) {
            throw new RuntimeException("Not enough money in account");
        }

        this.amount -= amount;
        return amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getHolder() {
        return holder;
    }
}
