/*
6 – Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado cinco números tipo inteiros;
b –Use a classe Scanner para a entrada dos dados;
c –Após todos os números armazenados na lista, exiba-os na tela

7 – Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado cinco números tipo inteiros;
b –Use a classe Scanner para a entrada dos dados;
c –Após todos os números armazenados na lista, exiba-os na tela usando ocomando for-each

8 – Codifique um programa em java que:
a –Crie uma Lista, atribuindo via teclado cinco números tipo inteiros;
b –Use a classe Scannerpara a entrada dos dados;
c –Após todos os números armazenados na lista, exiba-os na tela usando o comando for
*/

package Exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class ex006ex007ex008 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        ArrayList<Integer> lista=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Digite o "+ (i+1)+ "º valor inteiro: ");
            int n= leia.nextInt();
            lista.add(n);
        }
        //ex6.c Exibindo valores armazenados na tela
        System.out.println("Valores digitados:  "+lista);

        //ex7.c Exibindo valores armazenados na tela com for-each
        System.out.print("Saída com for-each: ");
        for (int valores:lista) {
            System.out.print(valores+ "  ");
        }
        System.out.println();// só pra pular uma linha
        //ex8.c Exibindo valores armazenados na tela com for
        System.out.println("Saida com for: ");
        for (int j=0;j<lista.size();j++){
            System.out.println("Valor "+(j+1)+ " digitado: "+lista.get(j));
        }
    }
}
