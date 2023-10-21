package br.dev.felipeassis.estruturadados.fila.aulas;

import br.dev.felipeassis.estruturadados.fila.Fila;

public class Aula22 {

    public static void main(String[] args) throws IllegalAccessException {
        Fila<Integer> fila = new Fila<>();
        fila.adiciona(1);
        fila.adiciona(2);
        fila.adiciona(3);
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
        fila.desenfileirar();
        System.out.println(fila);
    }

}
