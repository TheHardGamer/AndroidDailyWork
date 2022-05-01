package com.varun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ProximityActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager s;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity);
        t = findViewById(R.id.proxtext);
        s = (SensorManager) getSystemService(SENSOR_SERVICE);
        if(s != null) {
            Sensor proximity = s.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            if(proximity != null) {
                s.registerListener(this, proximity, s.SENSOR_DELAY_NORMAL);
            }
        }
        else {
            Toast.makeText(this, "Sensor failed", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType() == Sensor.TYPE_PROXIMITY) {
            t.setText("Proximity: " + sensorEvent.values[0]);
        }
        if(sensorEvent.values[0] > 0) {
            WindowManager.LayoutParams p = getWindow().getAttributes();
            p.screenBrightness = -1;
            getWindow().setAttributes(p);
        }
        else {
            WindowManager.LayoutParams p = getWindow().getAttributes();
            p.screenBrightness = 1;
            getWindow().setAttributes(p);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}