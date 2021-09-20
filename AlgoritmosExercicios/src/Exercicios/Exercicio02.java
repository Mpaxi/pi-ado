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
        Integer numero1, numero2;

        System.out.println("Digite o primeiro numero");
        numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero");
        numero2 = leitor.nextInt();

        if (numero2 > 0) {
            if ((numero1 % numero2) == 0) {
                System.out.println("A Divisão do Numero ( " + numero1 + " ) por ( " + numero2 + " ) é exata");
            } else {
                System.out.println("A Divisão do Numero ( " + numero1 + " ) por ( " + numero2 + " ) não é exata");
            }
        }else{
            System.out.println("Divisor precisar ser maior que 0");
        }

    }

}
