package br.dev.felipeassis.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

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
        if (posicao < 0 || posicao > tamanho) {
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

    public boolean estaVazia() {
        return tamanho == 0;
    }

    protected void remove(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }
        for (int i = posicao; i < tamanho; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho --;
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
