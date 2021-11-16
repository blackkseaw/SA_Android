package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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



//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.fragment_container, new HomeFragment());
//        fragmentTransaction.commit();

//        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
//        bottomNav.setOnNavigationItemSelectedListener(navListener);

    }

//    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment selectFragment = null;
//
//            switch (item.getItemId()){
//                case R.id.nav_home:
//                    selectFragment = new HomeFragment();
//                    break;
//                case R.id.nav_parent:
//                    selectFragment = new ParentFragment();
//                    break;
//                case R.id.nav_about:
//                    selectFragment = new AboutFragment();
//                    break;
//                case R.id.nav_info:
//                    selectFragment = new InfoFragment();
//                    break;
//            }
//
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                    selectFragment).commit();
//
//            return true;
//        }
//    };

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
    public void game1(View view) {
        Intent intent = new Intent(this, Jogo1Activity.class);
        startActivity(intent);
    }
}