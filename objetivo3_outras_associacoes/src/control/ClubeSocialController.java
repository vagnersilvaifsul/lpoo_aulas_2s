package control;

import model.Dependente;
import model.Socio;

public class ClubeSocialController {
    public static void main(String[] args) {
        Socio socio = new Socio();
        Dependente dependente1 = new Dependente();
        Dependente dependente2 = new Dependente();

        socio.getDependentes().add(dependente1);
        socio.getDependentes().add(dependente2);
        System.out.println(socio);
        System.out.println(dependente1);
    }
}
