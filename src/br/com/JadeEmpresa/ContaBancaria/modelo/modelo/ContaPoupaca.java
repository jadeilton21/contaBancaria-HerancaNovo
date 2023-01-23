package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;

public class ContaPoupaca extends Conta implements Tributavel, Senhas{


    public ContaPoupaca(int agencia, int numero){
        super(numero,agencia);
        System.out.println("ContaPoupança, Numero: " + super.getNumero() + " Agencia: " + super.getAgencia());
    }


    public void depositar(double valor){
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return 42;
    }

    @Override
    public String toString() {
        return "ContaPoupanca: " + super.toString();
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public double getSenha() {
        return this.getSenha();
    }

    @Override
    public boolean autenticar(int senha) {
        return false;
    }
}
