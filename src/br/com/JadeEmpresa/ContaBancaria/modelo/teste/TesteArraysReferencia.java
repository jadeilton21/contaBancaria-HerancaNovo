package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

public class TesteArraysReferencia {


    public static void main(String[] args) {


    Conta[] referencias = new Conta[5];

    ContaCorrente contaCorrente = new ContaCorrente(323,4343);
    referencias[3] = contaCorrente;

    ContaPoupaca contaPoupaca = new ContaPoupaca(3343, 1);
    referencias[4]= contaPoupaca;


        ContaPoupaca ref = (ContaPoupaca) referencias[5];

        System.out.println("--> " + ref.getNumero());
        System.out.println("--> " + contaPoupaca.getNumero());
        System.out.println("--> " + contaCorrente.getNumero());





    }
}
