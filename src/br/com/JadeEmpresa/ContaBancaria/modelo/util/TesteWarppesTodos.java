package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWarppesTodos {


    public static void main(String[] args) {


        Integer ref1 = Integer.valueOf(34); // AutoBoxing;
        System.out.println("--> " + ref1.intValue());// unBoxing;


        Double ref2 = Double.valueOf(43.43); //AutoBoxing;
        System.out.println("--> " + ref2.doubleValue()); // UnBoxing.


        Boolean ref3 = Boolean.FALSE;
        System.out.println("--> " + ref3.booleanValue());

        Boolean ref4 = Boolean.TRUE;
        System.out.println("--> " + ref4.booleanValue());


        // Classe mãe " Number"...


        Number ref5 = Integer.valueOf(34);
        System.out.println("--> " + ref5.intValue());

        Number ref6 = Double.valueOf(542);
        System.out.println("--> " + ref6.doubleValue());


        // Posso usar polimorfismo para escolher add qualquer um.


        List<Number> lista = new ArrayList<Number>();
        lista.add(43);
        lista.add(43.43);
        lista.add(43.43f);









    }
}
