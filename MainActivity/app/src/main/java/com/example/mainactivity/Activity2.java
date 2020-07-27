package com.example.mainactivity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Build;
import android.os.Bundle;

import android.widget.ListView;
import android.widget.Toolbar;


import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    Toolbar toolbar;


    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("21 Days of Abundance Chopra");

            songList = (ListView) findViewById(R.id.songList);
            arrayList = new ArrayList<>();
            arrayList.add(new Music("So Ham", "Day 1", R.raw.day_1));
            arrayList.add(new Music("Aham Brahasmi", "Day 2", R.raw.day_2));

            adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
            songList.setAdapter(adapter);
        }

}
