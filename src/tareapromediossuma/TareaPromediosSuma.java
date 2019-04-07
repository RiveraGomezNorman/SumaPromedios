/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapromediossuma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NORMAN
 */
public class TareaPromediosSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerosIngresar = 0;
        System.out.println("Introducir numeros a promediar, presione 0 para terminar de ingresar numeros");
        Scanner reader = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        do {
            numerosIngresar = reader.nextInt();
            lista.add(numerosIngresar);
        } while (numerosIngresar != 0);
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }

        System.out.println("La suma de los números es " + suma);
    }

}
