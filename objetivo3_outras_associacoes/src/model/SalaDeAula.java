package model;

import java.util.ArrayList;
import java.util.List;

public class SalaDeAula {

    //Associação ternária
    List<Professor> professores  = new ArrayList<>();
    List<Turma> turmas  = new ArrayList<>();

    @Override
    public String toString() {
        return "SalaDeAula{" +
            '}';
    }
}
