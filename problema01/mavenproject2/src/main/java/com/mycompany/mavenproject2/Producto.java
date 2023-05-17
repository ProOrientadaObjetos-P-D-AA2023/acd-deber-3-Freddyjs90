package com.mycompany.mavenproject2;

public class Producto {
    // Atributos

    private double precio;
    private int numero;

    // Constructor
    public Producto(double precio, int numero) {
        this.precio = precio;
        this.numero = numero;
    }

    // Métodos getter y setter para acceder y modificar los atributos
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
