package com.example.mytaskapp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondFragment", "on Create");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("SecondFragment", "on Create View");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("SecondFragment", "on Resume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("SecondFragment", "on Stop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("SecondFragment", "on Destroy");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("SecondFragment", "on Pause");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("SecondFragment", "on Start");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("SecondFragment", "on Attach");
    }

}
