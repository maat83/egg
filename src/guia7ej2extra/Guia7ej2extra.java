package Ejercicios;

import import Entidades.Puntos;
7-POO.entidades.Puntos;
import java.util.Scanner;

/**
 * @author Pablo Pagani
 */
public class Guia7ej2extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Puntos p1 = new Puntos();

        p1.CrearPuntos();

        System.out.println("La distancia entre los puntos p1 (" + p1.getX1() + ";" + p1.getY1() + ") y p2 (" + p1.getX2() + ";" + p1.getY2() + ") es: " + p1.CalcularDistancia());

    }

}
