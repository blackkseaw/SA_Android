package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainJogo4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_jogo4);
    }

    public void social_game(View v) {

        Intent intent = new Intent(this, Situacao1Activity.class);
        startActivity(intent);

    }
    public void  voltar(View view){
        finish();
    }
}

