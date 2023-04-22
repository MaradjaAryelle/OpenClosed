package br.com.fescfafic.openclosed.Model;

public class Gerente extends Pessoa {
    private double bonus;

    public Gerente(String nome, int idade, String email, double bonus) {
        super(nome, idade, email);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularFolhaDePagamento() {
        return bonus*5;
    }
}