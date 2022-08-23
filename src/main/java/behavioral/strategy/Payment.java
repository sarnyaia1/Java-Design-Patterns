package behavioral.strategy;

public interface Payment {

    void makePayment(int amount);

    Payment payWithBankAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from bank account.");

    Payment payWithPayPal = (int amount) -> System.out.println("Payment of $" + amount + " made from payPal.");

}
