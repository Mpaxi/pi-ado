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
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       Integer numero1;
       System.out.println("Digite um numero inteiro");
       numero1 = leitor.nextInt();
       
       System.out.println("Primeiro Multiplo: 0");
       System.out.println("Primeiro Multiplo: " + numero1);
       System.out.println("Primeiro Multiplo: " + (numero1*2));
    }
    
}
