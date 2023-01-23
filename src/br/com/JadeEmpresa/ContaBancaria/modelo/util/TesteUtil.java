package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;

import java.util.ArrayList;

public class TesteUtil {


    public static void main(String[] args) {


        ArrayList lista = new ArrayList();

        Conta conta1 = new ContaCorrente(22,2332);
        lista.add(conta1);

        Conta conta2 = new ContaPoupaca(343,434);
        lista.add(conta2);

        System.out.println("--> Tamanho: " + lista.size());


        Conta refNumero = (Conta) lista.get(1);
        Conta refAgencia = (Conta) lista.get(0);
        System.out.println("--> " + refNumero.getNumero());
        System.out.println("--> " + refAgencia.getAgencia());


        lista.remove(1);
        System.out.println("--> Tamanho: " + lista.size() );

        System.out.println("-----------------------------------");
        Conta conta3 = new ContaCorrente(22,2332);
        lista.add(conta3);

        Conta conta4 = new ContaPoupaca(343,434);
        lista.add(conta4);



        for(int i =0; i < lista.size(); i++){
            Object ref2 = lista.get(i);
            System.out.println("--> " + ref2);
        }

        System.out.println("-----------------------");
        for(Object ref : lista){
            System.out.println("--> " + ref);
        }








    }


}
