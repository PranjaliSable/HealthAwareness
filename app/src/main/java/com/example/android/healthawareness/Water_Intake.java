package com.example.android.healthawareness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Water_Intake extends AppCompatActivity {
Button Calculate;
TextView result;
EditText weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water__intake);
        Calculate=(Button)findViewById(R.id.cal_water);
        result=(TextView)findViewById(R.id.tv2_water);
        weight=(EditText)findViewById(R.id.wt);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight_in_kg=Double.valueOf(weight.getText().toString());
                double water_intake = weight_in_kg * 0.033;
                result.setText("intake"+water_intake);
            }
        });
    }
}
