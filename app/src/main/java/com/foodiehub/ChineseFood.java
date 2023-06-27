package com.foodiehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChineseFood extends AppCompatActivity {
   Button plus1,plus2,minus1,minus2,order,proceed;
   EditText qunatity1,qunatity2,price;

   double var1= 0;
   double var2= 0;
   double pr1 = 0;
   double pr2 = 0;
   double tax1 = 0;
   double tax2 = 0;
   double tax = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_food);

        plus1 = findViewById(R.id.plus1);
        plus2 = findViewById(R.id.button5plus1);
        minus1 = findViewById(R.id.Subtract1);
        minus2 = findViewById(R.id.button6Minus1);
        order = findViewById(R.id.button4order);
        proceed = findViewById(R.id.button2procced1);
        qunatity1 = findViewById(R.id.editTextText3Duck);
        qunatity2 = findViewById(R.id.editTextText5Spring);
        price = findViewById(R.id.prices1);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1++;
                qunatity1.setText(String.valueOf(var1));
                pr1 = var1 * 4;
                price.setText(String.valueOf(pr1+pr2));
            }
        });

        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1--;
                qunatity1.setText(String.valueOf(var1));
                pr1 = var1 * 4;
                price.setText(String.valueOf(pr1+pr2));
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2++;
                qunatity2.setText(String.valueOf(var2));
                pr1 = var2 * 3.5;
                price.setText(String.valueOf(pr1+pr2));
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2--;
                qunatity2.setText(String.valueOf(var2));
                pr1 = var2 * 3.5;
                price.setText(String.valueOf(pr1+pr2));
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tax1 = pr1+pr1*1.15;
                tax2 = pr2 + pr2 *0.50;
                tax = tax1+tax2;
                Toast.makeText(ChineseFood.this, "you have to pay :" +tax+"$", Toast.LENGTH_SHORT).show();
            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChineseFood.this,ThankYou.class);
                startActivity(i);
            }
        });
    }
}