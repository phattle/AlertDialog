package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnShowDialog = findViewById(R.id.buttonShowDialog);

        //Design pattern java : 22 design pattern
//        Order order = new Order.Builder()
//                .setOrderType(OrderType.ON_SITE)
//                .build();
//
//        Log.d("BBB",order.getOrderType() + "");
        //Design pattern android: mvv, mvi, mvc, mvp, architecture

        mBtnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] arrMonHocs =  {"PHP" , "JAVASCRIPT" , "ANDROID" , "IOS" , "MEAN"};
                boolean[] arrChecked = {false,false,false,false,false };
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Lựa chọn môn học")
                        .setIcon(R.mipmap.ic_launcher)
                        .setCancelable(false)
                        .setMultiChoiceItems(arrMonHocs, arrChecked, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                if (isChecked){
                                    Toast.makeText(MainActivity.this, "Đã chọn " + arrMonHocs[which], Toast.LENGTH_SHORT).show();
                                }else{
                                    Toast.makeText(MainActivity.this, "Bỏ chọn " + arrMonHocs[which], Toast.LENGTH_SHORT).show();
                                }
                            }
                        })

                        .setPositiveButton("Có", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Có", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Không", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });

    }
}