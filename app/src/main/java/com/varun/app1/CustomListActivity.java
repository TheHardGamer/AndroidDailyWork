package com.varun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    ListView l;
    String[] country = {"India", "China", "Canada", "India", "China", "Canada", "India", "China", "Canada", "India", "China", "Canada", "India", "China", "Canada", "India",
            "China", "Canada", "assdpigoidfsigj", "China", "ok","mnb", "sfojsdjgi", "Canada","India", "China", "Canada","India", "China", "Canada","India", "China", "Canada","India", "China", "Canada","India", "China", "Canada"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        l = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> a = new ArrayAdapter<String>(this, R.layout.row_layout,
                R.id.name,country);
        l.setAdapter(a);
    }
}