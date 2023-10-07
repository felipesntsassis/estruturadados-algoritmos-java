package br.dev.felipeassis.estruturadados.pilha.aulas.labs;

import java.util.Stack;

public class Ex04 {

    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

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

        System.out.println("Pilha de livros criada. A pilha está vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha:");
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        System.out.println(pilha.size() + " livros foram pushdos:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada. A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Espiando o peek da pilha: " + pilha.peek());
        System.out.println("Despushndo livros da pilha:");

        while(!pilha.isEmpty()) {
            System.out.println("Despushndo livro " + pilha.pop());
        }

        System.out.println("Todos os livros foram popdos, pilha vazia " + pilha.isEmpty());
    }
}
