package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O Dicionário está vazio");
        }
    }

    public void exibirPalavras() {
        if(!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O Dicionário está vazio");
        }
    }

    public void pesquisarPorPalavra(String palavra) {
       if (!dicionarioMap.isEmpty()) {
           System.out.println(dicionarioMap.get(palavra));
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Estudar", "Verbo, que define o ato de aprender!");
        dicionario.adicionarPalavra("Viver", "Verbo, que define o ato de ser livre!");
        dicionario.adicionarPalavra("Falar", "Verbo, que define o ato de experessa pela boca!");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Viver");

        dicionario.removerPalavra("Falar");

        dicionario.exibirPalavras();
    }
}
