package model;

public class ContaCorrente extends Conta{

    @Override
    public void saca(double valor) {
        if((this.saldo + 2000.00) > valor){
            super.saca(valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!!!");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
            "saldo=" + saldo +
            "} ";
    }
}
