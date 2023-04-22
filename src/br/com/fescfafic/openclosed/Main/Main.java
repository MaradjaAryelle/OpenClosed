package br.com.fescfafic.openclosed.Main;

import br.com.fescfafic.openclosed.Model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa empregado = new Empregado("Ary", 30, "ary@haa.com", 1200);
        Pessoa gerente = new Gerente("Ana", 40, "ana@uaua.com", 1000);
        Pessoa consultor = new Consultor("Alan", 50, "alan@suah.com", 50);

        listaPessoas.add(empregado);
        listaPessoas.add(gerente);
        listaPessoas.add(consultor);

        double totalFolha = FolhaDePagamento.calcularFolhaDePagamento(listaPessoas);
        System.out.println("A folha de pagamento é: R$ " + totalFolha);
    }

}