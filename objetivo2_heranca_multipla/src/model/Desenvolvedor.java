package model;

public class Desenvolvedor extends Funcionario{
    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{} " + super.toString();
    }
}
