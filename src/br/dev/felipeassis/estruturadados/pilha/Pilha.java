package br.dev.felipeassis.estruturadados.pilha;

import br.dev.felipeassis.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super(10);
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (estaVazia())
            return null;

        return elementos[tamanho - 1];
    }

}
