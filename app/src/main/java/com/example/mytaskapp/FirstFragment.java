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

public class FirstFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstFragment", "on Create");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("FirstFragment", "on Create View");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FirstFragment", "on Resume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("FirstFragment", "on Stop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FirstFragment", "on Destroy");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FirstFragment", "on Pause");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FirstFragment", "on Start");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("FirstFragment", "on Attach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FirstFragment", "on Destroy View");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FirstFragment", "on Detach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("SecondFragment", "on Activity Created");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("SecondFragment", "on View Created");
    }
}
