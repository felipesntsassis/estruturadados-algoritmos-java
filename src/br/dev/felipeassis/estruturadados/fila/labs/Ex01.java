package br.dev.felipeassis.estruturadados.fila.labs;

import br.dev.felipeassis.estruturadados.fila.Fila;
import br.dev.felipeassis.estruturadados.fila.FilaComPrioridade;

import static java.lang.Thread.sleep;

public class Ex01 {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        FilaComPrioridade<Documento> documentos = new FilaComPrioridade<>();
        documentos.enfileirar(new Documento("TRABALHO DE HISTÓRIA", 20, 3));
        documentos.enfileirar(new Documento("TRABALHO DE MATEMÁTICA", 3, 1));
        documentos.enfileirar(new Documento("TRABALHO DE PORTUGUÊS", 10, 1));
        System.out.printf("Documentos para imprimir: %s%n%n", documentos);
        imprimirDocumentos(documentos);
        System.out.println("Todos os documentos foram impressos com sucesso!");
    }

    public static void imprimirDocumentos(FilaComPrioridade<Documento> documentos) throws IllegalAccessException, InterruptedException {
        while (!documentos.estaVazia()) {
            Documento documento = documentos.desenfileirar();
            System.out.printf("Imprimindo documento %s...%n", documento.getNome());
            sleep(documento.getQuantidadeDeFolhas() * 1000L);
            System.out.printf("documento %s impresso!%n", documento.getNome());
        }
    }

}
