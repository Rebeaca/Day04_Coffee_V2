package com.example.wangmm.day04_coffee_v2.enties;

/**
 * Created by Wangmm on 2016/11/24.
 * 实体类
 * 常量存咖啡价格
 * 数量
 */

public class Coffee {
    public static final int PRICE_COFFEE = 20;
    private int Count;

    public Coffee() {
    }

    public Coffee(int count) {
        Count = count;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}
