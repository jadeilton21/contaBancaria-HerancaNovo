package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Cliente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {


    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitluar(clienteCC1.getNome());
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupaca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitluar(clienteCC2.getNome());
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitluar(clienteCC3.getNome());
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupaca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitluar(clienteCC4.getNome());
        cc4.depositar(222.0);


        List<Conta> lista = new ArrayList<>(6);
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        System.out.println("==================================");


        lista.sort(( c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
        Comparator<Conta> camp = ( Conta c1,  Conta c2) ->{

                String conta1 = c1.getTitluar();
                String conta2 = c2.getTitluar();
                return conta1.compareTo(conta2);
            };
        lista.sort(camp);

        lista.forEach((conta) -> System.out.println(conta + " Nome: " + conta.getTitluar()));

    }

}
