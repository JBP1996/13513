import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String mensagem = "Olá turma, de mensagem";
		
		System.out.println(mensagem);
		
		int agua;
		int luz;
		int gas;
		int fibra;
		
		agua =40;
		luz =20;
		gas =20;
		fibra =60;
		
		int despesas= agua + luz + gas + fibra;
		
		// TODO MOSTRAR NO ECRA O TOTAL DE DESPESAS
		System.out.println("Despesas= "+despesas);*/
		
		// new dia09112016.TreinoArrays();
		/*
		int pacote =0;
		System.out.println("Deseja abrir que Package? 1) Package dia 19/10/2016 \n 2) Package dia 28/10/2016 \n 3) Package dia 02/11/2016 \n"
				+ " 4) Package dia 09/11/2016 \n");
		pacote = new Scanner(System.in).nextInt();
		
		do{
			if(pacote==0){
				System.exit(0);
			}
			int programa=0;
			switch(pacote){
				case 1:{
					new dia19102016.Exercicio1();
					break;
				}
				case 2:{
					System.out.println("Está no Package do dia 28/10/2016 \n");
					
					System.out.println("Deseja qual Programa? 1) Input e Output Basico \n 2) Calculadora Simples (Só sabe somar) \n 3) Exercicio Balanco \n 4) Adivinha Numero \n");
					programa = new Scanner(System.in).nextInt();
					
					switch(programa){
						case 1:
							new dia28102016.InputOutputBasico();
							break;
						case 2:
							new dia28102016.CalculadoraSimples();
							break;
						case 3:
							new dia28102016.ExercicioBalanco();
							break;
						case 4:
							new dia28102016.AdivinhaNumero();
							break;
					}
					break;
				}
				case 3:{
					System.out.println("Está no Package do dia 02/11/2016");
					break;
				}
				case 4:{
					System.out.println("Está no Package do dia 09/11/2016");
					break;
				}
			}
			
		}while(pacote > 4);
		*/
		new dia09112016.Desafios();
	}

}
