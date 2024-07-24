package main.java.set.Pesquisa;

import main.java.list.OperacoesBasicas.ListaTarefas.ListaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(!listaTarefas.isEmpty()) {
            for (Tarefa t: listaTarefas){
                if(t.getDescricao() == descricao){
                    listaTarefas.remove(t);
                    System.out.println("Tarefa '" + descricao + "' removida com sucesso.");
                }
            }
        } else {
            System.out.println("A descrição não existe na lista de tarefas");
        }
    }

    public void exibirTarefas(){
        if (!listaTarefas.isEmpty()) {
            System.out.println(listaTarefas);
        } else {
            System.out.println("A lista de tarefas está vazia");
        }
    }

    public void contarTarefas(){
        System.out.println(listaTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa tarefa : listaTarefas){
                if(tarefa.isStatusTarefa()){
                    tarefasConcluidas.add(tarefa);
                }
            }
            return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : listaTarefas){
            if(!tarefa.isStatusTarefa()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Set<Tarefa> marcarConcluida = new HashSet<>();
        for (Tarefa tarefa: listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatusTarefa(true);
                System.out.println("Tarefa '" + descricao + "' marcada como concluída.");
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Set<Tarefa> marcarPendente = new HashSet<>();
        for (Tarefa tarefa: listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatusTarefa(false);
                System.out.println("Tarefa '" + descricao + "' marcada como pendente.");
                break;
            }
        }
    }

    public void limparListaTarefas(){
        listaTarefas.removeAll(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
            listaTarefas.adicionarTarefa("Compras de Mercado");
            listaTarefas.adicionarTarefa("Exercício");
            listaTarefas.adicionarTarefa("Estudar");
            listaTarefas.adicionarTarefa("Brincar");
            listaTarefas.adicionarTarefa("Jogar Futebol");

            listaTarefas.exibirTarefas();

            listaTarefas.contarTarefas();

            listaTarefas.marcarTarefaConcluida("Compras de Mercado");
            listaTarefas.marcarTarefaConcluida("Jogar Futebol");

            listaTarefas.marcarTarefaPendente("Exercício");
            listaTarefas.marcarTarefaPendente("Estudar");
            listaTarefas.marcarTarefaPendente("Brincar");

            System.out.println(listaTarefas.obterTarefasConcluidas());
            System.out.println(listaTarefas.obterTarefasPendentes());

            listaTarefas.removerTarefa("Estudar");

            listaTarefas.exibirTarefas();

            listaTarefas.contarTarefas();

            listaTarefas.limparListaTarefas();

            listaTarefas.exibirTarefas();
    }

}
