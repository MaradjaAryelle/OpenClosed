package br.com.fescfafic.openclosed.Model;

public class Consultor extends Pessoa {
    private double taxaHora;

    public Consultor(String nome, int idade, String email, double taxaHora) {
        super(nome, idade, email);
        this.taxaHora = taxaHora;
    }

    public double getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(double taxaHora) {
        this.taxaHora = taxaHora;
    }

    @Override
    public double calcularFolhaDePagamento() {
        return taxaHora*200;
    }
}
