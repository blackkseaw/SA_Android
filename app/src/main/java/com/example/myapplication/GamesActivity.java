package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);

    }
    public void  voltar(View view){
        finish();
    }

//    public void onClickHome(View view) {
//        Toast.makeText(this, "socorro", Toast.LENGTH_SHORT).show();
//        LogicaFragment logicaFragment= new LogicaFragment();
//        this.getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_container, logicaFragment, "findThisFragment")
//                .addToBackStack(null)
//                .commit();
//    }

}
