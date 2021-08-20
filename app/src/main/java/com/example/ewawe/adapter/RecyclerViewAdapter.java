package com.example.ewawe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ewawe.R;
import com.example.ewawe.model.Categories;
import com.example.ewawe.model.CategoryItem;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private Context context;
    private List<Categories> categoriesList;

    public RecyclerViewAdapter(Context context, List<Categories> categoriesList) {
        this.context = context;
        this.categoriesList = categoriesList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.title.setText(categoriesList.get(position).getTitle());
        setCatItemRecycler(holder.itemRecycler, categoriesList.get(position).getCategoryItemList());
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public static final class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        RecyclerView itemRecycler;
        private RecyclerViewClickListener listener;

        public RecyclerViewHolder(@NonNull View itemView){
            super(itemView);

            title = itemView.findViewById(R.id.cat_title);
            itemRecycler = itemView.findViewById(R.id.item_recycler);
        }
    }

    private void setCatItemRecycler(RecyclerView recyclerView, List<CategoryItem> categoryItemList){

        CategoryItemRecyclerAdapter itemRecyclerAdapter = new CategoryItemRecyclerAdapter(context, categoryItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(itemRecyclerAdapter);
    }
}
