package com.company;

/**
 * Created by 46995932D on 05/05/2017.
 */
public class Triangulo extends Poligono {



    public Triangulo(long id, double base, double altura) {super (id, base, altura);}

    @Override
    public double calcularArea(){ return (base * altura) /2.0 ;}

    @Override
    public String toString() {
        return "Triangulo{" +
                "id=" + id +
                ",base=" + base +
                ",altura=" + altura +
                "}";
    }



}
