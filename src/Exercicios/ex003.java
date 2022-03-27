/*
3 - Codifique um programa usando o comando for-each para listar os elementos de uma Lista:
Obs. Os elementos da lista deverão ser informados via teclado com uso da classe Scanner.
*/
package Exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class ex003 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + " : ");
            String a = leia.nextLine();
            elementos.add(a);
        }
            for (String elemento : elementos) {
                System.out.println(elemento);
        }
    }
}

