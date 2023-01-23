package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWapperComInteger {


    public static void main(String[] args) {

        //AutoBoxing e UnBoxing serve para adicionar um elemento com o AutoBoxing e saida com o UnBoxing, acontece normal.
        Integer ref = 29;
        int primitivo = new Integer(21);


        List<Integer> lista  = new ArrayList<>();
        lista.add(ref);
        lista.add(primitivo);

        int i1 = lista.get(0);
        Integer i2 = lista.get(1);

        System.out.println("--> "   + i1);
        System.out.println("--> " + i2);


        Integer valorPrioridade = Integer.valueOf(33);// AutoBoxing.
        int valor = valorPrioridade.intValue(); // UnBoxing.

        System.out.println("--> " + valor);

        Integer valor1 = Integer.valueOf("44"); // AutoBoxing;
        int valor2 = Integer.parseInt("42"); // AutoBoxing;

        System.out.println("--> " + valor1);
        System.out.println("--> " + valor2);


        System.out.println("--> " + Integer.BYTES); // UnBoxing
        System.out.println("--> " + Integer.SIZE); // Unboxing
        System.out.println("--> " + Integer.MIN_VALUE); // UnBoxing;
        System.out.println("--> " + Integer.MAX_VALUE); // UnBoxing;



    }




}
