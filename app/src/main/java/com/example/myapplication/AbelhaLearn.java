package com.example.myapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AbelhaLearn extends Activity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abelha_learn);
    }

    public void somAbelhaLearn(View v) {
        if (player == null){
            player = MediaPlayer.create(this, R.raw.abelha);
        }

        player.start();

    }

}
