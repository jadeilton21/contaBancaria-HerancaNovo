package br.com.JadeEmpresa.ContaBancaria.modelo.util;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

public class TesteAutoBoxingUnBoxing {


    public static void main(String[] args) {

        // Unboxing......
        Integer referencia = Integer.valueOf(29); // Autoboxing...

        int valor = referencia.intValue(); // unboxing..

        String s = args[0];// 10, nas configurações do argumento, foi colocado o número 10.

        int numero = Integer.parseInt(s);

        System.out.println("--> " + numero);
        System.out.println("--> " + valor);

        List<Integer> numeros = new ArrayList<Integer>(); // Autoboxing...
        numeros.add(20);
        System.out.println("--> " + numeros);


        System.out.println("-->  " + Integer.MAX_VALUE);
        System.out.println("-->  " + Integer.MIN_VALUE);
        System.out.println("-->  " + Integer.SIZE);
        System.out.println("-->  " + Integer.BYTES );

    }
}
