/*
11 –Codifique um programa usando Collection QUEUE em que:
a –atribua via programa os nomes de dez frutas em uma coleção;
b –exiba os dados inseridos na coleção.

12 -Codifique um programa usando Collection QUEUE em que:
a –atribua via programa os números 100, 150 e 200 em uma coleção;
b –exiba os números inseridos na coleção.
 */
package Exercicios;
import java.util.Queue;
import java.util.LinkedList;
public class ex011ex012 {
    public static void main(String[] args) {
       //ex011
        Queue<String> frutas = new LinkedList<>();
        frutas.add("Uva");
        frutas.add("Maça");
        frutas.add("Pera");
        frutas.add("Melância");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Caqui");
        frutas.add("Melão");
        frutas.add("Abacate");
        System.out.println("Coleção de frutas: "+frutas);

        //ex012
        Queue<Integer> num= new LinkedList<>();
        num.add(100);
        num.add(150);
        num.add(200);
        System.out.println("Coleção de números: "+num);

    }
}
