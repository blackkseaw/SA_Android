package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Fade;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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
    public void call_game1(View view) {
        Intent intent = new Intent(this, Main1JogoActivity.class);
        startActivity(intent);
    }
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