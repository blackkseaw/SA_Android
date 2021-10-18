package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin =  (TextView) findViewById(R.id.tLogin);
                TextView tSenha =  (TextView) findViewById(R.id.tSenha);
                String login =  tLogin.getText().toString();
                String senha =  tSenha.getText().toString();
                if(login.equals("pedro")&&senha.equals("123")){
                    alert("Login realizado com sucesso");
                }else {
                    alert("Login ou senhas incorretos");
                }
            }
        });
    }
    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

    public void cadastro(View view){
        Intent intent = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(intent);
    }
}
