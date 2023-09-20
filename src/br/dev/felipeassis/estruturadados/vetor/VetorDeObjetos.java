package br.dev.felipeassis.estruturadados.vetor;

public class VetorDeObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorDeObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, Object elemento) throws IllegalAccessException {
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

    public Object busca(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição inválida!");
        }

        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
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
            Object[] elementosNovos = new String[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }

            elementos = elementosNovos;
        }
    }

}