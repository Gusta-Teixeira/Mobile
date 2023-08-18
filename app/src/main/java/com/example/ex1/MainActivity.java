package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btsoma, btgera;
    private TextView contador;

    private String mostra;
    private EditText edprimeiro, edsegundo, edresultado;
    private int valor = 0, resultado = 0, pNum = 0, sNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btsoma = (Button) findViewById(R.id.btsomar);
        contador = (TextView) findViewById(R.id.contadora);

        btsoma.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               valor++;
               contador.setText(""+ valor);
           }
        });


     //Fiz a parte visual do exercício do sorteio, e tentei fazer abaixo, porém da erro na linha 52 e não consegui identificar o erro
     /* btgera = (Button) findViewById(R.id.btGerar);
      edprimeiro = (EditText) findViewById(R.id.PrimeiroNum);
      edsegundo = (EditText) findViewById(R.id.SegundoNum);
      edresultado = (EditText) findViewById(R.id.Resultado);





      btgera.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int pNum = Integer.valueOf(String.valueOf(edprimeiro));
              int sNum = Integer.valueOf(String.valueOf(edsegundo));

              Random random = new Random();
              resultado = random.nextInt((pNum - sNum) + 1) + pNum;
              mostra = String.valueOf(resultado);

              edresultado.setText(mostra);
          }
      });*/

    }


}