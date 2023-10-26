package ucu.edu.ua.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public String payment(Double price){
        return("Paying with PayPal" + price);
    }
}
