package LojaDeVeiculos;

import java.time.Year; // Importa a classe para pegar o ano

public class Venda {
    // 1. ATRIBUTOS: O que uma Venda "tem"
    private Veiculo veiculoVendido;
    private Vendedor vendedor;
    private double precoFinal;

    // 2. CONSTRUTOR: A "porta de entrada" para criar o objeto já com os dados

    public Venda(Veiculo veiculoVendido, Vendedor vendedor, double precoFinal) {
        this.veiculoVendido = veiculoVendido;
        this.vendedor = vendedor;
        this.precoFinal = precoFinal;
    }

    // 3. GETTERS: Métodos para "pegar" os dados de fora da classe
     public Veiculo getVeiculoVendido() {
        return veiculoVendido;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    // 4. Calculo de comissão
    public double calculaComissao() {
        int anoAtual = Year.now().getValue();
        int idadeVeiculo = anoAtual - this.veiculoVendido.getAno();

        double comissaoBase = this.precoFinal * 0.02;
        double comissaoExtra = 0;

        if (idadeVeiculo <= 5) {
            comissaoExtra = this.precoFinal * 0.01;
        } else if (idadeVeiculo <= 10) {
            comissaoExtra = this.precoFinal * 0.02;
        } else if (idadeVeiculo <= 15) {
            comissaoExtra = this.precoFinal * 0.03;
        } else {
            comissaoExtra = this.precoFinal * 0.04;
        }

        return comissaoBase + comissaoExtra;
    }
}