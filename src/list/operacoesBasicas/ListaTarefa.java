package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa(){
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        if (!tarefalist.isEmpty()){
            for (Tarefa t : tarefalist){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover.add(t);
                }
            }tarefaParaRemover.removeAll(tarefaParaRemover);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricaoTarefa(){
        if (!tarefalist.isEmpty()){
            System.out.println(tarefalist);
        }else {
            System.out.println("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        //criando uma instancia da Classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        //adicionar tarefas a lista
        listaTarefa.adicionarTarefa("comprar ovos");
        listaTarefa.adicionarTarefa("estudar para prova");
        listaTarefa.adicionarTarefa("aprender java");

        //exibindo numero de taregas
        System.out.println("vocÊ tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista");

        //obter descricao das tarefas
        listaTarefa.obterDescricaoTarefa();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricaoTarefa();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("estudar para prova");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
