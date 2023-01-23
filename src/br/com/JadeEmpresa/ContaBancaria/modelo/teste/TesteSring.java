package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

import java.util.Locale;

public class TesteSring {


    public static void main(String[] args) {




        String nome = "Aluura";


        String resultado = nome.toLowerCase();
        String resultado1 = nome.replace("A", "a");

        System.out.println(resultado1);

        System.out.println(resultado);



        for(int i =0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));

        }



    }
}
