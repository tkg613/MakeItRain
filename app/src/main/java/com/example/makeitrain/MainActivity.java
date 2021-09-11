package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button showMoney;
    private Button showTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMoney = findViewById(R.id.button_make_rain);
        showTag = findViewById(R.id.button_show_tag);
    }

    public void showTag(View v){
        Log.d("myTag", "showTag: show money");
    }

    public void makeItRain(View v){
        Log.d("mir", "makeItRain: Tapped");
    }
}