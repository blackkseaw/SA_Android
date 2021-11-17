package com.example.myapplication;

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

import androidx.appcompat.app.AppCompatActivity;

public class Questao10Activity extends AppCompatActivity {

    MediaPlayer player;
    private Button bCerto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao10);

    }

    //função que faz tocar o som
    public void playPassarinho(View v) { //ALTERAR PARA O ANIMAL
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.passarinho);
        }

        player.start();
    }

    //função que faz o botão certo mudar para verde e após um pop up infrmando o acerto
    public void certo10(View v) {

        if (bCerto != null) {
            bCerto = findViewById(R.id.certo);
            bCerto.setBackgroundResource(R.drawable.borda_verde);

        }

        //POPUP

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_pop_up10, null); //nao esquecer de trocar o pop up daqui

        // cria a janela do popup
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // mostra a janela do popup
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

        //faz o botao do popup funcionar
        Button btnproximo1 = (Button) popupView.findViewById(R.id.proximo10);
        btnproximo1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Questao10Activity.this, Ganhou.class);
                startActivity(intent);
            }
        });

    }

    //função que faz o botão mudar para vermelho e após um pop up informando o erro, muda pra tela inicial
    public void errado10 (View v) {

        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}
