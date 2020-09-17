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

                if (!enteredEmail.equals(getString(R.string.correct_email)) && !enteredPassword.equals(getString(R.string.correct_password))) {
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, getString(R.string.wrong_mail_and_password));
                    messageDialog.show(getSupportFragmentManager(), getString(R.string.dialog_tag));
                } else if (!enteredEmail.equals(getString(R.string.correct_email))) {
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, getString(R.string.wrong_email));
                    messageDialog.show(getSupportFragmentManager(), getString(R.string.dialog_tag));
                } else if (!enteredPassword.equals(getString(R.string.correct_password))) {
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, getString(R.string.wrong_password));
                    messageDialog.show(getSupportFragmentManager(), getString(R.string.dialog_tag));
                } else {
                    MessageDialog messageDialog = new MessageDialog(MainActivity.this, getString(R.string.success_message));
                    messageDialog.show(getSupportFragmentManager(), getString(R.string.dialog_tag));
                }
                userEmail.setText("");
                userPassword.setText("");
            }
        });
    }

}
