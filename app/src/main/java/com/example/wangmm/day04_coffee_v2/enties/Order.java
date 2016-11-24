package com.example.wangmm.day04_coffee_v2.enties;

import java.util.ArrayList;

/**
 * Created by Wangmm on 2016/11/24.
 * 实体类
 * 客户的名称
 * 一个数组装甜品
 * 一个集合存咖啡
 */

public class Order {
    private ArrayList<Coffee> mCoffes;
    private Sweet[] mSweets;
    private String userName;
    public Order() {
        mCoffes=new ArrayList<>();

        mCoffes.add(new Coffee());
        mSweets= new Sweet[]{
                new Sweet("巧克力"),
                new Sweet("冰淇凌"),
                new Sweet("曲奇饼干")
        };
    }

    public Coffee getmCoffes() {
        return mCoffes.get(0);
    }

    public void setmCoffes(ArrayList<Coffee> mCoffes) {
        this.mCoffes = mCoffes;
    }

    public Sweet[] getmSweets() {
        return mSweets;
    }

    public void setmSweets(Sweet[] mSweets) {
        this.mSweets = mSweets;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    //get获取方法


}
