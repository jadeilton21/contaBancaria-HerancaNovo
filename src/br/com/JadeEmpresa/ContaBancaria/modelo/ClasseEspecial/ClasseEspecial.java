package br.com.JadeEmpresa.ContaBancaria.modelo.ClasseEspecial;

import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Conta;
import br.com.JadeEmpresa.ContaBancaria.modelo.modelo.Senhas;

/**
 * Classe Especial Para Testar Imports..
 *
 * @author Jadeilton
 */

public class ClasseEspecial extends Conta implements Senhas {


    public ClasseEspecial(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public double getSenha() {
        return this.getSenha();
    }

    @Override
    public boolean autenticar(int senha) {
        return false;
    }
}
