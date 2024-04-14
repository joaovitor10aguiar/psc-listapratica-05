/*Ex 01 -Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. 
Finalize digitando idade igual a zero.
*/

import java.util.Scanner;

    public class arquivo {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int idade;
            int somaIdades = 0;
            int contador = 0;

            System.out.println("Digite as idades: ");

            do { 
                System.out.print("Idade: ");
                idade = scanner.nextInt();

                if(idade > 0){
                somaIdades += idade;
                contador++;
                }

             } while (idade > 0); 

            double mediaIdades = somaIdades / contador;

             System.out.println("A média das idades inseridas é: " + mediaIdades);

             scanner.close();
                       
        }
    }