/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import ejercicio12.Person;
import ejercicio12.UsuarioPerson;

/**
 *
 * @author Juan
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioPerson up = new UsuarioPerson();
        Person n1 = up.UsuarioPerson();
        
        up.crearPersona(n1);
        up.calcularEdad(n1);
        up.menorQue(n1);
        up.mostrarPersona(n1);
    }
}
