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
        Scanner entrada = new Scanner(System.in);
        double kWh;
        
        System.out.println("Digite o valor da conta de energia");
        kWh = entrada.nextDouble();

        if (kWh < 150 && kWh > 0) {
            System.out.println("O valor da conta é: R$ " + (kWh * 0.20));
        } else if (kWh >= 150 && kWh < 500) {
            System.out.println("O valor da conta é: R$ " + (kWh * 0.25));
        } else if (kWh >= 500) {
            System.out.println("O valor da conta é: R$ " + (kWh * 0.30));
        } else {
            System.out.println("O valor da conta é R$ 11.90");

        }
    }

}
