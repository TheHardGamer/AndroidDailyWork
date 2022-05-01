package com.varun.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "TestApp";
    public static final String PREF_NAME = "Settings";
    ConstraintLayout constraint;
    Button b1,b2,b3,b4,b5,b6,map,recycle,allsensors,proxi,frag,logact,spinact,lifecycl;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SharedPreferences sp = getSharedPreferences(PREF_NAME,0);
        boolean snackbarshown = sp.getBoolean("snackbarshow", false);
        if(!snackbarshown) {
            Snackbar snackbar = Snackbar
                    .make(constraint, "Main activity", Snackbar.LENGTH_LONG);
            snackbar.show();
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("snackbarshow", true);
            editor.apply();
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IntentActivity.class);
                intent.putExtra("Number", "7778894499");
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdialog();
                Toast.makeText(getApplicationContext(),"O",Toast.LENGTH_SHORT).show();
            }
        });
        Intent music = new Intent(getApplicationContext(), MusicService.class);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(music);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(music);
            }
        });
        Intent ii = getIntent();
        String action = ii.getAction();
        String type = ii.getType();
        if(Intent.ACTION_SEND.equals(action) && type != null) {
            i.setImageURI(ii.getParcelableExtra(Intent.EXTRA_STREAM));
        }
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changelanguage();
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(i);
            }
        });
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RecyclerViewActivity.class);
                startActivity(i);
            }
        });
        allsensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SensorActivity.class);
                startActivity(i);
            }
        });
        proxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ProximityActivity.class);
                startActivity(i);
            }
        });
        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FragmentActivity.class);
                startActivity(i);
            }
        });
        logact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LogActivity.class);
                startActivity(i);
            }
        });
        spinact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SpinActivity.class);
                startActivity(i);
            }
        });
        lifecycl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LifecyclActivity.class);
                startActivity(i);
            }
        });
    }

    private void changelanguage() {
        final String[] languages = {"English","Gujarati","Hindi"};
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(this);
        alertdialogbuilder.setTitle("Change Language");
        alertdialogbuilder.setSingleChoiceItems(languages, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i==0)
                {
                    setlocale("");
                    recreate();
                }
                else if(i==1)
                {
                    setlocale("gu");
                    recreate();
                }
                else if(i==2)
                {
                    setlocale("hi");
                    recreate();
                }
            }
        });
        alertdialogbuilder.create();
        alertdialogbuilder.show();
    }
    private void setlocale(String lang) {
        Locale l = new Locale(lang);
        Locale.setDefault(l);
        recreate();
        Configuration configuration = new Configuration();
        configuration.locale = l;
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("lang",lang);
        editor.apply();
    }
    private void loadlocale() {
        SharedPreferences p = getSharedPreferences(PREF_NAME, 0);
        String lang = p.getString("lang", "");
        setlocale(lang);
    }

    public void showdialog(){
        Dialog d = new Dialog(this);
        d.setContentView(R.layout.dialog_box);
        Button close = (Button) d.findViewById(R.id.ok);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.dismiss();
            }
        });
        d.show();
    }
     private void init() {
        constraint = (ConstraintLayout) findViewById(R.id.constr);
        b1 = (Button) findViewById(R.id.firstactbtn);
        b2 = (Button) findViewById(R.id.intentactbtn);
        b3 = (Button) findViewById(R.id.exitt);
        b4 = (Button) findViewById(R.id.playmusic);
        b5 = (Button) findViewById(R.id.stopm);
        b6 = (Button) findViewById(R.id.changelang);
        i = (ImageView) findViewById(R.id.imagev);
        map = (Button) findViewById(R.id.mapsact);
        recycle = (Button) findViewById(R.id.recycleract);
        allsensors = (Button) findViewById(R.id.allsensors);
        proxi = (Button) findViewById(R.id.proxi);
        frag = (Button) findViewById(R.id.fragact);
        logact = (Button) findViewById(R.id.logact);
        spinact = (Button) findViewById(R.id.spinact);
        lifecycl = (Button) findViewById(R.id.lifecycl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Sharing:DDDDDDDDD");
                startActivity(Intent.createChooser(intent, "Select an app"));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}