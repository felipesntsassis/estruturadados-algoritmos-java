package br.dev.felipeassis.estruturadados.vetor.labs;

import br.dev.felipeassis.estruturadados.vetor.Lista;

public class Ex04 {

    public static void main(String[] args) throws IllegalAccessException {
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);
        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }

}
