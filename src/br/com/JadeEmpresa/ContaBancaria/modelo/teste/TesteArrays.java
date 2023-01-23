package br.com.JadeEmpresa.ContaBancaria.modelo.teste;

public class TesteArrays {


    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
            // taboadas..
        System.out.println("============Taboada do 0===========");
        int[] idades0 = new int[10];
        for(int i0 = 0; i0 < idades0.length; i0++){
            idades0[i0] = i0 * 0;
        }
        for(int i0 = 0; i0 < idades0.length; i0++){
            System.out.println("--> " + idades0[i0]);
        }
        System.out.println("============Taboada do 1===========");

        int[] idades1 = new int[10];
        for(int i = 0; i < idades1.length; i++){
            idades1[i] = i * 1;
        }for(int i = 0; i < idades1.length; i++){
            System.out.println("--> " + idades1[i]);
        }
        System.out.println("============Taboada do 2===========");
        int[] idades2 = new int[10];
        for(int i = 0; i < idades0.length; i++){
            idades2[i] = i * 2;
        }
        for(int i = 0; i < idades2.length; i++){
            System.out.println("--> " + idades2[i]);
        }
        System.out.println("============Taboada do 3===========");

        int[] idades3 = new int[10];

        for(int i = 0; i< idades3.length; i++){
            idades3[i]= i * 3;
        }
        for(int i = 0; i < idades3.length; i++){
            System.out.println("--> " + idades3[i]);
        }
        System.out.println("============Taboada do 4===========");
        int[] idades4 = new int[10];

        for(int i = 0; i < idades4.length; i++){
            idades4[i] = i * 4;
        }for(int i = 0; i < idades4.length; i++){
            System.out.println("--> " + idades4[i]);
        }
        System.out.println("============Taboada do 5===========");
        int[] idades5 = new int[10];

        for(int i = 0; i < idades5.length; i++){
            idades5[i]= i * 5;
        }for(int i = 0; i < idades5.length; i++){
            System.out.println("--> " + idades5[i]);
        }
        System.out.println("============Taboada do 6===========");

        int[] idades6 = new int[10];

        for(int i = 0; i < idades6.length; i ++) {
            idades6[i] = i * 6;
        }
        for(int i = 0; i< idades6.length; i++){
            System.out.println("--> " + idades6[i]);

        }
        System.out.println("============Taboada do 7===========");
        int[] idades7 = new int[10];


        for(int i =0; i < idades7.length; i ++) {
            idades7[i] = i * 7;
        }
        for(int i = 0; i < idades7.length; i++){
            System.out.println("--> " + idades7[i]);
        }

        System.out.println("============Taboada do 8============");
        int[] idades8 = new int[10];

        for(int i = 0 ; i < idades8.length; i++){
            idades8[i] = i * 8;
        }
        for(int i = 0 ; i < idades8.length; i++){
            System.out.println("--> " + idades8[i] );
        }

        System.out.println("============Taboada do 9===========");

        int[] idades9 = new int[10];

        for(int i =0; i < idades9.length; i ++){
            idades9[i] = i * 9;
        }
        for(int i = 0; i < idades9.length; i++){
            System.out.println("--> " + idades9[i]);
        }
        System.out.println("============Taboada do 10===========");

        int[] idades10 = new int[10];
        for(int i = 0; i < idades10.length; i++){
            idades10[i] = i * 10;
        }
        for(int i = 0; i < idades10.length; i ++){
            System.out.println("--> " + idades10[i]);
        }

    }
}
