package br.dev.felipeassis.estruturadados.pilha.aulas;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 11; i++)
            pilha.empilha(i);

        System.out.println(pilha.toString());
        System.out.println(pilha.tamanho());
    }
}
