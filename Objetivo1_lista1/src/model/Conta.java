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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
            "id=" + id +
            ", saldo=" + saldo +
            '}';
    }
}
