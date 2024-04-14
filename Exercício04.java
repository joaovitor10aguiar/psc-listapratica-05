/* Ex 04 - Faça um programa que receba dez idades, pesos e alturas, calcule e mostre: 
a média das idades das dez pessoas;
a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e 
a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m. 
*/

 import java.util.Scanner;

 public class Exercício04 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int pessoasPesoAltura = 0;
         int pessoasIdade10a30Altura190 = 0;
         int totalPessoas = 10;
         int somaIdades = 0; 
         
         for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            somaIdades += idade;
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            
            if (peso > 90 && altura < 1.50) {
                pessoasPesoAltura++;
            }
            
            if (idade >= 10 && idade <= 30 && altura > 1.90) {
                pessoasIdade10a30Altura190++;
            }
        }
        
        double mediaIdades = (double) somaIdades / totalPessoas;
        double porcentagemIdade10a30Altura190 = (double) pessoasIdade10a30Altura190 / totalPessoas * 100;
        
        System.out.println("Média das idades das dez pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + pessoasPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagemIdade10a30Altura190 + "%");
        
        scanner.close();
    }
}