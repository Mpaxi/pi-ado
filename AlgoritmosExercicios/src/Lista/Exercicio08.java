/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

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
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, numero3, numero4;

        System.out.println("Digite o primeiro numero");
        numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero");
        numero2 = entrada.nextDouble();

        System.out.println("Digite o terceiro numero");
        numero3 = entrada.nextDouble();

        System.out.println("Digite o quarto numero");
        numero4 = entrada.nextDouble();
        
        System.out.println("Resultado: " + (numero1+numero2+numero3+numero4) / 4);
    }

}
