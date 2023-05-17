package com.mycompany.mavenproject2;

public class Venta {
    // Atributo

    private Producto producto;

    // Constructor
    public Venta(Producto producto) {
        this.producto = producto;
    }

    // Método para calcular el descuento según las reglas dadas
    public double calcularDescuento() {
        double descuento = 0;
        if (producto.getPrecio() >= 1000 && producto.getNumero() >= 10) {
            // Si el precio es mayor o igual a $1000 y el número de productos al menos 10, se aplica un descuento del 10%
            descuento = producto.getPrecio() * producto.getNumero() * 0.1;
        } else if (producto.getPrecio() < 1000) {
            // Si el precio es menor a $1000, se aplica un descuento del 5%, independientemente del número de productos
            descuento = producto.getPrecio() * producto.getNumero() * 0.05;
        }
        return descuento;
    }

    // Método para calcular el precio final después de aplicar el descuento
    public double calcularPrecioFinal() {
        double precioFinal = producto.getPrecio() * producto.getNumero() - calcularDescuento();
        return precioFinal;
    }
}
