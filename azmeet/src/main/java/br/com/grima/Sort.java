package br.com.grima;

import java.util.Random;

public class Sort {

    private Character checkLetter(char c){

        String letters = "a, e, i, o u".toUpperCase();

        if(! letters.contains(String.valueOf(c).toUpperCase())){
            return c;
        }

        return null;
    }

    private char sortAChar(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        return c;
    }

    public Character getAChar(){
        Character i = null;

        while(i == null){
             Character character = checkLetter(sortAChar());
            if( character != null){
                return  character;
             }
        }
        return null;


    }



}
