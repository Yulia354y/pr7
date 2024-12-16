public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000); // Початковий баланс у банкоматі: 1000 грн

        // Створення клієнтів
        Client client1 = new Client(atm, "Клієнт 1", 500);
        Client client2 = new Client(atm, "Клієнт 2", 700);
        Client client3 = new Client(atm, "Клієнт 3", 300);

        // Запуск потоків
        client1.start();
        client2.start();
        client3.start();
    }}
