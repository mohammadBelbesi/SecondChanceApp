package com.example.secondchanceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<CardItem> cardItemList;

    public CardAdapter(List<CardItem> cardItemList) {
        this.cardItemList = cardItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardItem cardItem = cardItemList.get(position);
        holder.imageView.setImageResource(cardItem.getImageResource());
        holder.titleTextView.setText(cardItem.getTitle());
        holder.priceTextView.setText(cardItem.getPrice());
        holder.button.setOnClickListener(view -> {
            // Handle button click
        });
    }

    @Override
    public int getItemCount() {
        return cardItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titleTextView;
        public TextView priceTextView;
        public Button button;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            titleTextView = view.findViewById(R.id.titleTextView);
            priceTextView = view.findViewById(R.id.priceTextView);
            button = view.findViewById(R.id.button);
        }
    }
}
