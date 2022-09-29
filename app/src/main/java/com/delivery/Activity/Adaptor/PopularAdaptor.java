package com.delivery.Activity.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.delivery.Activity.Domain.FoodDomain;
import com.delivery.R;

import java.util.ArrayList;

public class PopularAdaptor extends RecyclerView.Adapter<PopularAdaptor.ViewHolder> {
    ArrayList<FoodDomain> popularFood;

    public PopularAdaptor(ArrayList<FoodDomain> popularFood){
        this.popularFood = popularFood;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdaptor.ViewHolder holder, int position) {
        holder.title.setText(popularFood.get(position).getTitle());
        holder.tarifa.setText(String.valueOf(popularFood.get(position).getTarifa()));


        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(popularFood.get(position).getImage() ,"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.image);
    }

    @Override
    public int getItemCount(){return popularFood.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView tarifa;
        ImageView image;
        TextView addBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            tarifa = itemView.findViewById(R.id.tarifa);
            image = itemView.findViewById(R.id.img);
            addBtn = itemView.findViewById(R.id.addBtn);

        }
    }




}
