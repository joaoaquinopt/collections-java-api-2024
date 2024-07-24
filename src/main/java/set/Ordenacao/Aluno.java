package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {

    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula().equals(aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + nota +
                '}';
    }

}

class ComparatorPorNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return String.CASE_INSENSITIVE_ORDER.compare(a1.getNome(), a2.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
