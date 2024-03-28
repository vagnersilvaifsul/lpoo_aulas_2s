package control;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Desenvolvedor d1 = new Desenvolvedor();
        Cliente c1 = new Cliente();

        //coleção que representa todos os funcionários do Sicredi
        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(g1);
        funcionarioList.add(d1);
        System.out.println(funcionarioList);

        //coleção que representa todos os investidores do Sicredi
        List<Investidor> investidorList = new ArrayList<>();
        investidorList.add(g1);
        investidorList.add(c1);
        System.out.println(investidorList);

    }
}
