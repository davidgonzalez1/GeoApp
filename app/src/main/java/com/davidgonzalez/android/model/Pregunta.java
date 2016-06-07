package com.davidgonzalez.android.model;

/**
 * Created by Rodrigo Tamay Moo on 07/06/2016.
 */
public class Pregunta {
    private Integer mIdResTexto;
    private boolean mRespuestaVerdadera;

    public Pregunta(Integer mIdResTexto, boolean respuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = respuestaVerdadera;
    }

    public Integer getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(Integer mIdResTexto) {
    }

    public void setRespuestaVerdadera(boolean respuestaVerdadera) {

    }

    public boolean isRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }


    public boolean isVerdadera() {
        return false;
    }
}