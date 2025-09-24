package ExerciciosMetodos;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios();

        //Atribuindo valores aos atributos do objeto
        f1.setNome("Joaquim") ;
        f1.setClasseFuncionario(1);
        f1.setCodigo(1);
        f1.setSalario(3400);

        Funcionarios f2 = new Funcionarios();

        f2.setNome("Ayrton");
        f2.setClasseFuncionario(3);
        f2.setCodigo(12);
        f2.setSalario(9000);

        System.out.println(f1.getNome());
        System.out.println(f1.getCodigo());
        System.out.println(f1.getSalario());

        System.out.println(f2.getNome());
        System.out.println(f2.getCodigo());
        System.out.println(f2.getSalario());

        System.out.println("Salário antigo do " + f1.getNome() + ": " + f1.getSalario());
        System.out.println("Salário antigo do " + f2.getNome() + ": " + f2.getSalario());

        // Dando um aumento de 15%
        f1.promocao(15.0);
        f2.promocao(15.0);

        System.out.println("Salário novo do " + f1.getNome() + " após aumento de 15%: " + f1.getSalario());
        System.out.println("Salário novo do " + f2.getNome() + " após aumento de 15%: " + f2.getSalario());

    }

}
