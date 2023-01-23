package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Cliente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

public class ClasseTeste extends Object {


    public static void main(String[] args) {


        // Object [] referencias = new Object[5]; pode ser usado assim tbm se tiver outras clsses ligadas ao Object.
        //Conta[] referencias = new Conta[5];
        Object [] referencias = new Object[5];
        ContaCorrente contaCorrente = new ContaCorrente(323,4343);
        referencias[3] = contaCorrente;

        ContaPoupaca contaPoupaca = new ContaPoupaca(3343, 1);
        referencias[4]= contaPoupaca;


        ContaPoupaca ref = (ContaPoupaca) referencias[4]; // type Cast.


        System.out.println("--> "+ ref.getNumero());
        System.out.println("--> " + contaPoupaca);


        ContaCorrente ref2 = (ContaCorrente) referencias[3]; // type Cast.

        System.out.println("--> " + ref2.getNumero());

        Cliente cliente = new Cliente();
        referencias[3] = cliente;
        cliente.setNome("jadeilton");
        Cliente ref3 = (Cliente) referencias[3];
        System.out.println("--> " + cliente.getNome());
        System.out.println("--> " + ref3.getNome());










    }
}
