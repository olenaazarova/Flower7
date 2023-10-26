package ucu.edu.ua.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String payment(Double price){
        return("Paying with card" + price);
    }
}
