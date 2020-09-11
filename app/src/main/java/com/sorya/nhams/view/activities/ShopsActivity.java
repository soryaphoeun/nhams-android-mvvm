package com.sorya.nhams.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sorya.nhams.R;
import com.sorya.nhams.view.fragments.MapsFragment;
import com.sorya.nhams.view.fragments.ShopsFragment;

public class ShopsActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView back, map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);

        onBindView();
        back.setOnClickListener(this);
        map.setOnClickListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                    new ShopsFragment()).commit();
        }

    }

    private void onBindView(){
        back = findViewById(R.id.imgBack);
        map = findViewById(R.id.imgMap);

    }

    @Override
    public void onClick(View view) {
        if (view == back){
            onBackPressed();
            finish();
        }else if (view == map){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                    new MapsFragment()).commit();
        }
    }
}