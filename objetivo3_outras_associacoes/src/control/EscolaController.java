package control;

import model.Professor;
import model.SalaDeAula;
import model.Turma;

public class EscolaController {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Turma turma = new Turma();
        SalaDeAula sala = new SalaDeAula();

        professor.getTurmas().add(turma);
        professor.getSalasDeAulas().add(sala);

        System.out.println(professor);
    }
}
