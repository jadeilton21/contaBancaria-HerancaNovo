package br.com.JadeEmpresa.ContaBancaria.modelo.modelo;

public class CalculoDoImposto {

    private double totalImposto;




    public void resistrar(Tributavel t){
        double tributo = t.getValorImposto();
        this.totalImposto += tributo;
    }

    public double getTotalImposto(){
       return this.totalImposto;

    }
}
