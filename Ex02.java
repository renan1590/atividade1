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
public class Ex02 {


    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        double salario,salario2 = 0, aumento = 0;
        int perc = 0;

        System.out.print("Digite o valor do seu salário: ");
        salario = entrada.nextDouble();

        if(salario <= 280) {
            aumento = salario * 0.20;
            salario2 = salario + aumento;
            perc = 20;
        }else if (salario > 280 && salario <= 700) {
            aumento = salario * 0.15;
            salario2 = salario + aumento;
            perc = 15;
        }else if (salario > 700 && salario <= 1500) {
            aumento = salario * 0.10;
            salario2 = salario + aumento;
            perc = 10;
        }else if (salario > 1500) {
            aumento = salario * 0.05;
            salario2 = salario + aumento;
            perc = 5;
        }
        
        System.out.println("Seu salário antes do reajuste era: R$" + salario);
        System.out.println("Tendo um percentual de aumento de: " + perc + "%");
        System.out.println("O aumento foi de: R$" + aumento);
        System.out.println("Seu salário passou a ser: R$ "+ salario2);

        entrada.close();
    }
}
