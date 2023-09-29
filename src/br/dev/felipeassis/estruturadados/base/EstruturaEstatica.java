package br.dev.felipeassis.estruturadados.base;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturaEstatica() {
        this(10);
    }

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // preferir esta solulção
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
            return true;
        }

        return false;
    }

    protected boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }

        this.aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao; i --) {
            elementos[i + 1] = elementos[i];
        }

        elementos[posicao] = elemento;
        tamanho ++;

        return true;
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }

            elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < tamanho - 1; i++) {
            sb.append(elementos[i]);
            sb.append(", ");
        }

        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }
}
