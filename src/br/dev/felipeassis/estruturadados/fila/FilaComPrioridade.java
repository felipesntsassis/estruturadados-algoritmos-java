package br.dev.felipeassis.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T> {

    @Override
    public void enfileirar(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;

        for (i = 0; i < this.tamanho; i ++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        try {
            this.adiciona(i, elemento);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
