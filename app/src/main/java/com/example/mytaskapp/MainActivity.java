package com.example.mytaskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mytaskapp.entity.PersonEntity;
import com.example.mytaskapp.utils.AgeCompareUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PersonEntity> details = new ArrayList<PersonEntity>();

        //add persons. static details.
        PersonEntity person1 = new PersonEntity(1, "Aaron Finch", "13423", "23");
        PersonEntity person2 = new PersonEntity(2, "Virat", "134235", "25");
        PersonEntity person3 = new PersonEntity(3, "ABD", "43356", "18");
        PersonEntity person4 = new PersonEntity(4, "Morris", "357457", "30");
        PersonEntity person5 = new PersonEntity(5, "Zampa", "346324", "28");
        PersonEntity person6 = new PersonEntity(6, "Dale Styne", "34362", "24");

        details.add(person1);
        details.add(person2);
        details.add(person3);
        details.add(person4);
        details.add(person5);
        details.add(person6);

        Comparator<PersonEntity> ageCompare = new AgeCompareUtils();
        Collections.sort(details, ageCompare);

        DetailsRecyclerViewAdapter listViewAdapter = new DetailsRecyclerViewAdapter(this, details);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listViewAdapter);
    }

}