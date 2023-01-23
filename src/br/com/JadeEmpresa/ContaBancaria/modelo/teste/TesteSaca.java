package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;

public class TesteSaca {


    public static void main(String[] args) {
        Conta c = new ContaCorrente(022,434);

        c.depositar(200);
        c.sacar(100);

        System.out.println("--> " + c.getSaldo());
    }
}
