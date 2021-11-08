package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private static final int TEMPO_PARA_ABRIR_LOGIN = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Handler handler = new Handler();
        handler.postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        abrirHome();
                    }
                }, TEMPO_PARA_ABRIR_LOGIN
        );
    }

    //Abrir tela de inicio após 2000 milissegundos
    private void abrirHome(){
        Intent iHome = new Intent(this, MainActivity.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
        ActivityCompat.startActivity(HomeActivity.this, iHome, activityOptionsCompat.toBundle());
        startActivity(iHome);
        finish();//fechar tela de splash
    }
}
