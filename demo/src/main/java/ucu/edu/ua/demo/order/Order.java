package ucu.edu.ua.demo.order;

import java.util.LinkedList;

import ucu.edu.ua.demo.item.Item;

public class Order{
    private LinkedList<Item> items = new LinkedList<>();

    private String payment;
    private String delivery;

    public String setPaymentStrategy(String Payment){
        return "Paying with PayPal" + Payment;
    }

    public String setDeliveryStrategy (String Delivery){
        return "Delivery:" + Delivery;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for(Item item: items){
            price += item.getPrice(); 
        }
        return price;
    }

    public String processOrder(){
        return "Order in process...";
    }
    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
