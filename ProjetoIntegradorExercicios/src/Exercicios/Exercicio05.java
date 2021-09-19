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
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       double numero1;
       System.out.println("Digite o valor da compra");
       numero1 = leitor.nextDouble();
       
       if(numero1 >= 300d){
           System.out.println("O valor do desconto é: " + (numero1 * 0.30d) + " e o percentual aplicado de desconto é: 30%");
       }else{
           System.out.println("O valor do desconto é: " + (numero1 * 0.15d) + " e o percentual aplicado de desconto é: 15%");
       }
    }
    
}
