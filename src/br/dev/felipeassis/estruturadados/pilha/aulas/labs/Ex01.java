package br.dev.felipeassis.estruturadados.pilha.aulas.labs;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("Entre com um número:");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhand12o número " + numero);
                pilha.empilha(numero);
            } else {
                if (pilha.estaVazia()) {
                    System.out.println("A pilha está vazia!");
                } else {
                    System.out.println("Desempilhando número " + pilha.desempilha());
                }
            }
        }

        if (!pilha.estaVazia()) {
            System.out.println(pilha);
        }
    }

}
