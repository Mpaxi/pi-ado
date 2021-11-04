/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author muril
 */
public class prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int x = 27, y = 17, aux;
//        if (x % y == 0) {
//            x++;
//            if ((x % 2 != 0) || (y < x)) {
//                y = x * y;
//            }
//        } else {
//            aux = x;
//            x = y;
//            y = aux;
//        }

//        int a = 0, b = 0, n = 44;
//
//        while (n > 0) {
//            if ((n % 2) == 0) {
//                a = a + 1;
//            } else {
//                b = b + 1;
//            }
//
//            n = n / 2;
//        }
//        int n = 5, a = 0, b = 1, c = b;
//        
//        for(b =1; b <=n; b++){
//            for(c =b; c<=n; c++){
//                a = a+1;
//            }
//        }
        int i = 1, s = 1, n = 7;
        while (i <= n) {
            s = s * i;
            i++;
        }

        System.out.println("s " + s);

    }

}
