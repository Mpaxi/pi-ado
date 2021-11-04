/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author muril
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String resposta;
        Boolean sair = true;
        Integer AAA = 1;

        System.out.println("Cache e um tipo de : ");
        
        ArrayList<String> mylist = new ArrayList<String>();
        
        mylist.add("Memoria");
        mylist.add("Periferico");
        mylist.add("Celula Cerebral");
        mylist.add("Pagamento por serviço");
        mylist.add("N/A");

        do {

            Collections.shuffle(mylist);
                       
            for (int i = 0; i < mylist.size(); i++) {
                switch (i) {
                    case 0:
                        System.out.println("A - " + mylist.get(i));
                        break;
                    case 1:
                        System.out.println("B - " + mylist.get(i));
                        break;
                    case 2:
                        System.out.println("C - " + mylist.get(i));
                        break;
                    case 3:
                        System.out.println("D - " + mylist.get(i));
                        break;
                    case 4:
                        System.out.println("E - " + mylist.get(i));
                        break;
                }

            }

            resposta = leitor.next();
            Integer index = 0;

            switch (resposta.toLowerCase()) {

                case "a":
                    index = 0;
                    break;
                case "b":
                    index = 1;
                    break;
                case "c":
                    index = 2;
                    break;
                case "d":
                    index = 3;
                    break;
                case "e":
                    index = 4;
                    break;
            }
            
            if(mylist.get(index).equals("Memoria")){
               System.out.println("Resposta Correta");
               sair = false;
            }else{
                System.out.println("Resposta incorreta");
            }

        } while (sair);
    }

}
