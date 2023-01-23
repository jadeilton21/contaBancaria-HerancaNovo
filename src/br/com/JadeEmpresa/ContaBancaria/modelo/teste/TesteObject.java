package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.SaldoInsuficienteExceptiom;

public class TesteObject {


    public static void main(String[] args) throws SaldoInsuficienteExceptiom {

        Conta c = new ContaPoupaca(222,33);
        Object cc = new ContaCorrente(2221,333);

        System.out.println(c.toString());
       // System.out.println(cc);


    }


}
