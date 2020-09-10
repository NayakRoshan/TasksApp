package com.example.mytaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("main", "in onCreate");
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