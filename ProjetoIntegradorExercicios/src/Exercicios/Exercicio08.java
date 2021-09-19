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
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       Integer semana;
       
       System.out.println("Digite o numero da semana");
       semana = leitor.nextInt();
       
       switch(semana){
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Segunda");
               break;
           case 3:
               System.out.println("Terça");
               break;
           case 4:
               System.out.println("Quarta");
               break;
           case 5:
               System.out.println("Quinta");
               break;
           case 6:
               System.out.println("Sexta");
               break;
           case 7:
               System.out.println("Sabado");
               break;
           default:
               System.out.println("Valor invalido");
               break;
               
       }
    }
}
