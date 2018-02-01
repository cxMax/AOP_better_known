package com.cxmax.aspectjdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cxmax.aspectjdemo.aspectj.MyPointcuts;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AspectJDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        testBeforeAndAfter();
//        testAround();
    }

    private void testBeforeAndAfter(){
        Log.e(TAG, "testBeforeAndAfter: 原本需执行的代码");
    }

    private void testAround(){
        Log.e(TAG, "testAround: 原本需执行的代码");
    }

    @MyPointcuts
    public void testMyPointcuts1(View view){
        Log.e(TAG, "testMyPointcuts: 测试自定义切点1");
    }

    @MyPointcuts
    public void testMyPointcuts2(View view){
        Log.e(TAG, "testMyPointcuts: 测试自定义切点2");
    }

    @MyPointcuts
    public void testMyPointcuts3(View view){
        Log.e(TAG, "testMyPointcuts: 测试自定义切点3");
    }

    public void testWithcode1(View view){
        testComment();
    }

    public void testWithcode2(View view){
        testComment();
    }

    private void testComment(){
        Log.e(TAG, "testComment: 公共方法执行的代码");
    }
}
