package behavioral.strategy;

public class Customer{

  public void makePayment(Payment payment, int amount){
    payment.makePayment(amount);
  }
}
