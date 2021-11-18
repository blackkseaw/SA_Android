package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainJogo1Activity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1_jogo);
    }
    public void quest1(View v) {

        Intent intent = new Intent(MainJogo1Activity.this, Questao1Activity.class);
        startActivity(intent);

    }
    public void  voltar(View view){
        finish();
    }
}