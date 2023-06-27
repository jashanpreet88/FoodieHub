package com.foodiehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IndianFood extends AppCompatActivity {
 Button counterAdd, counterMinus,counterAdd1,counterMinus2,order,proceed;
 EditText quantity,quantity2,pricevar;
 int var1 =0;
 int var2 =0;
 int price1 = 0;
 int price2 =0;
 double tax = 0;
 double tax1 = 0;
 double tax2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_food);
        counterAdd = findViewById(R.id.plus);
        counterMinus = findViewById(R.id.Subtract);
        order = findViewById(R.id.button4);
        quantity = findViewById(R.id.editTextText3);
        pricevar = findViewById(R.id.prices);
        quantity2 = findViewById(R.id.editTextText5q1);
        counterAdd1 = findViewById(R.id.button5plus);
        counterMinus2 = findViewById(R.id.button6Minus);
        proceed = findViewById(R.id.button2procced);
        counterAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1++;
                quantity.setText(String.valueOf(var1));
                price1 = var1*5;
                pricevar.setText(String.valueOf(price1+price2));
            }
        });

        counterMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1--;
                quantity.setText(String.valueOf(var1));
                price1 = var1*5;
                pricevar.setText(String.valueOf(price1+price2));
            }
        });

        counterAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2++;
                quantity2.setText(String.valueOf(var2));
                price2 = var2*3;
                pricevar.setText(String.valueOf(price2+price1));
            }
        });

        counterMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2--;
                quantity2.setText(String.valueOf(var2));
                price2 = var2*5;
                pricevar.setText(String.valueOf(price2+price1));
            }
        });





        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tax1 = price1+price1*0.15;
                tax2 = price2+price2*0.15;
                tax = tax1+tax2;


                Toast.makeText(IndianFood.this, "you have to pay "+tax+"$", Toast.LENGTH_SHORT).show();
            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndianFood.this,ThankYou.class);
                startActivity(intent);
            }
        });

    }
}