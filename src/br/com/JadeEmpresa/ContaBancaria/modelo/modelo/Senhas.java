package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;


/**
 * Implementação de senhas.
 *
 * @author Jadeilton
 */

public interface Senhas {


        public abstract void setSenha(int senha);

        public abstract double getSenha();

        public abstract boolean autenticar(int senha);

}
