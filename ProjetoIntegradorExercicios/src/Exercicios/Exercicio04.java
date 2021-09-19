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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       String nome;
       System.out.println("Digite um numero inteiro");
       nome = leitor.next();
       
       System.out.println("Quantidade de letras é: " + nome.trim().length());
    }
    
}
