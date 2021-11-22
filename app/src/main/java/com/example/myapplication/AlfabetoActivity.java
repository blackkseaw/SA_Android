package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlfabetoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto);
    }

    public void  voltar(View view){
        finish();
    }


    public void call_animals(View view) {
        Intent intent = new Intent(this, Tutorial.class);
        startActivity(intent);
    }
}

