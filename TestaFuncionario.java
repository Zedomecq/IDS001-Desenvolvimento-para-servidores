package ExerciciosMetodos;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios();

        //Atribuindo valores aos atributos do objeto
        f1.nome = "Joaquim";
        f1.classeFuncionario = 1;
        f1.codigo = 1;
        f1.salario = 3400;

        Funcionarios f2 = new Funcionarios();

        f2.nome = "Ayrton";
        f2.classeFuncionario = 3;
        f2.codigo = 12;
        f2.salario = 9000;

        System.out.println(f1.nome);
        System.out.println(f1.codigo);
        System.out.println(f1.salario);

        System.out.println(f2.nome);
        System.out.println(f2.codigo);
        System.out.println(f2.salario);

        System.out.println("Salário antigo do " + f1.nome + ": " + f1.salario);
        System.out.println("Salário antigo do " + f2.nome + ": " + f2.salario);

        // Dando um aumento de 15%
        f1.promocao(15.0);
        f2.promocao(15.0);

        System.out.println("Salário novo do " + f1.nome + " após aumento de 15%: " + f1.salario);
        System.out.println("Salário novo do " + f2.nome + " após aumento de 15%: " + f2.salario);

    }

}
