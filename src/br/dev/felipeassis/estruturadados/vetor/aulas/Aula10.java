package br.dev.felipeassis.estruturadados.vetor.aulas;

import br.dev.felipeassis.estruturadados.vetor.Contato;
import br.dev.felipeassis.estruturadados.vetor.VetorDeObjetos;

public class Aula10 {

    public static void main(String[] args) {
        VetorDeObjetos vetor = new VetorDeObjetos(3);

        Contato c1 = new Contato("Contato 1", "(14)99659-4635", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "(14)99874-1234", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "(14)12345-5687", "contato3@gmail.com");
        Contato c4 = new Contato("Contato 4", "(14)12345-5687", "contato4@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        int pos = vetor.busca(c4);

        if (pos >= 0)
            System.out.println("Elemento existe no vetor!");
        else
            System.out.println("Elemento não existe no vetor!");

        System.out.println(vetor);
    }
}
