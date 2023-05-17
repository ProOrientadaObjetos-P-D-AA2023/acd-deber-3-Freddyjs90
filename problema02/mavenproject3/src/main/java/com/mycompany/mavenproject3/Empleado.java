
package com.mycompany.mavenproject3;

import java.util.ArrayList;

public class Empleado {
  // Atributos
  private String nombre;
  private double salario;
  private int edad;

  // Constructor
  public Empleado(String nombre, double salario, int edad) {
    this.nombre = nombre;
    this.salario = salario;
    this.edad = edad;
  }

  // Métodos getter y setter para acceder y modificar los atributos
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  // Método para mostrar la información del empleado
  public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Salario: $" + salario);
    System.out.println("Edad: " + edad);
    
    // Crear una lista de objetos de tipo Empleado
ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
  }
}
