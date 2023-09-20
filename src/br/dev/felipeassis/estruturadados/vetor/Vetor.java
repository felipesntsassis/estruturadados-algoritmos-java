package br.dev.felipeassis.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento) {
        for (int i = 0; i < elementos.length; i ++) {
            if (this.elementos[i] == null)
                this.elementos[i] = elemento;
            break;
        }
    }*/

    /*public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
        } else {
            throw new Exception("Vetor já está cheio! Não é possível adicionar mais elementos!");
        }
    }*/

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, String elemento) throws IllegalAccessException {
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

    public String busca(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }

        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
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
            String[] elementosNovos = new String[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }

            elementos = elementosNovos;
        }
    }
}