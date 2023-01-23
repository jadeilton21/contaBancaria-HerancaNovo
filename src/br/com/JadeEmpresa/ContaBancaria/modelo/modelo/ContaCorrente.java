package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;

public class ContaCorrente extends Conta implements Tributavel, Senhas {


    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    public ContaCorrente(int numero, int agencia){
        super(numero,agencia);
        System.out.println("ContaCorrente, Numero: " + super.getNumero() + " Agencia: " + super.getAgencia());

    }
    public void sacar(double valor){
        double valorSacar = valor + getValorImposto();
        super.sacar(valorSacar);
    }


    @Override
    public double getValorImposto() {
        return 0;
    }

    @Override
    public String toString() {
        return "ContaCorrente: " + super.toString();
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public double getSenha() {
        return 0;
    }

    @Override
    public boolean autenticar(int senha) {
        return false;
    }
}
