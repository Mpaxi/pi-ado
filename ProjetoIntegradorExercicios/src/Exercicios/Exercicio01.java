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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       float numero1, numero2, numero3;
       System.out.println("Digito o primeiro numero");
       numero1 = leitor.nextFloat();
       
       System.out.println("Digito o primeiro segundo");
       numero2 = leitor.nextFloat();
       
       System.out.println("Digito o primeiro terceiro");
       numero3 = leitor.nextFloat();
       
       System.out.println("Produto: " + (numero1*numero2*numero2));
    }
    
}
