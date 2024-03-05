package model;

public class Produto {
    //Atributos
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;

    //Métodos construtores
    //Método construtor padrão
    public Produto() {
    }
    //Método Construtor parametrizado
    public Produto(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }
    //Método Construtor parametrizado
    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    //Métodos getters e setters (acessores)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //Converte o objeto em String
    @Override
    public String toString() {
        return "Produto{" +
            "nome='" + nome + '\'' +
            ", descricao='" + descricao + '\'' +
            ", valor=" + valor +
            ", estoque=" + estoque +
            '}';
    }
}
