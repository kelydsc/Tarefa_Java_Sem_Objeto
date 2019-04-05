package br.com.digitalhouse;

/*
1) Escrever o código do método Integer maiorDeTresNumeros(Integer                
umNumeroA, Integer umNumeroB, Integer umNumeroC), que deve analisar                
três números inteiros e retornar o maior deles. 
 */
public class Tarefa01 {

    public Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC){

        //declaração de variavel
        Integer numeroMaior = 0;

        if(umNumeroA > umNumeroB && umNumeroA > umNumeroC){
            numeroMaior = umNumeroA;
        }else if(umNumeroB > umNumeroA && umNumeroB > umNumeroC){
            numeroMaior = umNumeroB;
        }else if(umNumeroC > umNumeroA && umNumeroC > umNumeroB){
            numeroMaior = umNumeroC;
        }
        return numeroMaior;
    }

    public static void main(String[] args) {
        Tarefa01 tarefa01 = new Tarefa01();
        System.out.println("O maior numero é " + tarefa01.maiorDeTresNumeros(15,10,23));
    }
}