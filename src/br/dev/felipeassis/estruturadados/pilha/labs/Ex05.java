package br.dev.felipeassis.estruturadados.pilha.labs;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

public class Ex05 {

    public static void main(String[] args) {
        imprimeResultado("ada");
        imprimeResultado("abcd");
        imprimeResultado("abccba");
        imprimeResultado("maria");
    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é um palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>();
        // ADA
        // [A]
        // [D]
        // [A]

        for (int i = 0; i < palavra.length(); i ++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";

        while(!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

}
