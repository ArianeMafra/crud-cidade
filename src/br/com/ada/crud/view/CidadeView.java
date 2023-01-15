package br.com.ada.crud.view;

import br.com.ada.crud.controller.CidadeController;
import br.com.ada.crud.model.Cidade;

import java.util.Scanner;

public class CidadeView {

    private CidadeController controller;
    private Scanner scanner;

    public CidadeView(CidadeController controller, Scanner scanner){
        this.controller = controller;
        this.scanner = scanner;
    }

    public void cadastrar(){
        Cidade cidade = new Cidade();

        System.out.print("Entre com nome da cidade: ");
        String nome = scanner.nextLine();
        cidade.setNome(nome);

        System.out.print("Entre com o nome do estado dessa cidade: ");
        String estado = scanner.nextLine();
        cidade.setEstado(estado);

        controller.cadastrar(cidade);
    }

    public void exibirOpcoes() {

        System.out.println("Infome o número da opção desejada:");
        System.out.println("1 - Cadastrar");
        System.out.println("0 - Sair");

        Integer opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida!");
        }
        exibirOpcoes();
    }
}
