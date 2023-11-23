package br.dev.felipeassis.estruturadados.fila.labs;

import br.dev.felipeassis.estruturadados.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    private int count = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa(String.valueOf(count), prioridade.nextInt(3));
                fila.enfileirar(p);
                count ++;
                System.out.printf("%s enfileirada.%n", p);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
