package com.varun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class SensorActivity extends AppCompatActivity {

    SensorManager s;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        t = findViewById(R.id.sensorstext);
        t.setVisibility(View.GONE);
        s = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> l = s.getSensorList(Sensor.TYPE_ALL);
        for(int i =1; i<l.size();i++) {
            t.setVisibility(View.VISIBLE);
            t.append("\n" + l.get(i).getName() + "\n" + l.get(i).getVendor() + "\n" +l.get(i).getPower());
        }
    }
}