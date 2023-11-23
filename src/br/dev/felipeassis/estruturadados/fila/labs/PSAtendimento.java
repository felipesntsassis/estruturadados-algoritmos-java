package br.dev.felipeassis.estruturadados.fila.labs;

import br.dev.felipeassis.estruturadados.fila.FilaComPrioridade;

public class PSAtendimento implements  Runnable {

    private final FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while(!fila.estaVazia()) {
            try {
                System.out.printf("%s atendida.%n", fila.desenfileirar());
                Thread.sleep(5000);
            } catch (IllegalAccessException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído.");
    }

}
