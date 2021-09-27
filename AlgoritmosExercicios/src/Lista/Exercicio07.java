/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author muril
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Digite o primeiro numero");
        numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero");
        numero2 = entrada.nextDouble();

        System.out.println("Resultado ao quadrado: " + Math.sqrt((Math.pow(numero1, 2 + Math.pow(numero2, 2)))));
    }

}
