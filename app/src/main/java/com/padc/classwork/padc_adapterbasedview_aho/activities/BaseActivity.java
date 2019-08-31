package com.padc.classwork.padc_adapterbasedview_aho.activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.padc.classwork.padc_adapterbasedview_aho.R;

public abstract class BaseActivity extends AppCompatActivity {

    protected void showInfiniteSnackBar(String message){
        final Snackbar snackbar = Snackbar.make(getWindow().getDecorView(), message, Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction(getResources().getString(R.string.lbl_snack_bar_ok), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
    }
}
