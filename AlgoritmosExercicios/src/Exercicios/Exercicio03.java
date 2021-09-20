/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author muril
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numero1, numero2, massa;

        System.out.println("Digite seu peso");
        numero1 = leitor.nextDouble();

        System.out.println("Digite sua altura");
        numero2 = leitor.nextDouble();

        massa = (numero1 / Math.pow(numero2, 2));

        if (massa < 26) {
            System.out.println("Grau de obesidade Normal.");
        } else if (massa >= 26 && massa <= 30) {
            System.out.println("Grau de obesidade, Oberso. ");
        } else {
            System.out.println("Obesidade Morbida");

        }

        leitor.close();

    }

}
