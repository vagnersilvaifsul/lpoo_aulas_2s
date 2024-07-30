package model;

public class  Dependente {
    private String nome;

    //Associação binária Bi-direcional
    private Socio socio;

    @Override
    public String toString() {
        return "Dependente{" +
            "nome='" + nome + '\'' +
            ", socio=" + socio +
            '}';
    }
}
