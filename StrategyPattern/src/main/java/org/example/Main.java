package org.example;

import org.example.strategy.CreditCardStrategy;
import org.example.logic.Item;
import org.example.strategy.PaypalStrategy;
import org.example.logic.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}