public class OtherBankAccount extends BankAccount {

    public OtherBankAccount(int initialBalance, String holder) {
        super(initialBalance, holder);
    }

    public String getBic() {
        return "OtherbankBicCode";
    }
}
