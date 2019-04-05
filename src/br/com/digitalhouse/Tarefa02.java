package br.com.digitalhouse;
/*
2) Escrever o código do método Boolean cadeiasDeTextoDiferentes(String 
umTextoA, String umTextoB), que deve analisar duas cadeias de texto e, caso
sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
*/

public class Tarefa02 {

    public Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB){
        return umTextoA != umTextoB;
    }

    public static void main(String[] args) {

        Tarefa02 tarefa02 = new Tarefa02();

        //imprime retorno do metodo cadeiasDeTextoDiferentes
        System.out.println(tarefa02.cadeiasDeTextoDiferentes("teste01","teste02"));
    }
}
