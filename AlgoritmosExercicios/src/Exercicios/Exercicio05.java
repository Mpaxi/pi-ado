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
        Scanner entrada = new Scanner(System.in);
        Integer enumerador;
        
        System.out.println("Digite a ser calculado");
        enumerador = entrada.nextInt();
        
        for(int i = 0; i < 11; i++){
            System.out.println(enumerador + " X " + i + " = " + (i*enumerador));
        }
    }
    
}
