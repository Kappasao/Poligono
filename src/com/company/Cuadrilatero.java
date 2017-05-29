package com.company;

/**
 * Created by 46995932D on 05/05/2017.
 */
public class Cuadrilatero extends Poligono{


    public Cuadrilatero(long id, double lado){ super (id, lado);}

    @Override
    public double calcularArea() { return Math.pow(lado,2);}

    @Override
    public String toString() {
        return "Cubo{" +
                "id=" + id +
                ",lado=" + lado +
                "}";
    }


}
