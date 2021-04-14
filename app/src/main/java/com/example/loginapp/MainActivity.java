package com.example.loginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         etUsername = findViewById(R.id.et_username);
         etPassword = findViewById(R.id.et_password);
         btnSubmit = findViewById(R.id.submit);

         btnSubmit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(etUsername.getText().toString().equals("admin") &&
                         etPassword.getText().toString().equals("admin")) {
                     AlertDialog.Builder builder = new AlertDialog.Builder

                             (MainActivity.this);
                     builder.setIcon(R.drawable.ic_baseline_check_circle_24);
                     builder.setTitle("Login Sucessfully!!!");
                     builder.setMessage("Welcome to Android Coding...");

                     builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             dialog.cancel();
                         }
                     });

                     AlertDialog alertDialog = builder.create();
                     alertDialog.show();
                 } else
                     {
                         Toast.makeText(getApplicationContext(),"Invalid Username & Password",Toast.LENGTH_SHORT).show();
                 }


             }
         });

    }
}