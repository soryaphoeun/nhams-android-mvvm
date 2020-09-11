package com.sorya.nhams.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.sorya.nhams.R;
import com.sorya.nhams.view.adapter.CouponAdapter;
import com.sorya.nhams.view.adapter.RecommendAdapter;
import com.sorya.nhams.models.coupon.CouponDetailItem;
import com.sorya.nhams.models.recommend.RecommendDetailItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private RecommendAdapter recommendAdapter;
    private CouponAdapter couponAdapter;
    private RecyclerView recommendRecyclerView, couponRecyclerView;
    private LinearLayout llNearMe;

    private ArrayList<RecommendDetailItem>  recommendItemList;
    private ArrayList<CouponDetailItem> couponItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        onBindView();
        registerOnClick(this);
    }

    private void onBindView(){
        recommendRecyclerView = findViewById(R.id.rvRecommend);
        couponRecyclerView = findViewById(R.id.rvCoupon);
        llNearMe = findViewById(R.id.llNearMe);
    }

    private  void registerOnClick(View.OnClickListener clickListener){
        couponRecycler(couponRecyclerView);
        recommendRecycler(recommendRecyclerView);
        llNearMe.setOnClickListener(clickListener);
    }

    private void recommendRecycler(RecyclerView recyclerView) {
        recommendItemList = new ArrayList<>();
        recommendItemList.add(new RecommendDetailItem(R.drawable.ic_recommend_01));
        recommendItemList.add(new RecommendDetailItem(R.drawable.ic_recommend_02));
        recommendItemList.add(new RecommendDetailItem(R.drawable.ic_recommend_03));
        recommendItemList.add(new RecommendDetailItem(R.drawable.ic_recommend_04));
        recommendItemList.add(new RecommendDetailItem(R.drawable.ic_recommend_05));

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recommendAdapter = new RecommendAdapter(HomeActivity.this);
        recommendAdapter = new RecommendAdapter(recommendItemList);
//        recommendAdapter.setItemClickListener(getSliverOnItemClickListener());
        recyclerView.setAdapter(recommendAdapter);
    }

    private void couponRecycler(RecyclerView recyclerView) {
        couponItemList = new ArrayList<>();
        couponItemList.add(new CouponDetailItem(R.drawable.ic_coupon_01));
        couponItemList.add(new CouponDetailItem(R.drawable.ic_coupon_02));
        couponItemList.add(new CouponDetailItem(R.drawable.ic_coupon_03));
        couponItemList.add(new CouponDetailItem(R.drawable.ic_coupon_04));
        couponItemList.add(new CouponDetailItem(R.drawable.ic_coupon_05));

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        couponAdapter = new CouponAdapter(HomeActivity.this);
        couponAdapter = new CouponAdapter(couponItemList);
//        recommendAdapter.setItemClickListener(getSliverOnItemClickListener());
        recyclerView.setAdapter(couponAdapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llNearMe :
                Intent intent = new Intent(this, ShopsActivity.class);
                startActivity(intent);
        }
    }
}