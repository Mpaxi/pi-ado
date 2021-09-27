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
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer numero1;
        double numero2, numero3;

        System.out.println("Digite o seu codigo");
        numero1 = entrada.nextInt();

        System.out.println("Digite suas horas trabalhadas");
        numero2 = entrada.nextDouble();

        System.out.println("Digite seu valor por hora");
        numero3 = entrada.nextDouble();

        System.out.println("Ola " + numero1 + ", seu salario é: R$ " + (numero2 * numero3));
    }

}
