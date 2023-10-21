package br.dev.felipeassis.estruturadados.fila.aulas;

import br.dev.felipeassis.estruturadados.fila.Paciente;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {
        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
        System.out.println(filaComPrioridade);

        Queue<Paciente> pacientes = new PriorityQueue<>();
        pacientes.add(new Paciente("A", 2));
        pacientes.add(new Paciente("B", 1));
        System.out.println(pacientes);
    }

}
