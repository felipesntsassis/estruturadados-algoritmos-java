package br.dev.felipeassis.estruturadados.pilha.aulas;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        System.out.println(pilha.topo());
        System.out.println(pilha);
        pilha.empilha(1);
        pilha.empilha(2);
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }

}