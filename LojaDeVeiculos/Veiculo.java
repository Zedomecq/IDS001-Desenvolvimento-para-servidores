package LojaDeVeiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    // Getters e Setters...
    public int getAno() { return this.ano; }
    // ... outros getters e setters

    public void mostraInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }
    // Adicionando Get/Set a classe Veiculo.java

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
