package com.sorya.nhams.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sorya.nhams.R;
import com.sorya.nhams.models.shop.ShopDetailItem;
import com.sorya.nhams.view.activities.ShopsActivity;
import com.sorya.nhams.view.adapter.ShopAdapter;

import java.util.ArrayList;

public class ShopsFragment extends Fragment implements View.OnClickListener {

//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private String mParam1;
//    private String mParam2;

    private RecyclerView shopRecyclerView;
    private TextView tvShopCount;
    private View view;

    private ShopAdapter shopAdapter;
    private ArrayList<ShopDetailItem> shopItemList;

    private int shopCount;

    public ShopsFragment() {}

    public static ShopsFragment newInstance(String param1, String param2) {
        ShopsFragment fragment = new ShopsFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_shops, container, false);

        shopRecyclerView = view.findViewById(R.id.rvShops);
        tvShopCount = view.findViewById(R.id.tvShopNumber);
        shopRecycler(shopRecyclerView);

        return view;
    }

    private void shopRecycler(RecyclerView shopRecyclerView) {
        shopItemList = new ArrayList<>();
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_01));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_02));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_03));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_04));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_05));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_01));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_02));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_03));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_04));
        shopItemList.add(new ShopDetailItem(R.drawable.ic_recommend_05));

        shopCount = shopItemList.size();
        tvShopCount.setText(""+shopCount);
        tvShopCount.append(" restaurants found");

        shopRecyclerView.setHasFixedSize(true);
        shopRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        shopAdapter = new ShopAdapter(getContext());
        shopAdapter = new ShopAdapter(shopItemList);
//        recommendAdapter.setItemClickListener(getSliverOnItemClickListener());
        shopRecyclerView.setAdapter(shopAdapter);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
        }
    }
}