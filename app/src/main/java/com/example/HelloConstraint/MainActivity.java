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
    boolean iscolor = true;
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
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            btnZero.setBackgroundColor(Color.BLACK);
            iscolor = true;
        }
    }


    public void showZeroCount(View view) {
        if(iscolor) {
            btnZero.setBackgroundColor(Color.GRAY);
            iscolor = false;
            mCount = 0;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount - mCount));
        }
    }
}