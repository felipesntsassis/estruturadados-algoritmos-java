package br.dev.felipeassis.estruturadados.vetor.aulas;

import br.dev.felipeassis.estruturadados.vetor.Vetor;

public class Aula5 {

    public static void main(String[] args) throws IllegalAccessException {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.busca(2));
    }

}
