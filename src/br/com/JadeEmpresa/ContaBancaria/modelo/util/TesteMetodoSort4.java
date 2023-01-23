package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Cliente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteMetodoSort4 {

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


        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        System.out.println("==================================");

        //ListaNumeros listaNumeros = new ListaNumeros();

        StringLista stringLista = new StringLista();

        //Collections.sort(stringLista);
        //Collections.reverse();

        lista.sort(stringLista);

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitluar());
        }


    }
    static class StringLista implements Comparator<Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {

            String conta1 = c1.getTitluar();
            String conta2 = c2.getTitluar();
            return conta1.compareTo(conta2);
        }
    }

    static class ListaNumeros implements Comparator<Conta> {


        @Override
        public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
        }
}




}
