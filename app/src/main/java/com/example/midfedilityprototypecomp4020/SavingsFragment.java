package com.example.midfedilityprototypecomp4020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsFragment extends Fragment {

    private Button transferButton;
    private ImageView savings1;
    private ImageView savings0;
    private TextView recentDeposit;
    private TextView savingsReminder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_savings, container, false);
        Bundle bundle = this.getArguments();
        if (this.getArguments() != null) {
            System.out.println("AEW");
        } else {
            System.out.println("POK");
        }

        savingsReminder = view.findViewById(R.id.savingsReminder);
        transferButton = view.findViewById(R.id.buttonTransferToSavings);
        savings1 = view.findViewById(R.id.savings1);
        savings0 = view.findViewById(R.id.savings0);
        recentDeposit = view.findViewById(R.id.transferHistory1);

        savingsReminder.setText("YOU HAVE A PENDING DEPOSIT FOR $" + round(bundle.getDouble("one") / bundle.getDouble("two"), 2) + " IN THE NEXT MONTH");

        Button four = view.findViewById(R.id.button2);

        four.setOnClickListener(v -> {
            Fragment fragment = new MainScreen();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.as, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        });

        transferButton.setOnClickListener(v -> {
            savings0.setVisibility(View.INVISIBLE);
            savings1.setVisibility(View.VISIBLE);
            recentDeposit.setVisibility(View.VISIBLE);
            savingsReminder.setText("THANK YOU FOR YOUR DEPOSIT. YOU'RE ONE STEP CLOSER TO YOUR GOAL!");
            transferButton.setClickable(false);
            transferButton.setVisibility(View.INVISIBLE);
        });

        return view;
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}