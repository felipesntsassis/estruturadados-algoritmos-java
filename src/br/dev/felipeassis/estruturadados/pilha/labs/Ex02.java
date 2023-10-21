package br.dev.felipeassis.estruturadados.pilha.labs;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Pilha<Integer> pares = new Pilha<>();
        Pilha<Integer> impares = new Pilha<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("Entre com um número:");
            int numero = scan.nextInt();

            if (numero == 0) {
                Integer desempilhado = pares.desempilha();

                if (desempilhado == null) {
                    System.err.println("Pilha \"pares\" vazia!");
                } else {
                    System.out.println("Desempilhando da linha par " + desempilhado);
                }

                desempilhado = impares.desempilha();

                if (desempilhado == null) {
                    System.err.println("Pilha \"ímpares\" vazia!");
                } else {
                    System.out.println("Desempilhando da linha ímpar " + desempilhado);
                }
            } else if (numero % 2 == 0) {
                System.out.println("Número par. Empilhando na pilha \"pares\"");
                pares.empilha(numero);
            } else {
                System.out.println("Número ímpar. Empilhando na pilha \"ímpares\"");
                impares.empilha(numero);
            }
        }

        System.out.println("Desempilhando todos os elementos da lista \"pares\"");

        while(!pares.estaVazia()) {
            System.out.println("Desempilhando da pilha \"pares\": " + pares.desempilha());
        }
        while(!impares.estaVazia()) {
            System.out.println("Desempilhando da pilha \"ímpares\": " + impares.desempilha());
        }
    }

}
