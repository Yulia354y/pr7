public class ATM {
    private int balance;

    public ATM(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(String clientName, int amount) {
        System.out.println(clientName + " намагається зняти " + amount + " грн.");
        if (amount <= balance) {
            System.out.println(clientName + " зняв " + amount + " грн.");
            balance -= amount;
            System.out.println("Залишок у банкоматі: " + balance + " грн.");
        } else {
            System.out.println(clientName + " не може зняти гроші. Недостатньо коштів у банкоматі.");
        }
    }
}
