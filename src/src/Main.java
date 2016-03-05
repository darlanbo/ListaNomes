package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {

		String nome = "";
		int idade = 0;
				
		Scanner sc = new Scanner(System.in);

		for(int x=1;x<3;x++){
			System.out.println("Informe o nome da "+ x +"º pessoa");
			nome = sc.nextLine();
			System.out.println("Informe a idade: ");
			idade = Integer.parseInt(sc.nextLine());
			listaPessoas.add(new Pessoa(nome, idade));
			System.out.println("Pessoa Cadastrada com sucesso!\n");
		}
		
		System.out.println("\nBusca!\n");
		System.out.println("Informe o nome:");
		String busca = sc.nextLine();
		System.out.println("\nResultado da Pesquisa: ");
		for(Pessoa y: buscaPorNome(busca)){
			System.out.println(y.getNome());
		}
		
		System.out.println("\nBusca mais velho: \n");
		buscaMaisVelho();
		
	}
	
	private static void buscaMaisVelho(){
		System.out.println("\nPessoa mais Velha!\n");
		Pessoa maisVelho = listaPessoas.get(0);

		for(Pessoa ps: listaPessoas){
			if(ps.getIdade() > maisVelho.getIdade()){
				maisVelho = ps;
			}
		}
		System.out.println("Mais velho: " + maisVelho.getNome());
		return;
	}
	
	private static ArrayList<Pessoa> buscaPorNome(String busca){
		ArrayList<Pessoa> listaResultado = new ArrayList<Pessoa>();	
		for(Pessoa x: listaPessoas){
			if(busca.equalsIgnoreCase(x.getNome())){
				listaResultado.add(x);
				
			}
		}
		return listaResultado;
	}
}
