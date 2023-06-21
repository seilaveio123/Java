package Aplicações;

import java.util.Scanner;

import entidade.Produto;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Digite as informações do produto ");
        System.out.println("Nome: ");
        String nome = in.next();
        System.out.println("Preço:");
        Double preco = in.nextDouble();
        //System.out.println("Quantidade: ");
        //prod.quantidade = in.nextInt();
        Produto prod = new Produto(nome, preco);
        System.out.println("Digite uma quantidade a ser adicionada: ");
        int quant = in.nextInt();
        prod.AddProduto(quant);
        System.out.println("Informações Atualizadas: "+ prod.getNome() + "Quantidade " + prod.quantidade + "Valor Total: R$" + prod.ValorTotal());
        System.out.println("Digite quantidade a ser removida: ");
        quant = in.nextInt();
        prod.RemoveProduto(quant);
        System.out.println("Informações Atualizadas: "+ prod.getNome() + "Quantidade " + prod.quantidade + "Valor Total: R$" + prod.ValorTotal());
        
        		
		in.close();
	}

}
