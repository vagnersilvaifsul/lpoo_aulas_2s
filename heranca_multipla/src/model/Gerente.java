package model;

public class Gerente extends Funcionario implements Investidor{

    private String ticker;
    private int quantidadeDeCotas;


    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return this.quantidadeDeCotas;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidadeDeCotas = quantidade;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
            "ticker='" + ticker + '\'' +
            ", quantidadeDeCotas=" + quantidadeDeCotas +
            "} ";
    }
}
