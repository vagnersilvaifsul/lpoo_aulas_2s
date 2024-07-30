package model;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nome;

    //Associação binária Bi-direcional
    List<Dependente> dependentes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "Socio{" +
            "nome='" + nome + '\'' +
            ", dependentes=" + dependentes +
            '}';
    }
}
