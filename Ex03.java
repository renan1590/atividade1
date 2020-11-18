/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nun = 0, cent = 0, cin = 0, dezen = 0, cinc = 0, unidade = 0, sobra;
        
        System.out.print("Digite valor 10 e 600: ");
        nun = scan.nextInt();
        
        if (nun >= 10 && nun <= 600) {
            if (nun > 99) {
                cent = nun / 100;
                sobra = nun % 100;
            } else {
                sobra = nun;
            }
            if (sobra > 49) {
                cin = sobra / 50;
                sobra = sobra % 50;
            }
            if (sobra > 9) {
                dezen = sobra / 10;
                sobra = sobra % 10;
            }
            if (sobra > 4) {
                cinc = sobra / 5;
                sobra = sobra % 5;
            }
            if (sobra > 0) {
                unidade = sobra;
            }

            System.out.println("notas de 100: " + cent);
            System.out.println("notas de 50: " + cin);
            System.out.println("notas de 10: " + dezen);
            System.out.println("notas de 5: " + cinc);
            System.out.println("notas de 1: " + unidade);

        } else {
            System.out.println("numero invalido");
        }
    }
}
