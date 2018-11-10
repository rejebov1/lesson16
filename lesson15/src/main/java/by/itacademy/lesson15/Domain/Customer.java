package by.itacademy.lesson15.Domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Good> goods = new ArrayList<Good>();
    private int cash;

    public Customer(int moneySum, String name) {
        this.cash = moneySum;
        this.name = name;
    }

    public Customer add(Good good) {
        goods.add(good);
        return this;

    }

    public String name() {
        return name;

    }

    public boolean buy(int cost) {
        int cash = this.cash - cost;
        if (cash > 0) {
            this.cash = cash;
        }
        return cash > 0;
    }

    public List<Good> goods() {
        return goods;
    }
}

