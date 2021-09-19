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
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer resposta;

        System.out.println("Cache e um tipo de : ");
        System.out.println("1 - Memoria");
        System.out.println("2 - Periferico");
        System.out.println("3 - Celula Cerebral");
        System.out.println("4 - Pagamento por serviço");
        System.out.println("5 - N/A");

        resposta = leitor.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Resposta correta");
                break;           
            default:
                System.out.println("Respota Incorreta");
                break;

        }
    }

}
