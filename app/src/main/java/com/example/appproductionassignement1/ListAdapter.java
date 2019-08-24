package com.example.appproductionassignement1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter {
    ArrayList shoppingList;
    Context context;
    TextView shoppingItem;
    public ListAdapter(Context context, ArrayList shoppingList){
        this.context = context;
        this.shoppingList = shoppingList;
    }
    public int getItemCount(){
        return shoppingList.size();
    }
    public class ListViewHolder extends RecyclerView.ViewHolder{

        public ListViewHolder(@org.jetbrains.annotations.NotNull View itemView){
            super(itemView);
            shoppingItem = (TextView) itemView.findViewById(R.id.name);
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listviewholder, parent, false);

        ListViewHolder vh = new ListViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int position) {
        // set the data in items
        shoppingItem.setText((CharSequence) shoppingList.get(position));
        // implement setOnClickListener event on item view.
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }

}
