package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Aprender extends AppCompatActivity {

    Button btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender);
    }

    public void call_abelha(View view) {
        Intent intent = new Intent(this, AbelhaLearn.class);
        startActivity(intent);
    }

    public void call_cachorro(View view) {
        Intent intent = new Intent(this, CachorroLearn.class);
        startActivity(intent);
    }

    public void call_bode(View view) {
        Intent intent = new Intent(this, BodeLearn.class);
        startActivity(intent);
    }

}
