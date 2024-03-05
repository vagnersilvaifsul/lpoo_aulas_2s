package model;

public class Conta {
    private long id;
    private double saldo;

    public Conta() {
    }

    public Conta(long id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Conta(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void atualiza(double taxa){
        this.saldo = this.saldo + (this.saldo * taxa/100);
        this.saldo += this.saldo * taxa/100;
    }

    @Override
    public String toString() {
        return "\nConta{" +
            "id=" + id +
            ", saldo=" + saldo +
            '}';
    }
}
