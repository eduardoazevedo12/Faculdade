/*
2 - Codifique um programa usando Collection Set em que:
a –seja informado via teclado com uso da classe Scanner cinco nomes de frutas em uma coleção;
b –exiba na tela a:
b1 –os elementos os elementos da coleção;
b1 –mensagem informando se foram informados nomes repetidos ou não na coleção.

13 –Quais as características da interface Set?
Resposta:
Velocidade na pesquisa de dados, sendo mais rápida que um objeto do tipo List;
A inserção de dados é mais lenta;
Permite trabalhar com conjuntos e pode ser implementado como instâncias das classes HashSet ou TreeSet;
Não precisa especificar a posição para adicionar um elemento;
Não aceita valores duplicados. Se caso inserir um registro que já tenha no Set não será adicionado.
Podem ser implementados como instâncias das classes HashSet ou TreeSet;

*/
package Exercicios;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class ex002ex013 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        Set<String> frutas= new HashSet<>();
        for(int i=0;i<5;i++) {
            System.out.print("Fruta " +(i+1)+ " : ");
            String a = leia.nextLine();
            frutas.add(a);
        }
        System.out.println("Frutas: "+frutas);
        if (frutas.size()<5){
            System.out.printf("Foram informadas frutas repetidas!");
        }
        else {
            System.out.printf("Não foram informadas frutas repetidas!");
        }
    }
}
