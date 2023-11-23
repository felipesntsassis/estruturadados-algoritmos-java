package br.dev.felipeassis.estruturadados.fila.labs;

import br.dev.felipeassis.estruturadados.fila.Fila;

public class Ex02 {

    public static void main(String[] args) throws IllegalAccessException {
        Fila<String> regular = new Fila<>();
        Fila<String> prioritaria = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileirar("Pessoa 1");
        regular.enfileirar("Pessoa 2");
        regular.enfileirar("Pessoa 3");
        prioritaria.enfileirar("Pessoa 1P");
        prioritaria.enfileirar("Pessoa 2P");
        prioritaria.enfileirar("Pessoa 3P");
        regular.enfileirar("Pessoa 4");
        regular.enfileirar("Pessoa 5");
        regular.enfileirar("Pessoa 6");
        regular.enfileirar("Pessoa 7");
        regular.enfileirar("Pessoa 8");

        while(!regular.estaVazia() | !prioritaria.estaVazia()) {
            int count = 0;

            while(!prioritaria.estaVazia() && count < MAX_PRIORIDADE) {
                atenderPessoa(prioritaria);
                count ++;
            }

            if (prioritaria.estaVazia()) {
                while(!regular.estaVazia()) {
                    atenderPessoa(regular);
                }
            }
        }
    }

    public static void atenderPessoa(Fila<String> fila) throws IllegalAccessException {
        String pessoaAtendida = fila.desenfileirar();
        System.out.printf("%s foi atendida.%n", pessoaAtendida);
    }

}
