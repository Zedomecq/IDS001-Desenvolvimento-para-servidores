package ExerciciosMetodos;

public class Funcionarios {
    String nome;
    double salario;
    int codigo;
    int classeFuncionario;

    void promocao(double percentualAumento) {
        // Calcula o fator de aumento. Se o aumento for de 10%, o fator será 1.10
        double fatorDeAumento = 1 + (percentualAumento / 100.0);

        // Multiplica o salário atual pelo fator de aumento
        this.salario = this.salario * fatorDeAumento;
    }
    void consultarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Código: " + this.codigo);
    }

}
