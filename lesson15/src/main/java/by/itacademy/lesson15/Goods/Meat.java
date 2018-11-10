package by.itacademy.lesson15.Goods;

import by.itacademy.lesson15.Domain.Good;

public class Meat implements Good {
    @Override
    public String getname() {
        return "Meat";
    }

    @Override
    public int getprice() {
        return 0;
    }

    @Override
    public String toString() {
        return getname();
    }
}
