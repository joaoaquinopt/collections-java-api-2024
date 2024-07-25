package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("Não existem palavras, está vazio");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){
        if (!contagemPalavrasMap.isEmpty()){
            Map.Entry<String, Integer> palavrasMaisFrequentes = null;
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (palavrasMaisFrequentes == null || entry.getValue() > palavrasMaisFrequentes.getValue()){
                    palavrasMaisFrequentes = entry;
                }
            }
            return palavrasMaisFrequentes;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Hello", 1);
        contagemPalavras.adicionarPalavra("HiFive", 7);
        contagemPalavras.adicionarPalavra("Good", 3);
        contagemPalavras.adicionarPalavra("Word", 1);
        contagemPalavras.adicionarPalavra("Hi", 4);

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

        contagemPalavras.removerPalavra("Word");

        contagemPalavras.exibirContagemPalavras();
    }

}
