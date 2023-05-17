package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        Scanner sc = new Scanner(System.in);

// Declarar variables para almacenar los datos del empleado y el porcentaje de aumento
        String nombre;
        double salario;
        int edad;
        double porcentaje;

// Declarar una variable para almacenar la opción elegida por el usuario
        int opcion;

// Mostrar el menú mientras el usuario no elija salir
        do {
            // Mostrar las opciones disponibles
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");

            // Pedir al usuario ingresar una opción
            System.out.println("Ingrese una opción:");
            opcion = sc.nextInt(); // Leer la opción como un entero

            // Ejecutar el código correspondiente a la opción elegida
            switch (opcion) {
                case 1:
                    // Agregar un empleado
                    // Pedir al usuario ingresar el nombre, el salario y la edad del empleado
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = sc.next(); // Leer el nombre como una cadena de caracteres
                    System.out.println("Ingrese el salario del empleado:");
                    salario = sc.nextDouble(); // Leer el salario como un número decimal
                    System.out.println("Ingrese la edad del empleado:");
                    edad = sc.nextInt(); // Leer la edad como un entero

                    // Crear un objeto de tipo Empleado con los datos ingresados
                    Empleado e = new Empleado(nombre, salario, edad);

                    // Agregar el objeto a la lista de empleados
                    listaEmpleados.add(e);

                    // Mostrar un mensaje de confirmación
                    System.out.println("Empleado agregado correctamente.");
                    break;

                case 2:
                    // Mostrar información de los empleados
                    // Verificar si la lista está vacía
                    if (listaEmpleados.isEmpty()) {
                        // Mostrar un mensaje indicando que no hay empleados registrados
                        System.out.println("No hay empleados registrados.");
                    } else {
                        // Recorrer la lista con un bucle for-each y mostrar la información de cada empleado usando el método mostrarInformacion
                        for (Empleado emp : listaEmpleados) {
                            emp.mostrarInformacion();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    // Calcular aumento de salario
                    // Verificar si la lista está vacía
                    if (listaEmpleados.isEmpty()) {
                        // Mostrar un mensaje indicando que no hay empleados registrados
                        System.out.println("No hay empleados registrados.");
                    } else {
                        // Pedir al usuario ingresar un porcentaje de aumento salarial
                        System.out.println("Ingrese el porcentaje de aumento salarial:");
                        porcentaje = sc.nextDouble(); // Leer el porcentaje como un número decimal

                        // Calcular el salario promedio de todos los empleados usando un bucle for-each y una variable acumuladora
                        double sumaSalarios = 0; // Variable para acumular la suma de los salarios
                        for (Empleado emp : listaEmpleados) {
                            sumaSalarios += emp.getSalario(); // Sumar el salario del empleado actual a la variable acumuladora
                        }
                        double promedioSalarios = sumaSalarios / listaEmpleados.size(); // Calcular el promedio dividiendo la suma por el tamaño de la lista

                        // Recorrer la lista con otro bucle for-each y aplicar el aumento correspondiente a cada empleado cuyo salario sea menor al promedio usando el método setSalario y mostrar en pantalla el nuevo salario
                        for (Empleado emp : listaEmpleados) {
                            if (emp.getSalario() < promedioSalarios) {
                                // Aplicar el aumento al salario del empleado actual multiplicando por (1 + porcentaje / 100) y redondeando a dos decimales usando Math.round
                                double nuevoSalario = Math.round(emp.getSalario() * (1 + porcentaje / 100) * 100) / 100.0;
                                emp.setSalario(nuevoSalario); // Asignar el nuevo salario al empleado usando el método setSalario

                                // Mostrar en pantalla el nombre y el nuevo salario del empleado usando el método getNombre y getSalario
                                System.out.println("El nuevo salario de " + emp.getNombre() + " es: $" + emp.getSalario());
                            }
                        }
                    }
                    break;

                case 4:
                    // Salir del programa
                    // Mostrar un mensaje de despedida
                    System.out.println("Gracias por usar este programa.");
                    break;

                default:
                    // Opción inválida
                    // Mostrar un mensaje indicando que la opción ingresada no es válida
                    System.out.println("Opción inválida. Por favor ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4); // Repetir mientras la opción no sea salir


   

    }
}
