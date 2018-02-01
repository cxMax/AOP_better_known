package com.cxmax.demo.androidapt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.DIActivity;
import com.example.DIView;
import com.example.Test;

@Test
@DIActivity
public class MainActivity extends AppCompatActivity {

    @DIView(R.id.text1)
    TextView textView;
    @DIView(R.id.text2)
    TextView textView2;
    @DIView(R.id.text3)
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DIMainActivity.bindView(this);
        textView.setText("Hello JavaPoet!");
    }
}
