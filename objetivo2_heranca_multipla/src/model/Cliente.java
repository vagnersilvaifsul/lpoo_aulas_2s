package model;

public class Cliente implements Investidor{

    private String ticker;
    private int quantidadeDeCotas;

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
        return "\nCliente{" +
            "ticker='" + ticker + '\'' +
            ", quantidadeDeCotas=" + quantidadeDeCotas +
            '}';
    }
}
