/*
4 - Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado o primeiro nome de cinco pessoas;
b –Use a classe Scannerpara a entrada dos dados.

5 – Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado o primeiro nome de cinco pessoas;
b –Use a classe Scanner para a entrada dos dados;
c –Após todos os nomes armazenados na lista, exiba-os na tela

9 – Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado o primeiro nome de cinco pessoas;
b –Use a classe Scanner para a entrada dos dados;
c –Após todos os nomes armazenados na lista, exiba-os na tela usando o comando for-each.

*/
package Exercicios;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class ex004ex005ex009 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<String> nome = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Primeiro nome: ");
            String a = leia.nextLine();
            nome.add(a);
        }
        //Saída com for-each ex009
        System.out.println("Nomes digitados: ");
        for (String nomes : nome) {
            System.out.print(nomes+" ");
        }
    }
}