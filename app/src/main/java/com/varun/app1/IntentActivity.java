package com.varun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        setTitle("Intent page");
        Button b, sndmsg;
        Intent mainintent = getIntent();
        String number;
        number = mainintent.getStringExtra("Number").toString();
        EditText et = findViewById(R.id.editt);
        et.setText(number);
        b = findViewById(R.id.googlebt);
        b.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.github.com"));
            startActivity(intent);
        });
        sndmsg = findViewById(R.id.sendmsg);
        sndmsg.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String s = et.getText().toString();
            intent.putExtra(Intent.EXTRA_TEXT, s);
            startActivity(Intent.createChooser(intent, "Select an app"));
        });
        ImageButton ib = findViewById(R.id.whats);
        ib.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String s = et.getText().toString();
            intent.putExtra(Intent.EXTRA_TEXT, s);
            intent.setPackage("com.whatsapp");
            startActivity(Intent.createChooser(intent, "Select an app"));
        });
        Button dial = findViewById(R.id.dial);
        dial.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + et.getText().toString()));
            startActivity(intent);
        });
    }
}