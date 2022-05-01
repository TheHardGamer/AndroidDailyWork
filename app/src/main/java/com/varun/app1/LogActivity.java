package com.varun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        setTitle("Log activity");
        Log.v("TestApp","Verbose log");
        Log.e("TestApp", "Error log");
        Log.d("TestApp", "Debug log");
        Log.i("TestApp", "Info log");
        Log.w("TestApp", "Warning log");
    }
}