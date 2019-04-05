package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

/*
7) Definir o método: listaDeNumerosEntre(Integer mínimo, Integer máximo)
que receba dois inteiros e gere um Array com os valores dentro desse                          
intervalo. 
 */
public class Tarefa07 {
    public static void main(String[] args) {

        Integer valorMinimo = 5;
        Integer valorMaximo = 10;
        Integer posicaoArray = 0;
        Integer valor = valorMinimo;

        Integer tamanhoArray = (valorMaximo - valorMinimo) + 1;

        Tarefa07 tarefa07 = new Tarefa07();
        tarefa07.listaDeNumerosEntre(5,10);

        Integer[] arrayIntervaloNumero = new Integer[tamanhoArray];

        for (int i = 0;i < tamanhoArray;i++){

            if (valor >= valorMinimo && valor <= valorMaximo) {
                arrayIntervaloNumero[posicaoArray] = valor;
                System.out.println(arrayIntervaloNumero[posicaoArray]);
                posicaoArray++;
                valor++;
            }
        }
    }

    public Integer[] listaDeNumerosEntre(Integer minimo, Integer maximo){

        Integer valor = minimo;

        Integer tamanhoArray = (maximo - minimo) + 1;

        Integer[] arrayIntervaloNumero = new Integer[tamanhoArray];

        Integer posicaoArray = 0;

        if (valor >= minimo && valor <= maximo){
            arrayIntervaloNumero[posicaoArray] = valor;
            posicaoArray++;
            valor++;
        }
        return arrayIntervaloNumero;
    }
}