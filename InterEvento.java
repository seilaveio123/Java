package Aplicações;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Evento;
public class InterEvento {
	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		List <Evento> eventos = new ArrayList<>();

		int opc = 0;
		do {
	       System.out.println("\n 1 - Cadastrar o Evento"
					+ "\n 2 - Remover o evento"
					+ "\n 3 - Consultar dados de um evento"
					+ "\n 4 - Iniciar a venda de Ingressos "
					+ "\n 5 - Encerrar a venda de Ingressos"
					+ "\n 6 - Cancelar um evento"        
					+ "\n 7 - Eventos que ja ocorreram"       
					+ "\n 8 - Lugares ja vendidos"
					+ "\n 9 - Venda de Ingressos"
				   + "\n 10 - Dados de todos os Eventos"
				   + "\n 11 - Sair");
			opc = in.nextInt();

			switch(opc) {
			case 1:
				System.out.println("Qual o nome do evento? ");
				String nome = in.next();
				System.out.println("Qual o codigo do evento? ");
				int codigo = in.nextInt();
				System.out.println("Que dia ele vai ocorrer? ");
			    String dia = in.next();
			    System.out.println("Qual horario do evento: ");
			    String hora = in.next();
				System.out.println("Qual o local do evento: ");
				String local = in.next();

				eventos.add(new Evento(codigo, nome, local, dia, hora));				
				continue;

			case 2:
				System.out.println("Qual o codigo do evento que voce deseja remover? "); 
				codigo = in.nextInt();

				for(int i = 0; i< eventos.size(); i++) {
					if (eventos.get(i).getCodigo()  ==  codigo) {
						eventos.remove(eventos.get(i));
						System.out.println("Evento removido com sucesso!");
					}else {
						System.out.println("Evento não encontrado");
					}

				}	

				continue;

			case 3:
				System.out.println("Digite o codigo do evento");
				codigo = in.nextInt();
				for(int i = 0; i < eventos.size(); i ++) {
					if(eventos.get(i).getCodigo()==codigo) {
						System.out.println(eventos.get(i));
					}else {
						System.out.println("Evento não encontrado");
					}
				}
				continue;

			case 4:
				System.out.println("Qual o codigo do evento que voce deseja iniciar as vendas? "); 
				codigo = in.nextInt();

				for(int i = 0; i< eventos.size(); i++) {
					if (eventos.get(i).getCodigo()  ==  codigo) {
						eventos.get(i).iniciarvenda();
					}else {
						System.out.println("Evento não encontrado");
					}

				}
			continue;

			case 5:
				System.out.println("Digite o codigo de evento que deseja encerrar vendadas");
			    codigo = in.nextInt();
               for(int i = 0; i < eventos.size(); i++) {
               if(eventos.get(i).getCodigo() == codigo)			
			   eventos.get(i).FinalizarVenda();

               }
               continue;

			case 6: 

				System.out.println("Qual o codigo do evento você deseja cancelar ?");
				codigo = in.nextInt();
				for(int i = 0; i< eventos.size(); i++) {
					if (eventos.get(i).getCodigo()  == codigo) {
							eventos.remove(eventos.get(i));
					}else {
						System.out.println("Evento não cancelado");
					}

				}
				continue;

			case 7:
				System.out.println("Digite o codigo do evento que você deseja marcar como ocorrido");
				codigo = in.nextInt();
				for(int i = 0; i< eventos.size(); i++) {
					if (eventos.get(i).getCodigo()  == codigo) {
							System.out.println("Evento ocorrido com sucesso");
					}else {
						System.out.println("Evento não ocorrido");
					}

				}
				continue;

			case 8:
				System.out.println("Digite o codigo do evento para saber a quantidade de lugares livres");
               codigo = in.nextInt();

				for(int i = 0; i< eventos.size(); i++) {
					if (eventos.get(i).getCodigo()  ==  codigo) {
						System.out.println("Este evento tem lugares livres!" );
					}else {
						System.out.println("Evento não encontrado");
					}

				}	
			continue;	

			case 9: 

				System.out.println("Qual o codigo do evento gostaria de realizar a venda: ");
				codigo = in.nextInt();
				for(int i = 0; i< eventos.size(); i++) {
					if (eventos.get(i).getCodigo()  ==  codigo) {
						System.out.println("Gostaria de escolher a quantidade de ingresos ou  uma compra padrão de 2 ingressos? "
								+ "1 - escolher 2 - padrão:");
						int escolha = in.nextInt();
						if (escolha == 1) {
							System.out.println("Quantos ingressos gostaria de comprar: ");
							int ing = in.nextInt();
							eventos.get(i).venda(ing);
						}else {
							eventos.get(i).venda();
						}
					}else {
						System.out.println("Evento não encontrado");
					}

				}
				continue;

			case 10:
				for(int i = 0; i < eventos.size();i++) {
					System.out.println("="+ eventos.get(i)+"=");
				}
				continue;


			case 11:
				System.out.println("Tchau");

			default:
		    	System.out.println("Opção invalida");
		    	continue;
			}

}while(opc != 11);	

		in.close();
	}
}

	

