package com.foodiehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.foodiehub.R.id;
import com.foodiehub.R.layout;
public class LoginPage extends AppCompatActivity {
   private EditText editText1,editText2;
   private Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_login_page);
     editText1 = findViewById(R.id.username);
     loginbutton = findViewById(R.id.button);
     editText2= findViewById(R.id.password);
     loginbutton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String username = editText1.getText().toString().trim();
             String password = editText2.getText().toString().trim();

             if (username.isEmpty() || password.isEmpty()) {
                 Toast.makeText(LoginPage.this, "Please enter username & Password", Toast.LENGTH_SHORT).show();
             } else if (username.equals("jashan") && password.equals("Jashanpreet")) {
                 Toast.makeText(LoginPage.this, "login successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginPage.this,MenuPage.class);
                startActivity(intent);

             }
             else {
                 Toast.makeText(LoginPage.this, "Invalid Username & Password", Toast.LENGTH_SHORT).show();
             }
         }
     });


    }
}