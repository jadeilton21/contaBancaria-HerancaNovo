package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaCorrente;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.ContaPoupaca;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.GuardadorDeContas;

import java.security.Guard;

public class TesteGuardadorDeContas {


    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,323);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(43432,4324);
        guardador.adiciona(cc2);

        int quantidade = guardador.getQuantidadeDeElementos();

        System.out.println("--> " + quantidade);

        Conta ref = guardador.getQuantidade(0);
        System.out.println(ref.getNumero());

        Object objeto = new ContaPoupaca(3424,4324);
        guardador.adiciona((Conta) objeto);

        Conta ref2 = guardador.getQuantidade(1);
        System.out.println("--> " + ref2.getNumero() );



    }
}
