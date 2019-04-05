package br.com.digitalhouse;

/*
5) Definir o método Boolean algumMaior(Integer umNumeroA, Integer
umNumeroB, Integer umNumeroC, Integer umNumeroD) que deve analisar                
quatro números inteiros e, caso numA seja maior que numC e numD ou caso
numB seja maior que numC e numD, retornar true, caso contrário, retornar                        
false
 */
public class Tarefa05 {

    //declaração de varaivel
    Integer numA;
    Integer numB;
    Integer numC;
    Integer numD;

    public Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD){

        numA = umNumeroA;
        numB = umNumeroB;
        numC = umNumeroC;
        numD = umNumeroD;

        return (numA > numC && numA > numD) || (numB > numC && numB > numD);
    }

    public static void main(String[] args) {
        Tarefa05 tarefa05 = new Tarefa05();
        System.out.println(tarefa05.algumMaior(1,4,3,4));
    }
}