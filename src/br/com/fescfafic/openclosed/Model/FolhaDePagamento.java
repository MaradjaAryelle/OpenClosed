package br.com.fescfafic.openclosed.Model;

import java.util.ArrayList;

public class FolhaDePagamento {
    public static double calcularFolhaDePagamento(ArrayList<Pessoa> listaPessoas) {
        double totalFolha = 0;

        for (Pessoa pessoa : listaPessoas) {
            totalFolha += pessoa.calcularFolhaDePagamento();
        }
        return totalFolha;
    }
}