package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);


//        final Button button = (Button) findViewById(R.id.button2);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Toast.makeText(GamesActivity.this, "Teste", Toast.LENGTH_SHORT).show();
//                System.out.println("OK");
//
//                Intent activityChangeIntent = new Intent(GamesActivity.this, ParentFragment.class);
//                GamesActivity.this.startActivity(activityChangeIntent);
//            }
//        });


    }
    public void  voltar(View view){
        finish();
    }

}
