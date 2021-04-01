package com.example.midfedilityprototypecomp4020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);
        RecyclerView rView = view.findViewById(R.id.rView);
        List<String> names = new ArrayList<String>();
        names.add("McDonald's");
        names.add("UBER");
        names.add("Walmart");
        List<Double> money = new ArrayList<Double>();
        money.add(12.99);
        money.add(7.99);
        money.add(43.78);
        FinancialHistoryAdapter adapter = new FinancialHistoryAdapter(names, money);

        rView.setAdapter(adapter);
        rView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        List<String> n = new ArrayList<String>();
        n.add("Shopping");
        n.add("Groceries");
        n.add("Transportation");
        n.add("Toys");
        n.add("Other");

        List<Double> d = new ArrayList<Double>();
        d.add(1789.01);
        d.add(125.76);
        d.add(76.21);
        d.add(5.21);
        d.add(143.57);

        RecyclerView rView2 = view.findViewById(R.id.rView2);
        AreaSpentAdapter a = new AreaSpentAdapter(n, d);
        rView2.setAdapter(a);
        rView2.setLayoutManager(new LinearLayoutManager(view.getContext()));

        Button reward = view.findViewById(R.id.RewardButton);
        reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new RewardFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainScreen, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        Button profile = view.findViewById(R.id.ProfileButton);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new ProfileFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainScreen, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Button t2 = view.findViewById(R.id.button2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SavingFragmentNoGoal();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainScreen, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}