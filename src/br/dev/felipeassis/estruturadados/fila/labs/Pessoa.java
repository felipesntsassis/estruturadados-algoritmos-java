package br.dev.felipeassis.estruturadados.fila.labs;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int prioridade;

    public Pessoa() {
    }

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(prioridade, p.prioridade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }

}
