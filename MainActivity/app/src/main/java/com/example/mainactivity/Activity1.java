package com.example.mainactivity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class  Activity1 extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString((R.string.yoga_poses)));
        listView=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> mAdapter= new ArrayAdapter<String>(Activity1.this,
            android.R.layout.simple_list_item_1,
            getResources().getStringArray(R.array.poses));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Activity1.this,Activity1_1.class);
                intent.putExtra("Poses",listView.getItemAtPosition(position).toString());
                startActivity(intent);

            }
        });
        listView.setAdapter(mAdapter);
    }
}

