package com.example.toss;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void onClick(View v){
        ImageView iv=(ImageView) v;
        MediaPlayer mp=MediaPlayer.create(this,R.raw.coin);
        mp.start();
        iv.setTranslationY(-2000);
        String win;
      int i=new Random().nextInt(1000);
      if(i%2==0){
        iv.setImageResource(R.drawable.tails);
      win="TAILS";}
      else{
          iv.setImageResource(R.drawable.heads);
          win="HEADS";
      }
        iv.animate().translationYBy(2000);
        iv.animate().rotation(3600);
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("IT'S "+win);
        tv.setVisibility(tv.VISIBLE);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}