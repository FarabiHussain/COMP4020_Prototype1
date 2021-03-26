package com.example.midfedilityprototypecomp4020;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class SavingFragmentNoGoal extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_saving_no_goal, container, false);

        Button four = view.findViewById(R.id.button2);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new MainScreen();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.rrr, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Button a = view.findViewById(R.id.buttonTransferToSavings);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Create Savings Goal");
                final TextView ta = new TextView(getContext());

                final EditText one = new EditText(getContext());
                final TextView ta2 = new TextView(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());
                //to.setHint("two");//optional
                ta.setText("Amount");
                ta2.setText("Duration (in months)");

                one.setInputType(InputType.TYPE_CLASS_NUMBER);
                two.setInputType(InputType.TYPE_CLASS_NUMBER);
                LinearLayout lay = new LinearLayout(getContext());
                lay.setOrientation(LinearLayout.VERTICAL);
                lay.addView(ta);
                lay.addView(one);
                lay.addView(ta2);
                lay.addView(two);
                builder.setView(lay);

// Set up the buttons
                builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (!one.getText().toString().equals("") && Integer.parseInt(one.getText().toString()) > 0) {
                            Fragment fragment = new SavingsFragment();
                            Bundle bundle = new Bundle();
                            bundle.putDouble("one", Double.parseDouble(String.valueOf(one.getText())));
                            bundle.putDouble("two", Double.parseDouble(String.valueOf(two.getText())));
                            System.out.println("oneas " + one.getText().toString());
                            fragment.setArguments(bundle);
                            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.rrr, fragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                        } else {
                            Toast.makeText(getActivity(), "Not A Valid Email", Toast.LENGTH_SHORT).show();
                        }
                        //m_Text = input.getText().toString();
                    }
                });
                builder.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();

            }
        });

        return view;
    }
}