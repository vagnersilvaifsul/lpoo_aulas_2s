package controller;

import model.*;

public class ContaController {
    public static void main(String[] args) {
        //Conta c = new Conta(); //a classe conta não pode ser instanciada, pois está
        //marcada com o modificador de acesso "abstract"

        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println(cp1);


        ContaCorrente cc1 = new ContaCorrente();
        System.out.println(cc1);

        ContaConjunta cj1 = new ContaConjunta(1000.00);
        System.out.println(cj1);

        ContaPoupancaSalario cps1 = new ContaPoupancaSalario(2000.00);

    }
}
