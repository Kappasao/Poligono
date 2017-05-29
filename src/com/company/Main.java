package com.company;

/**
 * Created by 46995932D on 05/05/2017.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Poligono> poligonoList = new ArrayList<>();

        Triangulo t1 = new Triangulo(2, 7.0, 8.0);
        Triangulo t2 = new Triangulo(4, 8.0, 9.0);

        Cuadrilatero c1 = new Cuadrilatero(1, 6.0);
        Cuadrilatero c2 = new Cuadrilatero(5, 9.0);

        Pentagono p1 = new Pentagono(3, 5.0, 6.0);
        Pentagono p2 = new Pentagono(6, 7.0, 8.0);


        poligonoList.add(c1);
        poligonoList.add(c2);
        poligonoList.add(t1);
        poligonoList.add(t2);
        poligonoList.add(p1);
        poligonoList.add(p2);

        for (Poligono poligono : poligonoList
                ) {
            System.out.println(poligono);
            System.out.println("El area es de : " + poligono.calcularArea() + " centimetros");

            System.out.println("----------------------------");
        }
    }
}
