package com.example.android.healthawareness;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView bmi_calculate,water_intake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmi_calculate=(TextView)findViewById(R.id.textView2);
        water_intake=(TextView)findViewById(R.id.textView3);
        bmi_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Calculate_BMI.class);
                startActivity(i);
            }
        });
        water_intake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Water_Intake.class);
                startActivity(intent);
            }
        });
    }
}
