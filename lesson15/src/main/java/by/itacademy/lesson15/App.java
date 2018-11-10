package by.itacademy.lesson15;


import by.itacademy.lesson15.Domain.Cashbox;
import by.itacademy.lesson15.Domain.Customer;
import by.itacademy.lesson15.Goods.Meat;
import by.itacademy.lesson15.Goods.Milk;
import by.itacademy.lesson15.Goods.Water;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<Customer> customers = new LinkedList<Customer>();
        customers.add(new Customer(39,"Vasya").add(new Milk()).add(new Meat()));
        customers.add(new Customer(40,"Roman").add(new Water()).add(new Milk()).add(new Meat()));
        customers.add(new Customer(41,"Alexey").add(new Milk()).add(new Water()));
        customers.add(new Customer(42,"Sveta").add(new Meat()).add(new Milk()).add(new Water()));
        new Cashbox(customers).service();

    }
}
