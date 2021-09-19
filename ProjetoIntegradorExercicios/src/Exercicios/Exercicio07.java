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
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       Integer ano;
       
       System.out.println("Digito o ano");
       ano = leitor.nextInt();
       
       if((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
          System.out.println("Ano é bissexto"); 
       }
       else{
          System.out.println("Ano não é bissexto");  
       }
    }
    
}
