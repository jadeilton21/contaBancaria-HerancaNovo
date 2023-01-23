package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;

public class GuardadoDeContas {


    private Conta[] referencias;

    private int posicaoLivre;



    public Conta getQuantidade(int pos){
        return this.referencias[pos];
    }

    public int getQuantidadeDeElemento(){
        return this.posicaoLivre;
    }


    public GuardadoDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adicione(Conta ref) {

        referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }
}
