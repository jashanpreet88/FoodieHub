package com.foodiehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ThankYou extends AppCompatActivity {
    private static final int DELAY = 2000;
    // This is thank you page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ThankYou.this,MenuPage.class);
                startActivity(intent);
            }
        },DELAY);
    }
}