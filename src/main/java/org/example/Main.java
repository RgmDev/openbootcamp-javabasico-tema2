package org.example;

public class Main {
    public static void main(String[] args) {

        double precio = 20.20;
        double precioConIVA = addIVA(precio);
        System.out.println(precioConIVA);

    }

    public static double addIVA(double precio) {
        return precio + (precio * 0.16);
    }
}

