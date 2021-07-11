package br.com.grima;


import java.util.Random;

public class App
{
    public static void main( String[] args ) {

       Sort sort = new Sort();
       char c = sort.getAChar();

        System.out.println(String.format("Say words with %s", c));
    }


}
