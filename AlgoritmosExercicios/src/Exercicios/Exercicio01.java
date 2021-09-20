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
       Integer numero;
       
       System.out.println("Digite o numero");
       numero = leitor.nextInt();
       
       if(numero > 100){
           System.out.println(numero + 150);
       }else{
           System.out.println(numero);
       }
    }
    
}
