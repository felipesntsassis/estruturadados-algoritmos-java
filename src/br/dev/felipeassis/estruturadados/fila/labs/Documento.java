package br.dev.felipeassis.estruturadados.fila.labs;

public class Documento implements Comparable<Documento> {
    private String nome;
    private int quantidadeDeFolhas;
    private int ordem;

    public Documento(String nome, int quantidadeDeFolhas, int ordem) {
        this.nome = nome;
        this.quantidadeDeFolhas = quantidadeDeFolhas;
        this.ordem = ordem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeFolhas() {
        return quantidadeDeFolhas;
    }

    public void setQuantidadeDeFolhas(int quantidadeDeFolhas) {
        this.quantidadeDeFolhas = quantidadeDeFolhas;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    @Override
    public int compareTo(Documento o) {
        return Integer.compare(ordem, o.getOrdem());
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", quantidadeDeFolhas=" + quantidadeDeFolhas +
                ", ordem=" + ordem +
                '}';
    }

}
