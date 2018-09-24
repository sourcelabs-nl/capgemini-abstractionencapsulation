public class AbnAmroBankAccount extends BankAccount {

    public AbnAmroBankAccount(int initialBalance, String name) {
        super(initialBalance, name);
    }

    public String getBic() {
        return "ABNANL2A";
    }
}
