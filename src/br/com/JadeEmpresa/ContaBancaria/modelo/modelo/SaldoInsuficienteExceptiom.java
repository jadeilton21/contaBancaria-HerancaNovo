package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;

public class SaldoInsuficienteExceptiom extends RuntimeException {


    public SaldoInsuficienteExceptiom(String msg){
        super(msg);
    }

}
