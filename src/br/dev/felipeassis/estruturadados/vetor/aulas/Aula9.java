package br.dev.felipeassis.estruturadados.vetor.aulas;

import br.dev.felipeassis.estruturadados.vetor.Vetor;

public class Aula9 {

    public static void main(String[] args) throws IllegalAccessException {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
        vetor.remove(1);
        System.out.println(vetor);

        int pos = vetor.busca("E");

        if (pos >= 0)
            vetor.remove(vetor.busca("E"));
        else
            System.out.println("Elemento \"E\" não existe no Vetor");

        System.out.println(vetor);
    }
}
