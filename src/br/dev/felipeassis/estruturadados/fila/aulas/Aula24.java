package br.dev.felipeassis.estruturadados.fila.aulas;

import br.dev.felipeassis.estruturadados.fila.FilaComPrioridade;
import br.dev.felipeassis.estruturadados.fila.Paciente;

public class Aula24 {

    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);
        System.out.println(fila); // 1 2 3

        FilaComPrioridade<Paciente> filaPacientes = new FilaComPrioridade<>();
        filaPacientes.enfileirar(new Paciente("Felipe", 3));
        filaPacientes.enfileirar(new Paciente("Pedro", 2));
        filaPacientes.enfileirar(new Paciente("Isabelle", 1));
        System.out.println(filaPacientes);
    }
}
