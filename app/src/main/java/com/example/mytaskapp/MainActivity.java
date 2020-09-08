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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("main", "in onCreate");

        final FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction addFragmentOne = fragmentManager.beginTransaction();
        Fragment fragment1 = new FirstFragment();
        addFragmentOne.add(R.id.fragment, fragment1);
        addFragmentOne.commit();


        Log.d("test1", "in onCreate");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction toggleFragments = fragmentManager.beginTransaction();

                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment);

                if (fragment instanceof FirstFragment) {
                    Fragment fragment1 = new SecondFragment();
                    toggleFragments.replace(R.id.fragment, fragment1);
                    toggleFragments.addToBackStack(null);
                } else {
                    Fragment fragment1 = new FirstFragment();
                    toggleFragments.replace(R.id.fragment, fragment1);
                    toggleFragments.addToBackStack(null);
                }
                toggleFragments.commit();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("main", "in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("main", "on Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("main", "on stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("main", "on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("main", "on destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("main", "on restart");
    }
}