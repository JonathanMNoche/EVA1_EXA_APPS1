package com.example.eva1_exa_adivina_el_numero_que_falta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView tV, tV2, tV3, tV4, tV5;
    Random ran = new Random();
    Button btnIniciar, btnReiniciar;
    EditText eTRes;
    double[] a = new double[5];
    int x = random(), i = 0, b = 0;
    RadioGroup rG;
    RadioButton val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = findViewById(R.id.tV);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        tV5 = findViewById(R.id.tV5);
        btnIniciar = findViewById(R.id.btnIniciar);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        eTRes = findViewById(R.id.eTRes);
        rG = findViewById(R.id.rG);
        rG.setOnCheckedChangeListener(this);
    }
    /**
    public void iniciarGeom(View view){
        //𝑎𝑛 = 𝑎1 × 𝑟^(𝑛−1)

        //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO
        double[] a = new double[5];
        Random ran = new Random();
        int r = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
        for (int i = 0; i <= 4; i++) {
            a[i] = a1 * Math.pow(r, i-1);
        }
        //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

        //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
        tV.setText("" + a[0]);
        tV2.setText("" + a[1]);
        tV3.setText("" + a[2]);
        tV4.setText("" + a[3]);
        tV5.setText("" + a[4]);
        //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

        //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

        switch (x){
            case 0 : tV.setText(""); break;
            case 1 : tV2.setText(""); break;
            case 2 : tV3.setText(""); break;
            case 3 : tV4.setText(""); break;
            case 4 : tV5.setText(""); break;
        }

        btnReiniciar.setClickable(true);
    }

    public void iniciarArit(View view){
        //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

        int d = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
        // 𝑎𝑛 = 𝑎1 + (𝑛 − 1) × d
        for (int i = 0; i <= 4; i++) {
            a[i] = a1 + (i - 1) * d;
        }
        //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

        //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
        tV.setText("" + a[0]);
        tV2.setText("" + a[1]);
        tV3.setText("" + a[2]);
        tV4.setText("" + a[3]);
        tV5.setText("" + a[4]);
        //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

        //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

        switch (x){
            case 0 : tV.setText(""); break;
            case 1 : tV2.setText(""); break;
            case 2 : tV3.setText(""); break;
            case 3 : tV4.setText(""); break;
            case 4 : tV5.setText(""); break;
        }

        btnReiniciar.setClickable(true);
    }
    **/
    public void responder(View view){
        double res = Double.parseDouble(eTRes.getText().toString());
                if(res == a[x]){
                    Toast.makeText(this, "Correcto",Toast.LENGTH_LONG).show();
                    switch (x){
                        case 0 : tV.setText("" + a[x]); break;
                        case 1 : tV2.setText("" + a[x]); break;
                        case 2 : tV3.setText("" + a[x]); break;
                        case 3 : tV4.setText("" + a[x]); break;
                        case 4 : tV5.setText("" + a[x]); break;
                    }
                }
                else if(i == 3){
                    //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

                    int d = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
                    // 𝑎𝑛 = 𝑎1 + (𝑛 − 1) × d
                    for (int i = 0; i <= 4; i++) {
                        a[i] = a1 + (i - 1) * d;
                    }
                    //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

                    //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
                    tV.setText("" + a[0]);
                    tV2.setText("" + a[1]);
                    tV3.setText("" + a[2]);
                    tV4.setText("" + a[3]);
                    tV5.setText("" + a[4]);
                    //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

                    //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

                    switch (x){
                        case 0 : tV.setText(""); break;
                        case 1 : tV2.setText(""); break;
                        case 2 : tV3.setText(""); break;
                        case 3 : tV4.setText(""); break;
                        case 4 : tV5.setText(""); break;
                    }

                    i = 0;
                    Toast.makeText(this,"¡Perdiste!", Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(this, "Incorrecto, quedan " + (3 - i) + " oportunidades",Toast.LENGTH_LONG).show();
                    //Toast.makeText(this, ""+a[x],Toast.LENGTH_LONG).show();
                }
                i++;
    }
    /**
    public void reiniciar(View view){
        //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

        int d = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
        // 𝑎𝑛 = 𝑎1 + (𝑛 − 1) × d
        for (int i = 0; i <= 4; i++) {
            a[i] = a1 + (i - 1) * d;
        }
        //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

        //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
        tV.setText("" + a[0]);
        tV2.setText("" + a[1]);
        tV3.setText("" + a[2]);
        tV4.setText("" + a[3]);
        tV5.setText("" + a[4]);
        //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

        //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

        switch (x){
            case 0 : tV.setText(""); break;
            case 1 : tV2.setText(""); break;
            case 2 : tV3.setText(""); break;
            case 3 : tV4.setText(""); break;
            case 4 : tV5.setText(""); break;
        }

    }
    **/
    public int random(){
        int quit = ran.nextInt(5);
        return quit;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        val = findViewById(checkedId);
        if(val.getText().equals("Fórmula geométrica")){
            //ASIGNAR LISTENER PARA FÓRMULA GEOMÉTRICA
            btnIniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

                    int r = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
                    for (int i = 0; i <= 4; i++) {
                        a[i] = a1 * Math.pow(r, i-1);
                    }
                    //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

                    //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
                    tV.setText("" + a[0]);
                    tV2.setText("" + a[1]);
                    tV3.setText("" + a[2]);
                    tV4.setText("" + a[3]);
                    tV5.setText("" + a[4]);
                    //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

                    //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

                    switch (x){
                        case 0 : tV.setText(""); break;
                        case 1 : tV2.setText(""); break;
                        case 2 : tV3.setText(""); break;
                        case 3 : tV4.setText(""); break;
                        case 4 : tV5.setText(""); break;
                    }

                    btnReiniciar.setClickable(true);
                    //x = random();
                }
            });

            btnReiniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

                    int r = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
                    for (int i = 0; i <= 4; i++) {
                        a[i] = a1 * Math.pow(r, i-1);
                    }
                    //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

                    //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
                    tV.setText("" + a[0]);
                    tV2.setText("" + a[1]);
                    tV3.setText("" + a[2]);
                    tV4.setText("" + a[3]);
                    tV5.setText("" + a[4]);
                    //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

                    //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

                    switch (x){
                        case 0 : tV.setText(""); break;
                        case 1 : tV2.setText(""); break;
                        case 2 : tV3.setText(""); break;
                        case 3 : tV4.setText(""); break;
                        case 4 : tV5.setText(""); break;
                    }
                    x = random();
                }
            });
        }
        //ASIGNAR LISTENER PARA FÓRMULA ARITMÉTICA
        else{
            btnIniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

                    int d = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
                    // 𝑎𝑛 = 𝑎1 + (𝑛 − 1) × d
                    for (int i = 0; i <= 4; i++) {
                        a[i] = a1 + (i - 1) * d;
                    }
                    //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

                    //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
                    tV.setText("" + a[0]);
                    tV2.setText("" + a[1]);
                    tV3.setText("" + a[2]);
                    tV4.setText("" + a[3]);
                    tV5.setText("" + a[4]);
                    //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

                    //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

                    switch (x){
                        case 0 : tV.setText(""); break;
                        case 1 : tV2.setText(""); break;
                        case 2 : tV3.setText(""); break;
                        case 3 : tV4.setText(""); break;
                        case 4 : tV5.setText(""); break;
                    }

                    btnReiniciar.setClickable(true);
                    //x = random();
                }
            });

            btnReiniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //AQUÍ SE GENERAN LOS NÚMEROS Y SE ALMACENAN EN ARREGLO

                    int d = ran.nextInt(6) + 5, a1 = ran.nextInt(6) + 5;
                    // 𝑎𝑛 = 𝑎1 + (𝑛 − 1) × d
                    for (int i = 0; i <= 4; i++) {
                        a[i] = a1 + (i - 1) * d;
                    }
                    //AQUÍ TERMINA LA GENERACIÓN Y ALMACENAMIENTO DE NÚMEROS ALEATORIOS

                    //AQUÍ INICIA ASIGNACIÓN DE VALORES A CADA ESPACIO
                    tV.setText("" + a[0]);
                    tV2.setText("" + a[1]);
                    tV3.setText("" + a[2]);
                    tV4.setText("" + a[3]);
                    tV5.setText("" + a[4]);
                    //AQUÍ TERMINA LA ASIGNACIÓN DE VALORES A CADA ESPACIO

                    //AQUÍ SE DECIDE QUÉ NÚMERO VA A DESAPARECER

                    switch (x){
                        case 0 : tV.setText(""); break;
                        case 1 : tV2.setText(""); break;
                        case 2 : tV3.setText(""); break;
                        case 3 : tV4.setText(""); break;
                        case 4 : tV5.setText(""); break;
                    }
                    x = random();
                }
            });

        }
    }
}