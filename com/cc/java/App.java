package com.cc.java;

public class App {
    
    public static void main(String[] args) {

       Konto konto1 = new Konto(10000, 2);

        output(Integer.toString(konto1.getKontostandAnfang()));

        Konto konto2 = new Konto(10000, 3);

        output(Integer.toString(konto2.getKontostandAnfang()));

        Konto konto3 = new Konto(10000, 10);

        output(Integer.toString(konto3.getKontostandAnfang()));

        output ("------------------");

        output(Integer.toString(konto1.getKontostandAnfang() * konto1.getMultiplikatorGeld()));

        output(Integer.toString(konto2.getKontostandAnfang() * konto2.getMultiplikatorGeld()));

        output(Integer.toString(konto3.getKontostandAnfang() * konto3.getMultiplikatorGeld()));
 }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 


}

