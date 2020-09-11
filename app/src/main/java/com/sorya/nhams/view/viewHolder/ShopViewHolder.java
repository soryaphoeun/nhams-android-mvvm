package com.sorya.nhams.view.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sorya.nhams.R;
import com.sorya.nhams.models.shop.ShopDetailItem;

import java.util.ArrayList;

public class ShopViewHolder extends RecyclerView.ViewHolder {
    private static ImageView mImageView;

    public ShopViewHolder(@NonNull View itemView, final AdapterView.OnItemClickListener itemClickListener) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.imgShop);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                itemClickListener.onItemClick(RecommendViewHolder.this.getAdapterPosition());
            }
        });
    }

    public static void onBind(Context mContext, ArrayList<ShopDetailItem> favoriteItemList, int position) {
        mImageView.setImageResource(favoriteItemList.get(position).getShopImage());
    }
}
