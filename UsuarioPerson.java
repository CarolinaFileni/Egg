/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class UsuarioPerson {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Person UsuarioPerson() {
        Person p1 = new Person();
        return p1;
    }

    public void crearPersona(Person p1) {
        //Pedimos nombre y lo ingresamos con Scanner
        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.next());

        //Pedimos fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento: ");

        System.out.println("Día (DD): ");
        int dia = leer.nextInt();
        System.out.println("Mes (MM):");
        int mes = leer.nextInt();
        System.out.println("Año (AAAA): ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setFecha(fecha);
        System.out.println("Fecha de nacimiento: " + fecha);
    }

    public void calcularEdad(Person p1) {
        Date fechaActual = new Date();
        int edad = (fechaActual.getYear() - p1.getFecha().getYear());
        System.out.println("Su edad es de: " + edad);
    }

    public void menorQue(Person p1) {
        boolean dato;
        System.out.println("Ingrese una edad para determinar si es menor: ");
        System.out.println("Día (DD): ");
        int dia = leer.nextInt();
        System.out.println("Mes (MM):");
        int mes = leer.nextInt();
        System.out.println("Año (AAAA): ");
        int anio = leer.nextInt();
        Date edad1 = new Date(anio - 1900, mes - 1, dia);

        if (edad1.getYear() - p1.getFecha().getYear() < p1.getFecha().getYear()) {
            dato = true;
        } else {
            dato = false;
        }
        
    System.out.println(dato);
    }

    public void mostrarPersona(Person p1) {
        System.out.println("Los datos de la persona son los siguientes: ");
        System.out.println(p1.toString());
    }
}
