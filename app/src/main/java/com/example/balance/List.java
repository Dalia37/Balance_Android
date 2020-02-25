package com.example.balance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rv=findViewById(R.id.rv_tips);

        ArrayList<Tips> tips = new ArrayList<>();
        tips.add(new Tips(R.drawable.tip_first,getResources().getString(R.string.tip_first_name),getResources().getString(R.string.tip_first_des)));
        tips.add(new Tips(R.drawable.tips_tow ,getResources().getString(R.string.tip_second_name), getResources().getString(R.string.tip_second_des)));
        tips.add(new Tips(R.drawable.tea,getResources().getString(R.string.tip_third_name),getResources().getString(R.string.tip_third_des)));
        tips.add(new Tips(R.drawable.bread,getResources().getString(R.string.tip_forth_name),getResources().getString(R.string.tip_forth_des)));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter(tips);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

    }

}
