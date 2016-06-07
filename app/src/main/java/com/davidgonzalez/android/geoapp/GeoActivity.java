package com.davidgonzalez.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.davidgonzalez.android.model.Pregunta;

public class GeoActivity extends AppCompatActivity {
    protected Button mBotonCierto, mBotonFalso, mBotonSiguiente;
    private TextView mTextViewPregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBotonCierto = (Button) findViewById(R.id.id_boton_cierto);
        mBotonFalso = (Button) findViewById(R.id.id_boton_falso);
        mBotonSiguiente = (Button) findViewById(R.id.id_boton_siguiente);
        mTextViewPregunta = (TextView) findViewById(R.id.id_textview_preguntas);

        mBotonSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mPreguntaActual = mPreguntaActual + 1;
                if (mPreguntaActual == mBancoDePreguntas.length){
                    mPreguntaActual = 0;
                }
                actualizarPregunta();
            }
        });

    }

    public void boton_click_cierto(View view) {
        verificarRespuesta(true);
    }

    public void boton_click_falso(View view) {
        verificarRespuesta(false);
    }


    private Pregunta mBancoDePreguntas[] = {
            new Pregunta(R.string.texto_pregunta_1, false),
            new Pregunta(R.string.texto_pregunta_2, true),
            new Pregunta(R.string.texto_pregunta_3, true),
            new Pregunta(R.string.texto_pregunta_4, true),
            new Pregunta(R.string.texto_pregunta_5, false),
    };
    private int mPreguntaActual = 0;


    private void actualizarPregunta(){
        int preguntaActual = mBancoDePreguntas[mPreguntaActual].getmIdResTexto();
        mTextViewPregunta.setText(preguntaActual);
    }


    private void verificarRespuesta(boolean botonOprimido){
        boolean respuestaEsVerdadera = mBancoDePreguntas[mPreguntaActual].isVerdadera();
        if (botonOprimido == respuestaEsVerdadera){
            Toast.makeText(GeoActivity.this, R.string.texto_respuesta_correcta, Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(GeoActivity.this, R.string.texto_respuesta_incorrecto, Toast.LENGTH_SHORT)
                    .show();
        }

    }


}