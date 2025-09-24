package LojaDeVeiculos;

public class Carro extends Veiculo {
    private int numeroPortas;

    // Getters e Setters...

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Mostra as infos da classe mãe (Veiculo)
        System.out.println("Número de Portas: " + numeroPortas); // Adiciona a info específica
    }
    // Adicionando Set na classe Carro.java

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}