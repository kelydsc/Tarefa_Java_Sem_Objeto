package br.com.digitalhouse;
/*
4) Escrever um programa que imprima na tela os primeiros 100 números  inteiros positivos ímpares. 
 */
public class Tarefa04 {

    public static void main(String[] args) {

        for(int i = -2;i < 100;i++){
            if((i >= 0) && (i % 2 != 0)){
                System.out.println("Resultado :" + i);
            }
        }
    }
}