package dia09112016;

import java.util.Scanner;

public class Desafios {

	public Desafios() {
		// TODO Auto-generated constructor stub
		int nExercicio =0;
		
		do{
			System.out.println("Escolha o exercicio:\n 1) Exercicio do professor\n 2) Array nomes de produtos\n 3) Array precos\n 4) Array nomes e idades\n");
			nExercicio = new Scanner(System.in).nextInt();
			switch(nExercicio){
				case 1: exercicio1(); break;
				case 2: exercicio2(); break;
				case 3: exercicio3(); break;
				case 4: exercicio4(); break;
				default: System.out.println("Não existe nenhum exercicio com esse numero \n"); break;
			}
			
		}while(nExercicio >4 || nExercicio == 0);
	}
	
	public void exercicio1(){
		
		// declare um array paraSomar, com os valores 2,5,4
		int[] paraSomar = {2,5,4};
		
		// recorrendo a um ciclo for, some os valores do array
		int soma =0;
		for(int i =0; i < paraSomar.length;i++){
			soma = soma + paraSomar[i];
		}
		
		//mostre bi ecra a soma obtida
		System.out.println("SOMA = "+soma);
		
	}
	
	public void exercicio2(){
		
		// Criar um array que se escreve o nome de produtos de uma loja e mostra no ecra
		int numeroProdutos=0;
		
		System.out.println("Quantos produtos deseja inserir?");
		numeroProdutos = new Scanner(System.in).nextInt();
		
		String[] produtos = new String[numeroProdutos];
		System.out.println("Digite o nome dos produtos:");
		for(int i=0; i<numeroProdutos;i++){
			produtos[i] = new Scanner(System.in).nextLine();
		}
		
		System.out.println("Os produtos inseridos foram:");
		
		for(int i=0; i<numeroProdutos;i++){
			System.out.println(produtos[i]);
		}
		
	}
	
	public void exercicio3(){
		// Criar um array que se insere preços e mostra no ecra os valores escritos
		int numeroPrecos=0;
		
		System.out.println("Quantos precos deseja inserir?");
		numeroPrecos = new Scanner(System.in).nextInt();
		
		double[] precos = new double[numeroPrecos];
		
		System.out.println("Digite os precos:");
		for(int i=0; i<numeroPrecos;i++){
			precos[i] = new Scanner(System.in).nextDouble();
		}
		
		System.out.println("Os precos inseridos foram:");
		
		for(int i=0; i<numeroPrecos;i++){
			System.out.println(precos[i]+ "€");
		}
		
	}
	
	public void exercicio4(){
		//Criar um array que insere o nome de pessoas e a sua idade
		int quantidade=0;
		
		System.out.println("Quantas pessoas deseja inserir?");
		quantidade = new Scanner(System.in).nextInt();
		
		String[][] nomeIdade = new String[quantidade][2];
		
		
		for(int i=0;i<nomeIdade.length;i++){
			//System.out.println("i="+i);
			for(int x=0;x < nomeIdade[i].length;x++){
				//System.out.println("x="+x);
				if (x==0){
					System.out.println("Digite o Nome");
				}else{
					System.out.println("Digite a Idade");
				}
				nomeIdade[i][x] = new Scanner(System.in).nextLine();
				
			}
		}
		
		System.out.println("Nomes e idades inseridos!");
		
		for(int i=0;i<nomeIdade.length;i++){
			for(int x=0;x < nomeIdade[i].length;x++){	
				if (x==0){
					System.out.print(nomeIdade[i][x]);
				}else{
					System.out.println(" "+nomeIdade[i][x]);
				}
				
			}
		}
	}

}
