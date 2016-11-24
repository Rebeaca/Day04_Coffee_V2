package com.example.wangmm.day04_coffee_v2.business;

import android.util.Log;
import android.widget.Toast;

import com.example.wangmm.day04_coffee_v2.MainActivity;
import com.example.wangmm.day04_coffee_v2.enties.Coffee;
import com.example.wangmm.day04_coffee_v2.enties.Order;
import com.example.wangmm.day04_coffee_v2.enties.Sweet;

/**
 * Created by Wangmm on 2016/11/24.
 * 业务类
 *添加
 * 减少
 * 提交订单
 */

public class Shop {
    private Order mOrder;
    public static final int TYPE_ADD = 0;
    public static final int TYPE_SUB = 1;

    public Shop() {
        //初始化属性
        mOrder=new Order();

    }
//public Shop(String s){
//    mOrder.setUserName(s);
//}
    public Shop(Order mOrder) {
        this.mOrder = mOrder;
    }
    //添加
    public void addCoffe(){
        int i=mOrder.getmCoffes().getCount();
        //不超过10
        if(i>9)
        {
            return;
        }
        else
        {
            i++;
            mOrder.getmCoffes().setCount(i);
        }


    }
    //减少
    public void subCoffe(){
        //不少于0
        int i=mOrder.getmCoffes().getCount();
        if(i<1)
        {
            return;
        }else
        {
            i--;
            mOrder.getmCoffes().setCount(i);
        }

    }
    //提交订单
    public String OrderDetail(){

        int price=0;
        StringBuilder _Builder =new StringBuilder();
        _Builder.append("客户："+mOrder.getUserName()+"\n");
        _Builder.append("订购了"+mOrder.getmCoffes().getCount()+"杯咖啡\n");
        //判断甜品
      //  if (mOrder.getmSweets().length!=0){
            for (int i=0;i<mOrder.getmSweets().length;i++){
                if(mOrder.getmSweets()[i].isSTATIC()){
                    _Builder.append("订购了甜品："+mOrder.getmSweets()[i].getName()+"\n");
                    price+=mOrder.getmSweets().length* Sweet.PRICE_SWEET;
                }
            }
      //  }
        _Builder.append("总计："+(mOrder.getmCoffes().getCount()* Coffee.PRICE_COFFEE+price+"元\n"));
        return _Builder.toString();

    }

    public void sweetOrder(boolean pType,int a){
        //给甜品，设置状态,位置
        mOrder.getmSweets()[a].setSTATIC(pType);
    }
    public Order getmOrder() {
        return mOrder;
    }

    public void setmOrder(Order mOrder) {
        this.mOrder = mOrder;
    }
}
