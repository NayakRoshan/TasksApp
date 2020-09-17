package com.example.mytaskapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytaskapp.entity.PersonEntity;

import java.util.List;

public class DetailsRecyclerViewAdapter extends RecyclerView.Adapter<DetailsRecyclerViewAdapter.DetailsViewHolder> {

    private Context context;
    private List<PersonEntity> listViewData;

    public DetailsRecyclerViewAdapter(Context context, List<PersonEntity> details) {
        this.context = context;
        this.listViewData = details;
    }

    public static class DetailsViewHolder extends RecyclerView.ViewHolder {

        private TextView idView;
        private TextView nameView;
        private TextView phoneView;
        private TextView ageView;

        public DetailsViewHolder(@NonNull View itemView) {
            super(itemView);
            idView = itemView.findViewById(R.id.id);
            nameView = itemView.findViewById(R.id.name);
            phoneView = itemView.findViewById(R.id.phone);
            ageView = itemView.findViewById(R.id.age);
        }

        public TextView getIdView() { return idView; }
        public TextView getNameView() { return nameView; }
        public TextView getPhoneView() { return phoneView; }
        public TextView getAgeView() { return ageView; }
    }

    @NonNull
    @Override
    public DetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return new DetailsViewHolder(inflater.inflate(R.layout.list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsViewHolder holder, int position) {
        PersonEntity person = listViewData.get(position);

        holder.getIdView().setText(person.getId().toString());
        holder.getNameView().setText(person.getName());
        holder.getPhoneView().setText(person.getPhone());
        holder.getAgeView().setText(person.getAge());
    }

    @Override
    public int getItemCount() {
        return listViewData.size();
    }

}
