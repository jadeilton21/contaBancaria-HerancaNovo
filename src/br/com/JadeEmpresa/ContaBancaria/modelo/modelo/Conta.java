package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;


/**
 * Conta para todos do Projeto
 *
 * @author Jadeilton *
 * @version 0.1
 */

public abstract class Conta extends Object implements Comparable<Conta>{



    private String titluar;
    private int numero;
    private int agencia;
    protected double saldo;






    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (this.saldo < valor){
            throw new SaldoInsuficienteExceptiom("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;

        }


    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);


    }


    /**
     *
     * @param numero 12;
     * @param agencia 14
     */

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public String getTitluar() {
        return titluar;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object referencia){


        Conta outraCoisa = (Conta) referencia;


        if(this.agencia != outraCoisa.agencia){
            return false;
        }
        if(this.numero != outraCoisa.numero){
            return false;
        }
        return true;
    }


    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public String toString() {
        return " Agencia: " + this.getAgencia() + " Numero: " + this.getNumero() + " Saldo: " + this.saldo;
    }

    public double deposita(double v) {
        return v;
    }

    public void setTitluar(String titular) {
        this.titluar = titular;
    }
}
