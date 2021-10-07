package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void  main2(View view){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);
    }

    public void  main3(View view){
        Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(intent);
    }

    public void  voltarInicio(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
