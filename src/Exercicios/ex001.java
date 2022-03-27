/*
1 - Codifique um programa usando Collection List em que:
a –Crie um Array, atribuindo os nomes de cinco pessoas;
b –Exiba na tela a:b1 –o Array com todos seus elementos;
b2 –elemento por elemento do Array.
 */
package Exercicios;
import java.util.ArrayList;
public class ex001 {
    public static void main(String[] args) {
        ArrayList<String> nomes= new ArrayList<>();
        nomes.add("Alfa");
        nomes.add("Beta");
        nomes.add("Delta");
        nomes.add("Omega");
        nomes.add("Sheila");
        System.out.println("Lista de nomes " + nomes);
        for (int i=0; i< nomes.size(); i++){
            System.out.println( "Nome "+ (i+1) +" " + nomes.get(i));
        }
    }
}