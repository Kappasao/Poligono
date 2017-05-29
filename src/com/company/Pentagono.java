package com.company;

/**
 * Created by 46995932D on 05/05/2017.
 */
public class Pentagono extends Poligono {

    private double apotema;

    public Pentagono(long id, double lado, double apotema) {
        super(id, lado);
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {return ((5 * lado) * apotema) / 2 ;}

    @Override
    public String toString() {
        return "Pentagono{" +
                "id=" + id +
                "lado=" + lado +
                "apotema=" + apotema +
                '}';
    }
}
