package com.varun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LifecyclActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        t = findViewById(R.id.actlife);
        t.append("\nonCreate called\n");
    }

    @Override
    protected void onStart() {
        t.append("\nonStart called\n");
        super.onStart();
    }

    @Override
    protected void onStop() {
        t.append("\nonStop called\n");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        t.append("\nonDestroy called\n");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        t.append("\nonPause called\n");
        super.onPause();
    }

    @Override
    protected void onResume() {
        t.append("\nonResume called\n");
        super.onResume();
    }
}