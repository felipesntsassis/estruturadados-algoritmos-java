package br.dev.felipeassis.estruturadados.vetor.aulas;

import br.dev.felipeassis.estruturadados.vetor.Contato;
import br.dev.felipeassis.estruturadados.vetor.Lista;
import br.dev.felipeassis.estruturadados.vetor.VetorDeObjetos;

public class Aula11 {

    public static void main(String[] args) {
        Lista<String> vetor = new Lista<String>(1);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");

        System.out.println(vetor);
    }

}
