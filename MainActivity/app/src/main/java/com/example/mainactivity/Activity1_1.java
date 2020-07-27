package com.example.mainactivity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class Activity1_1 extends AppCompatActivity {
    Toolbar mtoolbar;
    ImageView img;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_1);

        mtoolbar=(Toolbar) findViewById(R.id.toolbar1_1);
        img=(ImageView) findViewById(R.id.imageView);

        Bundle bundle= getIntent().getExtras();
        if(bundle!=null){
            mtoolbar.setTitle(bundle.getString("Poses"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("Angle")){
                img.setImageDrawable(ContextCompat.getDrawable(Activity1_1.this,
                    R.drawable.angel));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Big toe")){
                img.setImageDrawable(ContextCompat.getDrawable(Activity1_1.this,
                    R.drawable.big_toe));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Cow Pose")){
                img.setImageDrawable(ContextCompat.getDrawable(Activity1_1.this,
                    R.drawable.cow));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Dolphin Pose")){
                img.setImageDrawable(ContextCompat.getDrawable(Activity1_1.this,
                    R.drawable.dolphin));
            }

        }

    }
}
