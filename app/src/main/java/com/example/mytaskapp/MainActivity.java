package com.example.mytaskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userEmail;
    private EditText userPassword;
    private final String CORRECT_EMAIL = "abc80@gmail.com";
    private final String CORRECT_PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEmail = (EditText) findViewById(R.id.email);
        userPassword = (EditText) findViewById(R.id.password);

        Button submit = (Button) findViewById(R.id.login);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredEmail = userEmail.getText().toString();
                String enteredPassword = userPassword.getText().toString();

                String message;
                if (!enteredEmail.equals(CORRECT_EMAIL) && !enteredPassword.equals(CORRECT_PASSWORD)) {
                    message = "Invalid Email and Password.";
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, message);
                    messageDialog.show(getSupportFragmentManager(), "Message Dialog");
                } else if (!enteredEmail.equals(CORRECT_EMAIL)) {
                    message = "Invalid Email.";
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, message);
                    messageDialog.show(getSupportFragmentManager(), "Message Dialog");
                } else if (!enteredPassword.equals(CORRECT_PASSWORD)) {
                    message = "Invalid Password.";
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, message);
                    messageDialog.show(getSupportFragmentManager(), "Message Dialog");
                } else {
                    message = "Login Successful.";
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, message);
                    messageDialog.show(getSupportFragmentManager(), "Message Dialog");
                }
                userEmail.setText("");
                userPassword.setText("");
            }
        });
    }

}
