package com.example.wangmm.day04_coffee_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wangmm.day04_coffee_v2.business.Shop;
import com.example.wangmm.day04_coffee_v2.enties.Order;

/**
 * 控制类
 *业务与界面的桥梁
 */

public class MainActivity extends AppCompatActivity {
    private Button mButtonAdd,mButtonLoss,mButtonOrder;
    private CheckBox mCheckBox01,mCheckBox02,mCheckBox03;
    private TextView mTextViewResult,mTextViewCount;
    private EditText mEditText;
//    private Coffee mCoffee;
//    private Sweet mSweet;
    private Shop mShop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        //初始化
        init();
        //更新UI


        
    }

    private void init() {
        mButtonAdd = (Button) findViewById(R.id.btn_add);
        mButtonLoss = (Button) findViewById(R.id.btn_less);
        mButtonOrder = (Button) findViewById(R.id.btn_order);
        mTextViewCount = (TextView) findViewById(R.id.tv_count);
        mTextViewResult = (TextView) findViewById(R.id.tv_result);
        mEditText = (EditText) findViewById(R.id.edt_name);
        mCheckBox01 = (CheckBox) findViewById(R.id.ck_01);
        mCheckBox02 = (CheckBox) findViewById(R.id.ck_02);
        mCheckBox03 = (CheckBox) findViewById(R.id.ck_03);
//        mCoffee = new Coffee();
//        mSweet = new Sweet();
        mShop =new Shop();
        //设置监听器
        ButtonListener _ButtonListener = new ButtonListener();
        CheckBoxListener _CheckBoxListener = new CheckBoxListener();
        mButtonAdd.setOnClickListener(_ButtonListener);
        mButtonLoss.setOnClickListener(_ButtonListener);
        mButtonOrder.setOnClickListener(_ButtonListener);
        mCheckBox01.setOnCheckedChangeListener(_CheckBoxListener);
        mCheckBox02.setOnCheckedChangeListener(_CheckBoxListener);
        mCheckBox03.setOnCheckedChangeListener(_CheckBoxListener);
    }
    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_add:
                    //添加咖啡数量
                    mShop.addCoffe();
                    mTextViewCount.setText(mShop.getmOrder().getmCoffes().getCount()+"");
                    break;
                case R.id.btn_less:
                    mShop.subCoffe();
                    mTextViewCount.setText(mShop.getmOrder().getmCoffes().getCount()+"");
                    break;
                case R.id.btn_order:
                    mTextViewResult.setText( mShop.OrderDetail()+"");
                    break;
            }
        }
    }

    private class CheckBoxListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            switch (compoundButton.getId()){
                case R.id.ck_01:
                  //  String s1=mSweet.getCategary(0);
                   // mCoffee.sweetOrder(s1,b);
                    mShop.sweetOrder(true,0);
                    break;
                case R.id.ck_02:
                   // String s2 =mSweet.getCategary(1);
                   // mCoffee.sweetOrder(s2,b);
                    mShop.sweetOrder(true,1);
                    break;
                case R.id.ck_03:
                   // String s3 = mSweet.getCategary(2);
                   // mCoffee.sweetOrder(s3,b);
                    mShop.sweetOrder(true,2);
                    break;
            }
        }
    }
}
