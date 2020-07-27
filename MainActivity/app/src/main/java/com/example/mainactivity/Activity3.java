package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;

import android.widget.VideoView;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {
    VideoView videoView;
    ListView listView1;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        videoView=(VideoView)findViewById(R.id.videoView);
        listView1=(ListView)findViewById(R.id.videolistview);

        videoList = new ArrayList<>();
        videoList.add("Relaxing Yoga ");
        videoList.add("Stress Relief Yoga");
        videoList.add("Yoga For Begginers");
       videoList.add("Yoga For Arms");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.relaxing_yoga_for_peace));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.stress_relief_yoga));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.yoga_for_begginers));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(Activity3.this));
                videoView.requestFocus();
                videoView.start();
            }
        });

    }
}
