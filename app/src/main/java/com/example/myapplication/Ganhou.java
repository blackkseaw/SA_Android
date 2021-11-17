package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ganhou extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganhou);

    }
    public void call_game1(View view) {
        Intent intent = new Intent(this, Main1JogoActivity.class);
        startActivity(intent);
    }
    public void voltar_to_ac2(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
