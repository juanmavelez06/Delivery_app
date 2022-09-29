package com.delivery.Activity.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.delivery.Activity.Domain.CategoryDomain;
import com.delivery.R;

import java.util.ArrayList;

public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.ViewHolder> {
    ArrayList<CategoryDomain>categoryDomains;

    public CategoryAdaptor(ArrayList<CategoryDomain> categoryDomains){
        this.categoryDomains = categoryDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryName.setText(categoryDomains.get(position).getTitle());
        String imageUrl = "";
        switch (position){
            case 0:{
                imageUrl= "cat_1";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_background1));
                break;
            }
            case 1:{
                imageUrl= "cat_2";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_background2));
                break;
            }
            case 2:{
                imageUrl= "cat_3";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_background3));
                break;
            }
            case 3:{
                imageUrl= "cat_4";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_background4));
                break;
            }
            case 4:{
                imageUrl= "cat_5";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.cat_background5));
                break;
            }
        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(imageUrl,"drawable",holder.itemView.getContext().getPackageName());
         Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categoryImage);
    }

    @Override
    public int getItemCount(){

        return categoryDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ImageView categoryImage;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName= itemView.findViewById(R.id.categoryName);
            categoryImage= itemView.findViewById(R.id.categoryImage);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }




}
