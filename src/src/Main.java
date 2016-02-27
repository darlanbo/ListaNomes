package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		Scanner sc = new Scanner(System.in);

		for(int x=1;x<3;x++){
			Pessoa p = new Pessoa();
			System.out.println("Informe o nome da "+ x +"º pessoa");
			p.setNome(sc.nextLine());
			System.out.println("Informe a idade: ");
			p.setIdade(Integer.parseInt(sc.nextLine()));
			listaPessoas.add(p);
			System.out.println("Pessoa Cadastrada com sucesso!\n");
		}

		System.out.println("Informe o nome para buscar:");
		String busca = (sc.nextLine());
		for(Pessoa ps: listaPessoas){
			if(ps.getNome().equals(busca)){
				System.out.println("Nome: "+ps.getNome());
				System.out.println("Idade: "+ps.getIdade());
			}
		}
		
		System.out.println("\nPessoa mais Velha!\n");
		Pessoa maisVelho = new Pessoa();
		maisVelho.setIdade(0);

		for(Pessoa ps: listaPessoas){
			if(ps.getIdade() > maisVelho.getIdade()){
				maisVelho = ps;
			}
		}
		System.out.println("Mais velho: " + maisVelho.getNome());

	}
}
