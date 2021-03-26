package com.example.midfedilityprototypecomp4020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FinancialHistoryAdapter extends RecyclerView.Adapter<FinancialHistoryAdapter.Viewholder> {

    List<String> names;
    List<Double> money;


    public FinancialHistoryAdapter(List <String> names, List<Double> money){
        this.names=names;
        this.money=money;
    }
    @NonNull
    @Override
    public FinancialHistoryAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.fh_row,parent,false);
        Viewholder viewholder= new Viewholder(view);




        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull FinancialHistoryAdapter.Viewholder holder, int position) {
        holder.name.setText(names.get(position));
        holder.money.setText("$"+money.get(position).toString());
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return names.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView name,money;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name =itemView.findViewById(R.id.textView3);
            money=itemView.findViewById(R.id.textView4);



            itemView.setOnClickListener(this);



        }



        @Override
        public void onClick(View v) {

        }
    }

}
