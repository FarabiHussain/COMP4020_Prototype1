package com.example.midfedilityprototypecomp4020;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AreaSpentAdapter extends RecyclerView.Adapter<AreaSpentAdapter.Viewholder> {
    List<String> names;
    List<Double> money;

    public AreaSpentAdapter(List<String>names,List<Double> money){
        this.names=names;
        this.money=money;
    }


    @NonNull
    @Override
    public AreaSpentAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.fh_row,parent,false);
        Viewholder viewholder= new Viewholder(view);




        return viewholder;
    }


    @Override
    public void onBindViewHolder(@NonNull AreaSpentAdapter.Viewholder holder, int position) {
        holder.name.setText(names.get(position));
        holder.money.setText("$"+money.get(position).toString());
        if(position==0){
            holder.name.setTextColor(Color.parseColor("#FF0000"));
            holder.money.setTextColor(Color.parseColor("#FF0000"));
        } else if (position==1||position==4){
            holder.name.setTextColor(Color.parseColor("#9b870c"));
            holder.money.setTextColor(Color.parseColor("#9b870c"));
        }else if (position==2||position==3){
            holder.name.setTextColor(Color.parseColor("#00FF00"));
            holder.money.setTextColor(Color.parseColor("#00FF00"));
        }
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
