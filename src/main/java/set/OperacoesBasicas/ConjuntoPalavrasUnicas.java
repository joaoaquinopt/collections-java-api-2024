package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(Set<String> palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) { // Verifica se a palavra existe
            palavrasUnicas.remove(palavra);     // Remove a palavra
            System.out.println("Palavra '" + palavra + "' removida com sucesso.");
        } else {
            System.out.println("Palavra '" + palavra + "' não encontrada no conjunto.");
        }
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            System.out.println("Palavra '" + palavra + "' está presente no conjunto");
        } else {
            System.out.println("Palavra '" + palavra + "' não está presente no conjunto");
        }
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavrasUnicas());
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicas=" + palavrasUnicas +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas(new HashSet<>());
        conjunto.adicionarPalavra("casa");
        conjunto.adicionarPalavra("carro");
        conjunto.adicionarPalavra("moto");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("casa");
        conjunto.verificarPalavra("vidro");

        conjunto.removerPalavra("carro");

        conjunto.exibirPalavrasUnicas();
    }
}


