package com.example.myapplication;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class CachorroLearn extends Activity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cachorro_learn);
    }
    //função que faz tocar o som
    public void somCachorroLearn(View v) {
        if (player == null){
            player = MediaPlayer.create(this, R.raw.cachorro);
        }

        player.start();

    }
}
