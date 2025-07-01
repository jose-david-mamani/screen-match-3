package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMediaEvaluaciones() / 2;
    }

//    @Override


    @Override
    public String toString() {
        //if (getDirector())
               return  " Pelicula " + getNombre().toUpperCase() + '\n' +
                " Y su clasificacion es de " + getClasificacion();
    }
}
