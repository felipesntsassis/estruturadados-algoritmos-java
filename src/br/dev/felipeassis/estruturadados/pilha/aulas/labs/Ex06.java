package br.dev.felipeassis.estruturadados.pilha.aulas.labs;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

public class Ex06 {

    public static final String ABRE = "([{";
    public static final String FECHA = ")]}";

    public static void main(String[] args) {
        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}[](){}{()}");
        imprimeResultado("{[(]}[](){}{()}");
        imprimeResultado("A + B + C - D)");
    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balançeado(a)? " + verificaSimbolosBalanceados(expressao));
    }

    public static boolean verificaSimbolosBalanceados(String expressao) {
        Pilha<Character> pilha = new Pilha<>();
        int i = 0;
        char simbolo, topo;

        while(i < expressao.length()) {
            simbolo = expressao.charAt(i);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            i ++;
        }

        return true;
    }

}
