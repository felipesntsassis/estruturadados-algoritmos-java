package br.dev.felipeassis.estruturadados.pilha.labs;

import br.dev.felipeassis.estruturadados.pilha.Pilha;

public class Ex03 {

    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Learning JavaScript Data Structures and Algorithms - Second Edition");
        livro1.setAutor("Loiane Gronner");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("B01C2XXY2");

        Livro livro2 = new Livro();
        livro2.setNome("Learning JavaScript Data Structures and Algorithms - First Edition");
        livro2.setAutor("Loiane Gronner");
        livro2.setAnoLancamento(2014);
        livro2.setIsbn("B00YTCT02");

        Livro livro3 = new Livro();
        livro3.setNome("Mastering Ext JS - Second Edition");
        livro3.setAutor("Loiane Gronner");
        livro3.setAnoLancamento(2015);
        livro3.setIsbn("B00U01QQWU");

        Livro livro4 = new Livro();
        livro4.setNome("JavaScript Regular Expressions");
        livro4.setAutor("Loiane Gronner");
        livro4.setAnoLancamento(2015);
        livro4.setIsbn("B00YHBVHG0");

        System.out.println("Pilha de livros criada. A pilha está vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha:");
        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        System.out.println(pilha.tamanho() + " livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada. A pilha está vazia? " + pilha.estaVazia());
        System.out.println("Espiando o topo da pilha: " + pilha.topo());
        System.out.println("Desempilhando livros da pilha:");

        while(!pilha.estaVazia()) {
            System.out.println("Desempilhando livro " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia " + pilha.estaVazia());
    }

}
