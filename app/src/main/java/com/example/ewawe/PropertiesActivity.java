package com.example.ewawe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ewawe.adapter.RecyclerViewAdapter;
import com.example.ewawe.model.Categories;
import com.example.ewawe.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class PropertiesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties);

        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.makuza));
        categoryItemList.add(new CategoryItem(1, R.drawable.empire));
        categoryItemList.add(new CategoryItem(1, R.drawable.alliance));

        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.makuza));
        categoryItemList2.add(new CategoryItem(1, R.drawable.empire));
        categoryItemList2.add(new CategoryItem(1, R.drawable.alliance));

        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1, R.drawable.makuza));
        categoryItemList3.add(new CategoryItem(1, R.drawable.empire));
        categoryItemList3.add(new CategoryItem(1, R.drawable.alliance));

        List<Categories> commercialList = new ArrayList<>();
        commercialList.add(new Categories("Commercial", categoryItemList));
        commercialList.add(new Categories("Apartments", categoryItemList2));
        commercialList.add(new Categories("Warehouses", categoryItemList3));

        setRecyclerView(commercialList);
    }

    private void setRecyclerView(List<Categories> commercialList){

        recyclerView = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(this,commercialList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}