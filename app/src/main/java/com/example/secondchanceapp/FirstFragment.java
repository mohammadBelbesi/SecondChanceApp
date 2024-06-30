package com.example.secondchanceapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.secondchanceapp.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private static final String TAG = "FirstFragment";

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<CardItem> cardItemList = new ArrayList<>();
        // Add items to the list with drawable references
        cardItemList.add(new CardItem(R.drawable.image1, "Used Cucumber for", "$0.99"));
        cardItemList.add(new CardItem(R.drawable.image2, "Fresh Broccoli Listing", "$2"));
        cardItemList.add(new CardItem(R.drawable.image3, "Organic Peas", "$0.87"));
        cardItemList.add(new CardItem(R.drawable.image4, "Hokkaido Squash Sale", "$3.49"));

        Log.d(TAG, "Number of items in list: " + cardItemList.size());

        CardAdapter adapter = new CardAdapter(cardItemList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
