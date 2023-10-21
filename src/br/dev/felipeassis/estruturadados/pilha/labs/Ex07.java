package br.dev.felipeassis.estruturadados.pilha.labs;

import java.util.Stack;

public class Ex07 {

    public static void main(String[] args) throws IllegalAccessException {
        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);

        imprimeResultadoQualquerBase(25, 16);
        imprimeResultadoQualquerBase(10035, 8);
        imprimeResultadoQualquerBase(10035, 16);
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }
        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }

        return numBinario;
    }

    public static String decimalQualquerBase(int numero, int base) throws IllegalAccessException {
        if (base >= 16) {
            throw new IllegalAccessException();
        }

        Stack<Integer> pilha = new Stack<>();
        StringBuilder numBase = new StringBuilder();
        String bases = "0123456789ABCDEF";
        int resto;

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }
        while (!pilha.isEmpty()) {
            numBase.append(bases.charAt(pilha.pop()));
        }

        return numBase.toString();
    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base) throws IllegalAccessException {
        System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
    }

}
