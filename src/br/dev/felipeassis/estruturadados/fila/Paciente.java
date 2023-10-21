package br.dev.felipeassis.estruturadados.fila;

public class Paciente implements Comparable<Paciente> {

    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Paciente() {
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
    public int compareTo(Paciente o) {
//        if (prioridade > o.getPrioridade()) {
//            return 1;
//        }
//        if(prioridade < o.getPrioridade()) {
//            return -1;
//        }
//
//        return 0;
        return Integer.compare(prioridade, o.getPrioridade());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
