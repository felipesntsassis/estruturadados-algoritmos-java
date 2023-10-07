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
                System.out.println("Empilhando número " + numero);
                pilha.empilha(numero);
            } else {
                if (pilha.estaVazia()) {
                    System.out.println("A pilha está vazia!");
                } else {
                    System.out.println("Desempilhando número " + pilha.desempilha());
                }
            }
        }

        System.out.println("Todos os números foram lidos. Desempilhando números da pilha");
        while(!pilha.estaVazia()) {
            Integer desempilhado = pilha.desempilha();

            if (desempilhado == null) {
                System.out.println("A pilha está vazia!");
            } else {
                System.out.println("Desempilhando número " + pilha.desempilha());
            }
        }

        System.out.println("Todos os elementos foram desempilhados!");
    }

}
