package br.dev.felipeassis.estruturadados.vetor.labs;

import br.dev.felipeassis.estruturadados.vetor.Contato;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex07 extends Ex06 {

    public static void main(String[] args) {
        // Criação das variáveis
        Scanner scan = new Scanner(System.in);

        // Criar vetor com 20 posições
        ArrayList<Contato> list = new ArrayList<>(20);

        // Criar e addr 30 contatos
        createContacts(5, list);

        // Criar o menu para que o usuário escolha a opção
        int opcao = 1;

        while(opcao != 0) {
            opcao = getMenu(scan);

            switch (opcao) {
                case 1 -> addLastContact(scan, list);
                case 2 -> addLastContactByPosition(scan, list);
                case 3 -> getContactByPositon(scan, list);
                case 4 -> getContact(scan, list);
                case 5 -> searchLastIndex(scan, list);
                case 6 -> contactExists(scan, list);
                case 7 -> removeByPosition(scan, list);
                case 8 -> removeContact(scan, list);
                case 9 -> printArraySize(list);
                case 10 -> removeAllContacts(list);
                case 11 -> printArray(list);
                default -> {
                }
            }
        }

        System.out.println("Usuário digitou 0. Programa finalizado.");
    }

    private static void addLastContactByPosition(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String name = readInput("Entre com o nome:", scan);
        String telephone = readInput("Entre com o telefone:", scan);
        String email = readInput("Entre com o email:", scan);
        Contato contato = new Contato(name, telephone, email);

        try {
            lista.add(contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida. Não adddo");
        }
    }

    private static void addLastContact(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String name = readInput("Entre com o nome:", scan);
        String telephone = readInput("Entre com o telefone:", scan);
        String email = readInput("Entre com o email:", scan);
        Contato contato = new Contato(name, telephone, email);

        lista.add(contato);
        System.out.println("Contato adddo com sucesso!");
        System.out.println(contato);
    }

    private static void createContacts(int quantidade, ArrayList<Contato> lista) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome(String.format("Contato %s", i));
            contato.setTelefone(String.format("(14) 9%s-%s", getNumberPart(), getNumberPart()));
            contato.setEmail(String.format("contato%s@teste.com.br", i));

            lista.add(contato);
        }
    }

    private static void contactExists(Scanner scan, ArrayList<Contato> lista) {
        int pos = readIntInput("Entre com a posição a ser pesquisada:", scan);

        try {
            Contato contact = lista.get(pos);
            boolean exists = lista.contains(contact);

            if (exists) {
                System.out.println("Contato encontrado, segue os dados:");
                System.out.println(contact);
            } else {
                System.out.println("Contato não existe!");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void getContact(Scanner scan, ArrayList<Contato> lista) {
        int pos = readIntInput("Entre com a posição a ser pesquisada:", scan);

        try {
            Contato contact = lista.get(pos);
            System.out.println("Contato encontrado, segue os dados:");
            System.out.println(contact);
            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contact);
            System.out.printf("Contato encontrado na posição %s%n", pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void getContactByPositon(Scanner scan, ArrayList<Contato> lista) {
        int pos = readIntInput("Entre com a posição a ser pesquisada:", scan);

        try {
            Contato contact = lista.get(pos);
            System.out.println("Contato encontrado, segue os dados:");
            System.out.println(contact);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static String getNumberPart() {
        Random rand = new Random();

        return String.valueOf(
                getRandomDigit(rand) + ""
                    + getRandomDigit(rand) + ""
                    + getRandomDigit(rand) + ""
                    + getRandomDigit(rand)
        );
    }

    private static int getRandomDigit(Random rand) {
        return rand.nextInt(10 - 1 + 1) + 1;
    }

    public static void printArray(ArrayList<Contato> list) {
        System.out.println(list);
    }

    public static void printArraySize(ArrayList<Contato> list) {
        System.out.printf("Tamanho do vetor é de %s%n", list.size());
    }

    protected static String readInput(String message, Scanner scan) {
        System.out.println(message);

        return scan.nextLine();
    }

    public static void removeAllContacts(ArrayList<Contato> list) {
        list.clear();
        System.out.println("Todos os contatos do vetor foram excluídos.");
    }

    private static void removeContact(Scanner scan, ArrayList<Contato> lista) {
        int pos = readIntInput("Entre com a posição a ser removida:", scan);

        try {
            Contato contact = lista.get(pos);
            lista.remove(contact);
            System.out.println("Contato excluído!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void removeByPosition(Scanner scan, ArrayList<Contato> lista) {
        int pos = readIntInput("Entre com a posição a ser removida:", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluído!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static int readIntInput(String message, Scanner scan) {
        boolean validInput = false;
        int num = 0;

        while (!validInput) {
            try {
                System.out.println(message);
                String input = scan.nextLine();
                num = Integer.parseInt(input);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente!");
            }
        }

        return num;
    }

    private static void searchLastIndex(Scanner scan, ArrayList<Contato> lista) {
        int pos = readIntInput("Entre com a posição a ser pesquisada:", scan);

        try {
            Contato contact = lista.get(pos);
            System.out.println("Contato encontrado, segue os dados:");
            System.out.println(contact);

            System.out.println("Pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contact);
            System.out.printf("Contato encontrado na posição %s%n", pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

}
