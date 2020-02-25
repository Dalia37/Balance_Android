package com.example.balance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight extends AppCompatActivity {
    EditText tv_heigh , tv_weight ;
    Button cala ;
    double result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        tv_heigh = findViewById(R.id.tv_heigh);
        tv_weight=findViewById(R.id.tv_weight);
        cala=findViewById(R.id.profile_btn_result);


        cala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double h = Double.parseDouble(tv_heigh.getText().toString());
                double w = Double.parseDouble(tv_weight.getText().toString());
                result = (w/(h*2));
                String state= result+"";
                Intent intent = new Intent(weight.this , result.class);
                intent.putExtra("result",state);
                intent.putExtra("heigh",tv_heigh.getText().toString());
                startActivity(intent);
            }
        });
    }
}
