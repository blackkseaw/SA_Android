package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main2Activity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void  voltar(View view){
        finish();
    }

//    public void call_home(View view) {
//        Intent intent = new Intent(this, Menu1Activity.class);
//        startActivity(intent);
//    }

    //Chamando NavBottom
    public void call_parent(View view) {
        Intent intent = new Intent(this, Menu2Activity.class);
        startActivity(intent);
    }
    public void call_info(View view) {
        Intent intent = new Intent(this, Menu3Activity.class);
        startActivity(intent);
    }
    public void call_about(View view) {
        Intent intent = new Intent(this, Menu4Activity.class);
        startActivity(intent);
    }

    //Chamando jogos
    public void call_game1(View view) {
        Intent intent = new Intent(this, MainJogo1Activity.class);
        startActivity(intent);
    }
    public void call_game2(View view) {
        Intent intent = new Intent(this, MainJogo2Activity.class);
        startActivity(intent);
    }
    public void call_game3(View view) {
        Intent intent = new Intent(this, MainJogo3Activity.class);
        startActivity(intent);
    }
    public void call_game4(View view) {
        Intent intent = new Intent(this, MainJogo4Activity.class);
        startActivity(intent);
    }

    //Chamando telas das áreas
    public void call_logico(View view) {
        Intent intent = new Intent(this, Logico.class);
        startActivity(intent);
    }
    public void call_alfabeto(View view) {
        Intent intent = new Intent(this, AlfabetoActivity.class);
        startActivity(intent);
    }
    public void call_social(View view) {
        Intent intent = new Intent(this, SocialActivity.class);
        startActivity(intent);
    }
    public void call_motor(View view) {
        Intent intent = new Intent(this, MotorActivity.class);
        startActivity(intent);
    }
}