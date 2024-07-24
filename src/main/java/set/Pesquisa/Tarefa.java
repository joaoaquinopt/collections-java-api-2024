package main.java.set.Pesquisa;

public class Tarefa {

    private String descricao;

    private boolean statusTarefa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.statusTarefa = statusTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", statusTarefa=" + statusTarefa +
                '}';
    }
}
