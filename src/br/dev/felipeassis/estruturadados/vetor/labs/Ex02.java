package br.dev.felipeassis.estruturadados.vetor.labs;

import br.dev.felipeassis.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Ex02 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> novaLista = new Lista<>(5);
        novaLista.adiciona("A");
        novaLista.adiciona("B");
        novaLista.adiciona("A");

        System.out.println(novaLista.ultimoIndice("A"));

    }

}
