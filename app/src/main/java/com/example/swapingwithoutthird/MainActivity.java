package com.example.swapingwithoutthird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x=45;
        int y=98;
        System.out.println("before swapping="+x+""+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping="+x+""+y);
    }
}
