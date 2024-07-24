package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> gerenciarAlunos;

    public GerenciadorAlunos() {
        this.gerenciarAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        gerenciarAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(Long matricula) {
        if (!gerenciarAlunos.isEmpty()) {
            boolean removido = gerenciarAlunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
            if (removido) {
                System.out.println("O Aluno da matrícula " + matricula + " foi removido com sucesso!");
            } else {
                System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
            }
        } else {
            System.out.println("Não existem alunos matriculados!");
        }
    }
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNome());
        if (!gerenciarAlunos.isEmpty()){
            alunosPorNome.addAll(gerenciarAlunos);
            return alunosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!gerenciarAlunos.isEmpty()){
            alunosPorNota.addAll(gerenciarAlunos);
            return alunosPorNota;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        System.out.println(gerenciarAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Joao", 10520L, 75d);
        gerenciadorAlunos.adicionarAluno("Rafael", 10521L, 65d);
        gerenciadorAlunos.adicionarAluno("Miguel", 10522L, 80d);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(10520L);

        gerenciadorAlunos.exibirAlunos();
    }

}
