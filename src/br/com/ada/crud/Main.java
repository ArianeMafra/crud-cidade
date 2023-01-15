package br.com.ada.crud;

import br.com.ada.crud.controller.impl.CidadeArmazenamentoVolatilController;
import br.com.ada.crud.view.CidadeView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CidadeView view = new CidadeView(new CidadeArmazenamentoVolatilController(), new Scanner(System.in));
        view.exibirOpcoes();
    }
}