package by.itacademy.lesson15.Domain;


import java.util.List;
import java.util.Queue;


public class Cashbox {
    private Queue<Customer> customers;

    public Cashbox(Queue<Customer> customers) {
        this.customers = customers;
    }

    public void service() {
        while (!customers.isEmpty()) {
            Customer customer = customers.poll();
            if (customer.buy(costOf(customer.goods()))) {
                System.out.println(customer.goods());
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }

    private int costOf(List<Good> goods) {
        int cost = 0;
        for (Good g : goods) {
            cost += g.getprice();

        }
        return cost;

    }
}

