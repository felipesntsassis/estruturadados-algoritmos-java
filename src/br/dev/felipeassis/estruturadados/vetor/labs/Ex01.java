package br.dev.felipeassis.estruturadados.vetor.labs;

import br.dev.felipeassis.estruturadados.vetor.Lista;

public class Ex01 {

    public static void main(String[] args) {
        Lista<String> novaLista = new Lista<>(5);
        novaLista.adiciona("A");
        novaLista.adiciona("B");
        novaLista.adiciona("C");

        System.out.println(novaLista.contem("A"));
        System.out.println(novaLista.contem("B"));
        System.out.println(novaLista.contem("E"));
    }
}
