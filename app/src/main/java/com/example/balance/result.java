package com.example.balance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {
    TextView tv_state , tv_num_state ;
    ImageView img_state ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv_state=findViewById(R.id.fat_tv);
        tv_num_state=findViewById(R.id.fat_result);
        img_state=findViewById(R.id.fat_img);

        String result = getIntent().getStringExtra("result");
        double result11=Double.parseDouble(result);
        String h1 =getIntent().getStringExtra("heigh");
        double heigh = Double.parseDouble(h1);

        if(heigh<1.55&&heigh>=1.50){
            tv_num_state.setText(94+"");
        }else
            if(heigh<1.60&&heigh>=1.55){
                tv_num_state.setText(55+"");
            }
            else
                if(heigh<1.65&&heigh>=1.60){
                    tv_num_state.setText(60+"");
                }else
                    if(heigh<1.70&&heigh>=1.65){
                        tv_num_state.setText(68+"");
                    }else
                        if (heigh<1.80&&heigh>=1.70){
                            tv_num_state.setText(70+"");
                        }



        if(result11<=25 && result11>=20){
            tv_state.setText(R.string.good);
            img_state.setImageResource(R.drawable.good);

        }else
            if (result11>25 && result11<=30){
                tv_state.setText(R.string.fat);
                img_state.setImageResource(R.drawable.fat);
            }else
                if (result11>30){
                    tv_state.setText(R.string.veryfat);
                    img_state.setImageResource(R.drawable.fitness);
                }else
                    if (result11<20 && result11>=15){
                        tv_state.setText(R.string.thin);
                        img_state.setImageResource(R.drawable.thin);
                    }
                    else
                        if (result11 <15){
                            tv_state.setText(R.string.verthin);
                            img_state.setImageResource(R.drawable.very_thin);

                        }else
                            Toast.makeText(this, " there error", Toast.LENGTH_SHORT).show();


        }


    public void yourAdvice(View view) {
        Intent intent = new Intent(result.this , List.class);
        startActivity(intent);
    }



}

