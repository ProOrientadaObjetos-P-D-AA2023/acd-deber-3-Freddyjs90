
package com.mycompany.mavenproject2;

import java.util.Scanner;


public class Mavenproject2 {

    public static void main(String[] args) {
          // Crear un objeto de tipo Scanner para leer datos del teclado
    Scanner sc = new Scanner(System.in);

    // Pedir al usuario ingresar el precio y número de productos
    System.out.println("Ingrese el precio del producto:");
    double precio = sc.nextDouble(); // Leer el precio como un número decimal
    System.out.println("Ingrese el número de productos:");
    int numero = sc.nextInt(); // Leer el número como un entero

    // Crear un objeto de tipo Producto con los datos ingresados
    Producto p = new Producto(precio, numero);

    // Crear un objeto de tipo Venta con el objeto de tipo Producto
    Venta v = new Venta(p);

    // Calcular y mostrar el descuento aplicado y el precio final usando los métodos de la clase Venta
    System.out.println("El descuento aplicado es: $" + v.calcularDescuento());
    System.out.println("El precio final es: $" + v.calcularPrecioFinal());

    
    
  }
    }

