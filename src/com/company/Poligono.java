package com.company;

/**
 * Created by 46995932D on 05/05/2017.
 */
public abstract class Poligono {

    protected long id;
    protected double base;
    protected double altura;
    protected double lado;

    public Poligono(long id, double base, double altura) {
        this.id = id;
        this.base = base;
        this.altura = altura;
    }

    public Poligono(long id, double lado) {
        this.id = id;
        this.lado = lado;
    }


    public long getId() {
        return id;
    }

    public abstract double calcularArea();
}
