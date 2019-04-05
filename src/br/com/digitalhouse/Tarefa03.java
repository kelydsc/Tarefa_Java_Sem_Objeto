package br.com.digitalhouse;
/*
3) Escrever o código do método Boolean par(Integer umNumero), que deve
analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, 
retornar false. 
 */
public class Tarefa03 {

    public Boolean par(Integer umNumero){
        //retorna um numero par que seja maior que zeros
        return (umNumero % 2 == 0 && umNumero > 0);
    }

    public static void main(String[] args) {

        Tarefa03 tarefa03 = new Tarefa03();

        //imprime no console o retorno do metodo par
        System.out.println(tarefa03.par(6));
    }
}