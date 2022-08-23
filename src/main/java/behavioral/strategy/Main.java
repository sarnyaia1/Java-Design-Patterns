package behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(Payment.payWithBankAccount, 100);
    customer.makePayment(Payment.payWithPayPal, 150);
  }

}
