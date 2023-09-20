package br.dev.felipeassis.estruturadados.vetor.labs;

import br.dev.felipeassis.estruturadados.vetor.Lista;

public class Ex03 {

    public static void main(String[] args) throws IllegalAccessException {
        Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);
        lista.remove("A");
        System.out.println(lista);
        lista.remove("C");
        System.out.println(lista);
        lista.remove("E");
        System.out.println(lista);
    }
}
