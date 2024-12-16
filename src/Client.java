class Client extends Thread {
    private ATM atm;
    private String clientName;
    private int withdrawalAmount;

    public Client(ATM atm, String clientName, int withdrawalAmount) {
        this.atm = atm;
        this.clientName = clientName;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        atm.withdraw(clientName, withdrawalAmount);
    }
}
