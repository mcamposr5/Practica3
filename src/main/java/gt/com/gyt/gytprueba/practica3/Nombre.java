/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.gyt.gytprueba.practica3;

/**
 *
 * @author lunit
 */
public class Nombre {
    public String play(int numero) {

        if (numero == 0) throw new IllegalArgumentException("El numero es 0");
        if (numero % 3 == 0) return "Bing";
        if (numero % 5 == 0) return "Bang";


        return String.valueOf(numero);
    }
}
