package com.sorya.nhams.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sorya.nhams.R;
import com.sorya.nhams.view.viewHolder.RecommendViewHolder;
import com.sorya.nhams.models.recommend.RecommendDetailItem;

import java.util.ArrayList;

public class RecommendAdapter extends RecyclerView.Adapter<RecommendViewHolder> {

    private ArrayList<RecommendDetailItem> mExampleList;
    private Context mContext;
    private AdapterView.OnItemClickListener itemClickListener;

    public RecommendAdapter(ArrayList<RecommendDetailItem> sponSerItems) {
        mExampleList = sponSerItems;
        notifyDataSetChanged();
    }

    public RecommendAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public RecommendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommend_item, parent, false);

        return new RecommendViewHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecommendViewHolder holder, int position) {
        RecommendViewHolder.onBind(mContext, mExampleList, position);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
