package com.example.jeetmeena.findplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sain);

        Thread th = new Thread() {
            @Override
            public void run() {

                try {

                    sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent obj = new Intent(SainActivity.this, MapsActivity.class);
                    startActivity(obj);
                }


            }

        } ;
        th.start();
    }
    @Override
    protected void onPause(){

        super.onPause();
        finish();
    }

}
