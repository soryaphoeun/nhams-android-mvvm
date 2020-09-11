package com.sorya.nhams.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sorya.nhams.R;
import com.sorya.nhams.models.shop.ShopDetailItem;
import com.sorya.nhams.view.viewHolder.ShopViewHolder;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopViewHolder>{
    private ArrayList<ShopDetailItem> mExampleList;
    private Context mContext;
    private AdapterView.OnItemClickListener itemClickListener;

    public ShopAdapter(ArrayList<ShopDetailItem> sponSerItems) {
        mExampleList = sponSerItems;
        notifyDataSetChanged();
    }

    public ShopAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item, parent, false);

        return new ShopViewHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final ShopViewHolder holder, int position) {
        ShopViewHolder.onBind(mContext, mExampleList, position);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
