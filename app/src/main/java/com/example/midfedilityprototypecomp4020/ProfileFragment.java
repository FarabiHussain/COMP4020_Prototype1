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

public class ProfileFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_profile, container, false);

        view.findViewById(R.id.button11).setVisibility(View.GONE);
        view.findViewById(R.id.button10).setVisibility(View.GONE);


        Button back = view.findViewById(R.id.button2);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fragment fragment = new MainScreen();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.profileScreen, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        Button twelve = view.findViewById(R.id.button12);
        twelve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Set Secondary Bank Account");
                final TextView ta = new TextView(getContext());

                final EditText one = new EditText(getContext());
                final TextView ta2 = new TextView(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());
                //to.setHint("two");//optional
                ta.setText("Bank Name");
                ta2.setText("Account Number");
                one.setInputType(InputType.TYPE_CLASS_TEXT);
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
                        //if(one.getText().toString().contains("@")&&one.getText().toString().contains(".")) {
                        final TextView t = view.findViewById(R.id.textView14);
                        t.setText(one.getText().toString());
                        final TextView t2 = view.findViewById(R.id.textView13);
                        t2.setText(two.getText().toString());
                        twelve.setVisibility(View.GONE);
                        view.findViewById(R.id.button10).setVisibility(View.VISIBLE);

                        // } else {
                        //   Toast.makeText(getActivity(),"Not A Valid Email",Toast.LENGTH_SHORT).show();
                        //}
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







        Button nine = view.findViewById(R.id.button9);
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Set Primary Bank Account");
                final TextView ta = new TextView(getContext());

                final EditText one = new EditText(getContext());
                final TextView ta2 = new TextView(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());
                //to.setHint("two");//optional
                ta.setText("Bank Name");
                ta2.setText("Account Number");
                one.setInputType(InputType.TYPE_CLASS_TEXT);
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
                        //if(one.getText().toString().contains("@")&&one.getText().toString().contains(".")) {
                            final TextView t = view.findViewById(R.id.textView17);
                            t.setText(one.getText().toString());
                            final TextView t2 = view.findViewById(R.id.textView18);
                            t2.setText(two.getText().toString());
                            nine.setVisibility(View.GONE);
                        view.findViewById(R.id.button11).setVisibility(View.VISIBLE);
                       // } else {
                         //   Toast.makeText(getActivity(),"Not A Valid Email",Toast.LENGTH_SHORT).show();
                        //}
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




        Button thirt = view.findViewById(R.id.button13);
        thirt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Set Personal Info");
                final TextView ta = new TextView(getContext());

                final EditText one = new EditText(getContext());
                final TextView ta2 = new TextView(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());

                //to.setHint("two");//optional
                ta.setText("Name");
                ta2.setText("Email");

                one.setInputType(InputType.TYPE_CLASS_TEXT);
                two.setInputType(InputType.TYPE_CLASS_TEXT);
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
                        //if(one.getText().toString().contains("@")&&one.getText().toString().contains(".")) {
                        final TextView t = view.findViewById(R.id.textView5);
                        t.setText(one.getText().toString());
                        final TextView t2 = view.findViewById(R.id.textView8);
                        t2.setText(two.getText().toString());
                        nine.setVisibility(View.GONE);

                        // } else {
                        //   Toast.makeText(getActivity(),"Not A Valid Email",Toast.LENGTH_SHORT).show();
                        //}
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




     /*   Button ten= view.findViewById(R.id.button10);
        ten.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Personal Info");
                final TextView ta = new TextView(getContext());

                final EditText one = new EditText(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());
                //to.setHint("two");//optional
                ta.setText("Email");
                one.setHint("Email");
                one.setInputType(InputType.TYPE_CLASS_TEXT);
                two.setInputType(InputType.TYPE_CLASS_NUMBER);
                LinearLayout lay = new LinearLayout(getContext());
                lay.setOrientation(LinearLayout.VERTICAL);
                lay.addView(ta);
                lay.addView(one);
                lay.addView(two);
                builder.setView(lay);

// Set up the buttons
                builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(one.getText().toString().contains("@")&&one.getText().toString().contains(".")) {
                            final TextView t = view.findViewById(R.id.textView8);
                            t.setText(one.getText().toString());
                        } else {
                            Toast.makeText(getActivity(),"Not A Valid Email",Toast.LENGTH_SHORT).show();
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
        });*/


        Button eleven= view.findViewById(R.id.button11);
        eleven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Change Primary Bank Account");
                final TextView ta = new TextView(getContext());
                final TextView ta2 = new TextView(getContext());

                final EditText one = new EditText(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());
                //to.setHint("two");//optional
                ta.setText("Bank Name");
                ta2.setText("Account Number");
                one.setInputType(InputType.TYPE_CLASS_TEXT);
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
                        final TextView t = view.findViewById(R.id.textView17);
                        t.setText(one.getText().toString());
                        final TextView t2 = view.findViewById(R.id.textView18);
                        t2.setText(two.getText().toString());
                        nine.setVisibility(View.GONE);
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




        Button ten = view.findViewById(R.id.button10);
        ten.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Change Secondary Bank Account");
                final TextView ta = new TextView(getContext());

                final EditText one = new EditText(getContext());
                final TextView ta2 = new TextView(getContext());
                //from.setHint("one");//optional
                final EditText two = new EditText(getContext());
                //to.setHint("two");//optional
                ta.setText("Bank Name");
                ta2.setText("Account Number");
                one.setInputType(InputType.TYPE_CLASS_TEXT);
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
                        //if(one.getText().toString().contains("@")&&one.getText().toString().contains(".")) {
                        final TextView t = view.findViewById(R.id.textView14);
                        t.setText(one.getText().toString());
                        final TextView t2 = view.findViewById(R.id.textView13);
                        t2.setText(two.getText().toString());
                        twelve.setVisibility(View.GONE);
                        // } else {
                        //   Toast.makeText(getActivity(),"Not A Valid Email",Toast.LENGTH_SHORT).show();
                        //}
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