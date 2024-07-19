package main.java.list.OperacoesBasicas.PesquisaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public int calcularSoma(){
        int valorTotal = 0;
        if (!integerList.isEmpty()){
            for(Integer s: integerList){
                valorTotal += s;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Collections.max(integerList);
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int maiorNumero = Collections.min(integerList);
        return maiorNumero;
    }

    public void exibirNumeros(){
        System.out.println("Todos os numeros da Lista: " + integerList );
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }

}
