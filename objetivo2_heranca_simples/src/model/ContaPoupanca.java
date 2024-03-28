package model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void saca(double valor) {
        if(this.saldo > valor){
            super.saca(valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!!!");
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
            "saldo=" + saldo +
            "} ";
    }
}
