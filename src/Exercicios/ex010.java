/*
10 –Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado o primeiro nome de cinco pessoas;
b –Use a classe Scanner para a entrada dos dados;
c –Após todos os nomes armazenados na lista, exiba-os na tela usando o comando for
*/
package Exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class ex010 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Primeiro nome: ");
            String a = leia.nextLine();
            nome.add(a);
        }
        for (int j=0;j< nome.size();j++){
            System.out.println("Nome "+ (j+1)+": " +nome.get(j));
        }
    }
}