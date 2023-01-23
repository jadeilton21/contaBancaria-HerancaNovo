package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.GuardadoDeContas;

public class Teste2 {


    public static void main(String[] args) {



        GuardadoDeContas guardando = new GuardadoDeContas();

        Conta conta1 = new ContaCorrente(232,43432);
        guardando.adicione(conta1);

        int quantidade = guardando.getQuantidadeDeElemento();
        System.out.println("--> " + quantidade);


        Conta ref = guardando.getQuantidade(8);
        System.out.println("--> " + ref.getNumero());





    }


}
