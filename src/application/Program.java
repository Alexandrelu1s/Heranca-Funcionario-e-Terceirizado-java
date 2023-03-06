package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceirizados;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario f;

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("Entre a quantidade de funcionarios: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Dados do funcionario: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			
			System.out.print("Terceirizado (SIM/NAO)? ");
			sc.nextLine();
			String terceirizado = sc.nextLine().toUpperCase();
			
			if(terceirizado.equals("SIM")) {
				System.out.print("Adicional: ");
				Double adicional = sc.nextDouble();
				sc.nextLine();
				
				f = new Terceirizados(adicional, nome, horas, valorPorHora);
				funcionarios.add(f);
			}
			else {
				f = new Funcionario(nome, horas, valorPorHora);
				funcionarios.add(f);
			}
		}

		for (Funcionario l : funcionarios) {
			System.out.println(l.getNome() + ": R$ " + l.pagamento());
		}

		sc.close();
	}

}
