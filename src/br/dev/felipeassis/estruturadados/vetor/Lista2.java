package br.dev.felipeassis.estruturadados.vetor;

import br.dev.felipeassis.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2() {
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }

    @Override
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    @Override
    protected boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
        return super.adiciona(posicao, elemento);
    }
}
