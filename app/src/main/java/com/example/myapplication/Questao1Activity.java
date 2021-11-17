package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

public class Questao1Activity extends Activity {

    MediaPlayer player;
    private Button bCerto;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);
    }

    //função que faz tocar o som
    public void play(View v) {
        if (player == null){
            player = MediaPlayer.create(this, R.raw.sapo);
        }

        player.start();

    }

    //função que faz o botão certo mudar para verde e após um pop up infrmando o acerto, muda de tela
    public void certo(View v) {

        counter = counter + 1;

        if (bCerto != null) {
            bCerto = findViewById(R.id.certo);
            bCerto.setBackgroundResource(R.drawable.borda_verde);

        }

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_pop_up1, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }

        });

        Button btnproximo1 = (Button) popupView.findViewById(R.id.proximo1);
        btnproximo1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Questao1Activity.this, Questao2Activity.class);
                startActivity(intent);
            }
        });

    }

    //função que faz o botão mudar para vermelho e após um pop up informando o erro, muda pra tela inicial
    public void errado(View v) {

        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }

}
