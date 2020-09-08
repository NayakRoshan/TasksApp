package com.example.mytaskapp.utils;

import com.example.mytaskapp.entity.PersonEntity;

import java.text.Collator;
import java.util.Comparator;

public class AgeCompareUtils implements Comparator<PersonEntity> {

    @Override
    public int compare(PersonEntity o1, PersonEntity o2) {
        Collator collator = Collator.getInstance();
        return collator.compare(o1.getAge(), o2.getAge());
    }

}
