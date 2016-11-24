package com.example.wangmm.day04_coffee_v2.enties;

/**
 * Created by Wangmm on 2016/11/24.
 * 实体类
 * 甜品名称
 * 常量存甜品的价格
 * 状态
 */

public class Sweet {
    private String nameSweet;
    public static final int PRICE_SWEET = 10;
    //添加状态
    private boolean STATIC ;
    //添加一个位置参数，表明选择的是哪个
    private int pType;


    public Sweet() {
    }

    public Sweet(String name) {
        this.nameSweet = name;
    }

    public boolean isSTATIC() {
        return STATIC;
    }

    public void setSTATIC(boolean STATIC) {
        this.STATIC = STATIC;
    }

    public String getName() {
        return nameSweet;
    }

    public void setName(String name) {
        this.nameSweet = name;
    }

    public int getpType() {
        return pType;
    }
}
