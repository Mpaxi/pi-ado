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
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer resposta;
        Boolean sair = true;

        System.out.println("MENU");
        System.out.println("1 – Instruções");
        System.out.println("2 – Jogar");
        System.out.println("3 – Créditos");
        System.out.println("4 – Sair");

        do {
            resposta = leitor.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Entrei em Instruções");
                    break;
                case 2:
                    System.out.println("Entrei em Jogar");
                    break;
                case 3:
                    System.out.println("Entrei em Créditos");
                    break;
                case 4:
                    System.out.println("Entrei em Sair");
                    sair = false;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        } while (sair);
    }
}
