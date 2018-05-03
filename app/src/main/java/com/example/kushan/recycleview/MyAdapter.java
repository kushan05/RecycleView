package com.example.kushan.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kushan on 5/3/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListModel> listModels;
    private Context context;

    public MyAdapter(List<ListModel> listModels, Context context) {
        this.listModels = listModels;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_model, parent, false);

        return new  ViewHolder(v);

    }


    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        ListModel listModel = listModels.get(position);

        holder.capital.setText(listModel.getCapital());
        holder.country.setText(listModel.getCountry());
    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView country;
        public TextView capital;

        public ViewHolder(View itemView) {
            super(itemView);
            country = (TextView)itemView.findViewById(R.id.country);
            capital = (TextView)itemView.findViewById(R.id.capital);
        }
    }
}
