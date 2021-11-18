package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Menu2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }

    public void call_home(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    //    public void call_parent(View view) {
//        Intent intent = new Intent(this, Menu2Activity.class);
//        startActivity(intent);
//    }
    public void call_info(View view) {
        Intent intent = new Intent(this, Menu3Activity.class);
        startActivity(intent);
    }

    public void call_about(View view) {
        Intent intent = new Intent(this, Menu4Activity.class);
        startActivity(intent);
    }
}
