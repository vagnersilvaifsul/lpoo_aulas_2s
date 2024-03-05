package controller;

import model.Cliente;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        System.out.println(c1);
        Cliente c2 = new Cliente("111.222.333-23", "Ana", "Silva", "Rua das Flores, 10", "96000-000", "5355551234", "email@mail.com");
        System.out.println(c2);
        Cliente c3 = new Cliente("666.555.222-21", "Rafael", "Silveira");
        System.out.println(c3);
    }
}
