package model;

public class Cliente {
    //atributos
    String cpf;
    String nome;
    String sobrenome;
    String endereco;
    String cep;
    String telefone;
    String email;

    //Métodos construtores
    public Cliente() {
    }

    public Cliente(String cpf, String nome, String sobrenome, String endereco, String cep, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(String cpf, String nome, String sobrenome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Métodos acessores (de acesso)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Conversor de Objeto para String
    @Override
    public String toString() {
        return "model.Cliente{" +
            "cpf='" + cpf + '\'' +
            ", nome='" + nome + '\'' +
            ", sobrenome='" + sobrenome + '\'' +
            ", endereco='" + endereco + '\'' +
            ", cep='" + cep + '\'' +
            ", telefone='" + telefone + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}
