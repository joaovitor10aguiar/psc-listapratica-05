/* Ex 05 - Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. 
Para isso, forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se que foram entrevistadas dez pessoas. 
Faça um programa que calcule e mostre: o número de pessoas que responderam sim;
o número de pessoas que responderam não; o número de mulheres que responderam sim; e
a percentagem de homens que responderam não, entre todos os homens analisados
*/

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalEntrevistados = 10;
        int sim = 0;
        int nao = 0;
        int mulheresSim = 0;
        int homens = 0;
        int homensNao = 0;
        
        for (int i = 1; i <= totalEntrevistados; i++) {
            System.out.println("Entrevistado " + i + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            
            System.out.print("Resposta (S/N): ");
            char resposta = scanner.next().charAt(0);
            
            if (resposta == 'S') {
                sim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else if (resposta == 'N') {
                nao++;
                if (sexo == 'M') {
                    homens++;
                    homensNao++;
                }
            }
        }
        
        double porcentagemHomensNao = (double) homensNao / homens * 100;
        
        System.out.println("Número de pessoas que responderam sim: " + sim);
        System.out.println("Número de pessoas que responderam não: " + nao);
        System.out.println("Número de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Percentagem de homens que responderam não: " + porcentagemHomensNao + "%");
        
        scanner.close();
    }
}
