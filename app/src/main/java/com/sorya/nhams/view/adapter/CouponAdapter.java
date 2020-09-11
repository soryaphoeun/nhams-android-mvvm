package com.sorya.nhams.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sorya.nhams.R;
import com.sorya.nhams.view.viewHolder.CouponViewHolder;
import com.sorya.nhams.models.coupon.CouponDetailItem;

import java.util.ArrayList;

public class CouponAdapter extends RecyclerView.Adapter<CouponViewHolder> {
    private ArrayList<CouponDetailItem> mExampleList;
    private Context mContext;
    private AdapterView.OnItemClickListener itemClickListener;

    public CouponAdapter(ArrayList<CouponDetailItem> sponSerItems) {
        mExampleList = sponSerItems;
        notifyDataSetChanged();
    }

    public CouponAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public CouponViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.coupon_item, parent, false);

        return new CouponViewHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final CouponViewHolder holder, int position) {
        CouponViewHolder.onBind(mContext, mExampleList, position);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
