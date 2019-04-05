package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

/*
6) Definir o método: listaDePrimeirosCemPositivos() que retorne um Array com os primeiros 100 números positivos. 
 */
public class Tarefa06 {

    public static void main(String[] args) {

        Integer[] arrayRetornaCemNumeros = new Integer[100];

        arrayRetornaCemNumeros = listaDePrimeirosCemPositivos();

        Integer posicaoArray = 0;

        for (int i = -1;i < arrayRetornaCemNumeros.length;i++){
            if(i >= 0){
                System.out.println(arrayRetornaCemNumeros[posicaoArray]);
                posicaoArray++;
            }
        }
    }

    private static Integer[] listaDePrimeirosCemPositivos(){

        Integer[] arrayCemNumeros = new Integer[100];

        Integer posicaoArray = 0;

        for (int i = -1;i < arrayCemNumeros.length; i++){
           if(i >= 0){
                arrayCemNumeros[posicaoArray] = i;
                posicaoArray++;
           }
        }
       return arrayCemNumeros;
    }
}