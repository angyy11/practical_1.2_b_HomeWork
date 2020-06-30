package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private TextView btnZero;
    private TextView btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnZero = (TextView) findViewById(R.id.button_zero);
        btnCount = (TextView) findViewById(R.id.button_count);
    }

    public void showToast (View view) {
        Toast  toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp (View view) {
        ++mCount;
        mShowCount.setText(Integer.toString(mCount));
        btnZero.setBackgroundColor(Color.RED);


        if((mCount%2)==0){
            btnCount.setBackgroundColor(Color.GREEN);
        }
        else{
            btnCount.setBackgroundColor(Color.BLUE);
        }

    }


    public void showZeroCount(View view) {
        btnZero.setBackgroundColor(Color.GRAY);
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}