package model;

public class Pessoa{
    //Atributos
    private String nome;
    private String cpf;
    private int idade;

    //Construtores
    //Construtor Padrão
    public Pessoa(){}

    //construtor parametrizado
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    //Métodos acessores (de acesso)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Conversor de Objeto para String
    @Override
    public String toString() {
        return "model.Pessoa{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", idade=" + idade +
            '}';
    }
}
