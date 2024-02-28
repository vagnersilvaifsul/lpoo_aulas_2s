package controller;

import model.Pessoa;

public class PessoaController {
    public static void main(String[] args) {
        //Constrói um objeto na memória RAM a partir da chamada de new
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        p1.setCpf("111.222.333-43");
        p1.setIdade(1);
        //System.out.println(p1);
        System.out.println(p1.getCpf());
        System.out.println(p1.getCpf());
        System.out.println(p1.getIdade());

        Pessoa p2 = new Pessoa("Rafael", "555.888.777-32", 10);
        System.out.println(p2.toString());

        Pessoa p3 = new Pessoa();
        p3.setNome("Aline");
        p3.setCpf("666.777.444-21");
        p3.setIdade(40);
        System.out.println(p3.toString());
    }
}
