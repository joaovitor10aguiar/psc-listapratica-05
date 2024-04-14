/* Ex 02 - Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. 
Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo 
aquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. 
Faça um programa que: leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal. Para encerrar a entrada de dados, digite o número do canal ZERO.
 */

 import java.util.Scanner;

 public class Exercicio02 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int[] canais = {4, 5, 7, 12};
         int[] audiencia = new int[canais.length];
         int totalPessoas = 0;
         
         while (true) {
             System.out.print("Digite o número do canal (ou 0 para encerrar): ");
             int canal = scanner.nextInt();
             
             if (canal == 0) {
                 break;
             }
             
             if (!contains(canais, canal)) {
                 System.out.println("Canal inválido. Por favor, digite novamente.");
                 continue;
             }
             
             System.out.print("Digite o número de pessoas assistindo: ");
             int pessoasAssistindo = scanner.nextInt();
             
             audiencia[getIndex(canais, canal)] += pessoasAssistindo;
             totalPessoas += pessoasAssistindo;
         }
         
         if (totalPessoas == 0) {
             System.out.println("Nenhuma casa foi registrada na pesquisa.");
             return;
         }
         
         System.out.println("Porcentagem de audiência de cada canal:");
         for (int i = 0; i < canais.length; i++) {
             double porcentagem = (double) audiencia[i] / totalPessoas * 100;
             System.out.printf("Canal %d: %.2f%%\n", canais[i], porcentagem);
         }
         
         scanner.close();
     }
     
     // Verifica se o canal está presente no array
     public static boolean contains(int[] array, int key) {
         for (int i : array) {
             if (i == key) {
                 return true;
             }
         }
         return false;
     }
     
     // Retorna o índice do canal no array
     public static int getIndex(int[] array, int key) {
         for (int i = 0; i < array.length; i++) {
             if (array[i] == key) {
                 return i;
             }
         }
         return -1; // Não encontrado
     }
 }
 