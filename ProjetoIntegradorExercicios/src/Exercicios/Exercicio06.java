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
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       Integer numero1, numero2, numero3;
       
       System.out.println("Digito o primeiro numero");
       numero1 = leitor.nextInt();
       
       System.out.println("Digito o segundo numero");
       numero2 = leitor.nextInt();
       
       System.out.println("Digito o terceiro numero");
       numero3 = leitor.nextInt();
       
       if((numero1 + numero2) >= numero3){
           System.out.println("É um triangulo");
           if(numero1 == numero2 && numero1 == numero3){
               System.out.println("o triângulo é equilátero");
           }else if(numero1 != numero2 && numero1 != numero3 && numero2 != numero3){
               System.out.println("o triângulo é escaleno");
           }else{
               System.out.println("o triângulo é isósceles");
           }           
       }else{
           System.out.println("Não é um triangulo");
       }
    }
    
}
