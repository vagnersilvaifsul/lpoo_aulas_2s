package model;

import java.util.ArrayList;
import java.util.List;

//Associação Unária ou Reflexiva
public class Funcionario {
    private String nome;

    //interpretação da associação Unária ou Reflexiva
    //uma instância de Funcionário se associa com 0..*
    List<Funcionario> funcionarios = new ArrayList<>();
}
