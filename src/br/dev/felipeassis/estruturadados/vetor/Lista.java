package br.dev.felipeassis.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // preferir esta solulção
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
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

    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
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

    public T busca(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }

        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }

    public T obtem(int posicao) throws IllegalAccessException {
        return busca(posicao);
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void remove(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }
        for (int i = posicao; i < tamanho; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho --;
    }

    public void remove(T elemento) throws IllegalAccessException {
        int pos = busca(elemento);

        if (pos > -1) remove(pos);
    }

    public int lastIndexOf(T element) {
        return busca(element);
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

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }

            elementos = elementosNovos;
        }
    }

    public int ultimoIndice(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento))
                return i;
        }

        return -1;

        /*int ultimaPos = -1;

        for (int i = 0; i < tamanho; i ++) {
            if (elementos[i].equals(elemento)) {
                ultimaPos = i;
            }
        }

        return ultimaPos;*/
    }

}
