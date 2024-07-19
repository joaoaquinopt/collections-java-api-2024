package main.java.list.OperacoesBasicas.OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros {

    private List<Integer> numeroList;

    public OrdenacaoDeNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            numeroAscendente.sort(Collections.reverseOrder());
            return numeroAscendente;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "OrdenacaoDeNumeros{" +
                "ordenacaoDeNumeros=" + numeroList +
                '}';
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoDeNumeros numeros = new OrdenacaoDeNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());


    }
}
