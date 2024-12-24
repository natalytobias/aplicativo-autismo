package com.example.autismofinal;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.view.View;
import android.content.Intent;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btRespostas,bt_emocoes,btn_familia, btn_acoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btRespostas = findViewById(R.id.btRespostas);
        bt_emocoes = findViewById(R.id.bt_emocoes);
        btn_familia = findViewById(R.id.btn_familia);
        btn_acoes = findViewById(R.id.btn_acoes);

        //botão para ir para tela de repostas
        btRespostas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent telaRespostas = new Intent(getApplicationContext(),TelaRespostas.class);
                startActivity(telaRespostas);

            }
        });

        //botão para ir para tela de emoções
        bt_emocoes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent telaEmocoes = new Intent(getApplicationContext(),telaEmocoes.class);
                startActivity(telaEmocoes);

            }
        });

        btn_acoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaAcoes = new Intent(getApplicationContext(), telaAcoes.class);
                startActivity(telaAcoes);
            }
        });

        btn_familia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent telaFamilia = new Intent(getApplicationContext(),telaFamilia.class);
                startActivity(telaFamilia);
            }
        });




    }


}