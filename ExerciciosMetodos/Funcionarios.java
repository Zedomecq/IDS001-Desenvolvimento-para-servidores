package ExerciciosMetodos;

public class Funcionarios {
    private String nome;
    private double salario;
    private int codigo;
    private int classeFuncionario;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getClasseFuncionario() {
        return classeFuncionario;
    }

    public void setClasseFuncionario(int classeFuncionario) {
        this.classeFuncionario = classeFuncionario;
    }
}
