package models;

import java.util.List;

public class Customer {
    String name;
    int balance;
    List<Orders> food;

    public Customer(String name, int balance, List<Orders> food) {
        this.name = name;
        this.balance = balance;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Orders> getFood() {
        return food;
    }

    public void setFood(List<Orders> food) {
        this.food = food;
    }
    public void getall() {
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
        System.out.println("Orders:");

        for (Orders order : this.food) {
            System.out.println("Order ID: " + order.getOrder_id());
            System.out.println("Items:");
            for (Itemorder itemOrder : order.getEat()) {
                Item item = itemOrder.getIt();
                int quantity = itemOrder.getQuantity();
                System.out.println("Item: " + item.getItem_name());
                System.out.println("Price: " + item.getItem_price());
                System.out.println("Quantity: " + quantity);
            }
        }
    }





}