package br.dev.felipeassis.estruturadados.fila;

import br.dev.felipeassis.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
//        this.elementos[this.tamanho] = elemento;
//        this.tamanho ++;
//        this.elementos[this.tamanho++] = elemento;
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileirar() throws IllegalAccessException {
        final int POS = 0;

        if (this.estaVazia()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[0];
        remove(POS);

        return elementoASerRemovido;
    }

}
