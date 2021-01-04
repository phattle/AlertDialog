package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnShowDialog = findViewById(R.id.buttonShowDialog);

        //Design pattern java : 22 design pattern

        //Design pattern android: mvvm, vi, mvc, mvp, architecture
    }
}