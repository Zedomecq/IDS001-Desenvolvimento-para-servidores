package LojaDeVeiculos;

import java.util.ArrayList; // PASSO 1: Importar a classe ArrayList

public class TestaLoja {
    public static void main(String[] args) {

        // Criar as listas para guardar os objetos
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();


        // Criar e Adicionar Vendedores na Lista

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("João");
        vendedores.add(vendedor1); // Adiciona na lista

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Maria");
        vendedores.add(vendedor2);

        Vendedor vendedor3 = new Vendedor();
        vendedor3.setNome("Carlos");
        vendedores.add(vendedor3);


        // Criar e Adicionar Carros na Lista

        Carro carro1 = new Carro(); // Novo (até 5 anos)
        carro1.setMarca("Fiat");
        carro1.setModelo("Pulse");
        carro1.setAno(2022);
        carro1.setPreco(95000.0);
        carros.add(carro1);

        Carro carro2 = new Carro(); // Seminovo (até 10 anos)
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Onix");
        carro2.setAno(2018);
        carro2.setPreco(55000.0);
        carros.add(carro2);

        Carro carro3 = new Carro(); // Usado (até 15 anos)
        carro3.setMarca("Ford");
        carro3.setModelo("Ka");
        carro3.setAno(2012);
        carro3.setPreco(32000.0);
        carros.add(carro3);

        Carro carro4 = new Carro(); // Antigo (mais de 15 anos)
        carro4.setMarca("Volkswagen");
        carro4.setModelo("Gol");
        carro4.setAno(2007);
        carro4.setPreco(18000.0);
        carros.add(carro4);

        Carro carro5 = new Carro(); // Novo (até 5 anos)
        carro5.setMarca("Toyota");
        carro5.setModelo("Corola");
        carro5.setAno(2025);
        carro5.setPreco(195000.0);
        carros.add(carro5);


        // Simular e Registrar as Vendas

        // Venda 1: Vendedor 1 vende o Carro 4
        Venda venda1 = new Venda(carros.get(3), vendedores.get(0), 18000.0);
        vendas.add(venda1);

        // Venda 2: Vendedora 2 vende o Carro 1
        Venda venda2 = new Venda(carros.get(0), vendedores.get(1), 95000.0);
        vendas.add(venda2);

        // Venda 3: Vendedor 1 vende o Carro 3
        Venda venda3 = new Venda(carros.get(2), vendedores.get(0), 32000.0);
        vendas.add(venda3);

        // Venda 4: vendedor 3 vende o carro 5
        Venda venda4 = new Venda(carros.get(4), vendedores.get(2), 195000.0);
        vendas.add(venda4);


    ;    // Exibir os resultados de TODAS as vendas com um laço de repetição

        System.out.println("======= RELATÓRIO DE VENDAS E COMISSÕES =======");
        int vendaNum = 1;
        for (Venda vendaRegistrada : vendas) {
            System.out.println("\n--- DETALHES DA VENDA Nº " + vendaNum + " ---");
            vendaRegistrada.getVeiculoVendido().mostraInfo();
            System.out.println("Vendedor(a): " + vendaRegistrada.getVendedor().getNome());

            double comissao = vendaRegistrada.calculaComissao();
            System.out.printf("Comissão da Venda: R$ %.2f%n", comissao);
            vendaNum++;
        }
    }
}