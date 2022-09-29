package com.delivery.Activity.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.delivery.Activity.Adaptor.CategoryAdaptor;
import com.delivery.Activity.Adaptor.PopularAdaptor;
import com.delivery.Activity.Domain.CategoryDomain;
import com.delivery.Activity.Domain.FoodDomain;
import com.delivery.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza","cat_1"));
        category.add(new CategoryDomain("Hamburguesa","cat_2"));
        category.add(new CategoryDomain("HotDog","cat_3"));
        category.add(new CategoryDomain("Soda","cat_4"));
        category.add(new CategoryDomain("Donas","cat_5"));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }
    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Pizza de Pepperoni","pop_1","pruebas",35.000));
        foodList.add(new FoodDomain("Hamburguesa","pop_2","pruebas",15.000));
        foodList.add(new FoodDomain("Pizza Vegetariana","pop_3","pruebas",45.000));

        adapter2 = new PopularAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }
}