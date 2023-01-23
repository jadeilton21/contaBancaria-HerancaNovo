package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteMetodoSort {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupaca(22, 44);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupaca(22, 22);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println("=================================");


        NumeroDaContaDoComprador compadaor = new NumeroDaContaDoComprador();

        lista.sort(compadaor);

        System.out.println("===================================");


        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

    static class NumeroDaContaDoComprador implements Comparator<Conta>{


        @Override
        public int compare(Conta c1, Conta c2) {

            if(c1.getNumero() < c2.getNumero()){
                return -1;
            }
            if(c1.getNumero() > c2.getNumero()){
                return 1;
            }
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
