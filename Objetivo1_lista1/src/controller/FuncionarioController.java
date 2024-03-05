package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        Funcionario f3 = new Funcionario("Ana", 3000.00);
        Funcionario f4 = new Funcionario("Rafael", 4000.00);

        Funcionario f5 = new Funcionario("Maria");
        Funcionario f6 = new Funcionario("João");

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
        System.out.println(f5.toString());
        System.out.println(f6.toString());

        f1.setNome("Tereza");
        f1.setSalario(1000.00);

        f2.setNome("Ricardo");
        f2.setSalario(2000.00);

        f3.setNome("Ana Silva");
        f3.setSalario(6000.00);

        f4.setNome("Rafael Torres");
        f4.setSalario(8000.00);

        f5.setNome("Maria Santos");
        f5.setSalario(10000.00);

        f6.setNome("João Jesus");
        f6.setSalario(12000.00);

        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());
        System.out.println(f3.getNome());
        System.out.println(f3.getSalario());
    }
}
