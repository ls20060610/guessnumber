package com.eric.guessnumber;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     Random a = new Random();
    int i = a.nextInt(9)+1;
    public void num(View view) {
        EditText ednumber = (EditText) findViewById(R.id.ed_number);
        float s = Float.parseFloat(ednumber.getText().toString());
        if (s < i) {
            new AlertDialog.Builder(this)
                    .setMessage("大一點")
                    .show();
        } else if (s > i) {
            new AlertDialog.Builder(this)
                    .setMessage("小一點")
                    .show();
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .show();
        }


    }
}
