package com.example.alertdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class AppDialogs extends Dialog {
    private Context mContext;
    private Dialog mAppDialogs;

    public AppDialogs(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    public void setChallengeDialog(OnListenClickDialogChallenge listenClick){
        mAppDialogs = new Dialog(mContext);
        mAppDialogs.getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
        mAppDialogs.setContentView(R.layout.layout_dialog_challenge);
        TextView tvClose = mAppDialogs.findViewById(R.id.textViewClose);
        Button btnTryAgain = mAppDialogs.findViewById(R.id.buttonTryAgain);

        tvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenClick.onClose();
                mAppDialogs.dismiss();
            }
        });

        btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenClick.onTryAgain();
                mAppDialogs.dismiss();
            }
        });
        mAppDialogs.show();
    }
}