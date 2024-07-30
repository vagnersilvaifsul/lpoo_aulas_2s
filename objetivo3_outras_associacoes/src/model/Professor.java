package model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    //Associação ternária
    List<SalaDeAula> salasDeAulas  = new ArrayList<>();
    List<Turma> turmas  = new ArrayList<>();

    public List<SalaDeAula> getSalasDeAulas() {
        return salasDeAulas;
    }

    public void setSalasDeAulas(List<SalaDeAula> salasDeAulas) {
        this.salasDeAulas = salasDeAulas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "\nProfessor{" +
            "salasDeAulas=" + salasDeAulas +
            ", turmas=" + turmas +
            '}';
    }
}
