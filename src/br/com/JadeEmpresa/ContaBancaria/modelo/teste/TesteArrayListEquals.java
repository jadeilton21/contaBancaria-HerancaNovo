package br.com.JadeEmpresa.ContaBancaria.modelo.teste;


import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        List <Conta> lista = new ArrayList<Conta>(43);

        Conta conta1 = new ContaCorrente(232,3232);
        lista.add(conta1);
        Conta conta2 = new ContaPoupaca(43,32432);
        lista.add(conta2);

        Conta conta3 = new ContaPoupaca(43,32432);
        lista.add(conta3);


        boolean existe = lista.contains(conta3);
        System.out.println("--> " + existe);


        for(Conta continha : lista){

            System.out.println("--> " + continha);

        }





    }
}




