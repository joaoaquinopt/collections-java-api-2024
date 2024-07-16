package main.java.list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemsDoCarrinho;
    public CarrinhoDeCompras(){
        this.itemsDoCarrinho = new ArrayList<>();
    }
    public void adicionarItem(String nome, Double preco, Integer quantidade){
        itemsDoCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!itemsDoCarrinho.isEmpty()) {
            for (Item i : itemsDoCarrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemsDoCarrinho.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Item t : itemsDoCarrinho) {
           valorTotal += (t.getPreco() * t.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println("Itens do carrinho de compra: " + itemsDoCarrinho );
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Pão", 2.30, 15);
        carrinhoDeCompras.adicionarItem("Leite", 5.30, 2);
        carrinhoDeCompras.adicionarItem("Ovos", 7.10, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Pão");
        carrinhoDeCompras.exibirItens();
    }


}


