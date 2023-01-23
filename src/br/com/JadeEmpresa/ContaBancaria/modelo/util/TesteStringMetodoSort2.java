package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Cliente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteStringMetodoSort2 {


    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitluar(clienteCC1.getNome());
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupaca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitluar(clienteCC2.getNome());
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitluar(clienteCC3.getNome());
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupaca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitluar(clienteCC4.getNome());
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);



        System.out.println("===============================");


        ListaOrdemNumeros listaOrdemNumeros = new ListaOrdemNumeros();
        ListaDeStringOrdem listaDeStringOrdem = new ListaDeStringOrdem();
        lista.sort(listaOrdemNumeros);
        lista.sort(listaDeStringOrdem);
        for (Conta conta: lista) {
            System.out.println(conta + ", " + conta.getTitluar());
        }






    }
    static class ListaDeStringOrdem implements Comparator<Conta>{


        @Override
        public int compare(Conta c1, Conta c2) {

            String nome1 = c1.getTitluar();
            String nome2 = c2.getTitluar();



            return nome1.compareTo(nome2);
        }
    }


    static class ListaOrdemNumeros implements Comparator<Conta>{


        @Override
        public int compare(Conta c1, Conta c2) {

            if(c1.getAgencia() < c2.getAgencia()){
                return -1;
            }
            if(c1.getAgencia() > c2.getAgencia()){
                return 1;
            }

            return 0;
        }
    }






}
