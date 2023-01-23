package br.com.JadeEmpresa.ContaBancaria.modelo.teste;


import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

import java.util.ArrayList;

public class TesteClienteTeste {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>(34);

        Conta conta = new ContaPoupaca(232, 3232);
        lista.add(conta);

        Conta conta1 = new ContaCorrente(23, 32);
        lista.add(conta1);

        Conta conta3 = new ContaCorrente(3243, 424);
        lista.add(conta3);


        System.out.println("--> Tamanho: " + lista.size());



        //lista.remove(1);

        //System.out.println("--> Tamanho: " + lista.size() );



        Conta ref = lista.get(2);
        System.out.println("--> " + ref.getNumero());



        for(Conta referencia : lista){
            System.out.println("--> " + referencia.getNumero());
        }

    }
}




