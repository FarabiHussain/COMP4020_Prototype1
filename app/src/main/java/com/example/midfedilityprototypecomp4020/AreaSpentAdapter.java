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

public class AreaSpentAdapter extends RecyclerView.Adapter<AreaSpentAdapter.ViewHolder> {
    List<String> names;
    List<Double> money;

    public AreaSpentAdapter(List<String> names, List<Double> money) {
        this.names = names;
        this.money = money;
    }

    @NonNull
    @Override
    public AreaSpentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fh_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull AreaSpentAdapter.ViewHolder Holder, int position) {
        Holder.name.setText(names.get(position));
        Holder.money.setText("$" + money.get(position).toString());
        if (position == 0) {
            Holder.name.setTextColor(Color.parseColor("#ffffff"));
            Holder.money.setTextColor(Color.parseColor("#ffffff"));
        } else if (position == 1 || position == 4) {
            Holder.name.setTextColor(Color.parseColor("#ffffff"));
            Holder.money.setTextColor(Color.parseColor("#ffffff"));
        } else if (position == 2 || position == 3) {
            Holder.name.setTextColor(Color.parseColor("#ffffff"));
            Holder.money.setTextColor(Color.parseColor("#ffffff"));
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
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name, money;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView3);
            money = itemView.findViewById(R.id.textView4);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

        }
    }
}
