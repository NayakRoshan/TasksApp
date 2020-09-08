package com.example.mytaskapp;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("second", "In Second on Click");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("second", "In Second on Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("second", "In Second on Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("second", "In Second on Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("second", "In Second on Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("second", "In Second on Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("second", "In Second on Restart");
    }
}
