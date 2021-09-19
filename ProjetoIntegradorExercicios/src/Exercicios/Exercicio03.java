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
       Integer numero1;
       System.out.println("Digite um numero inteiro");
       numero1 = leitor.nextInt();

       System.out.println("1 x " + numero1 + ": " + (numero1));
       System.out.println("2 x " + numero1 + ": " + (numero1 * 2));
       System.out.println("3 x " + numero1 + ": " + (numero1 * 3));
       System.out.println("4 x " + numero1 + ": " + (numero1 * 4));
       System.out.println("5 x " + numero1 + ": " + (numero1 * 5));
       System.out.println("6 x " + numero1 + ": " + (numero1 * 6));
       System.out.println("7 x " + numero1 + ": " + (numero1 * 7));
       System.out.println("8 x " + numero1 + ": " + (numero1 * 8));
       System.out.println("9 x " + numero1 + ": " + (numero1 * 9));
       System.out.println("10 x " + numero1 + ": " + (numero1 * 10));
    }
    
}
