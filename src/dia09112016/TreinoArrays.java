package dia09112016;

public class TreinoArrays {

	public TreinoArrays() {
		// Numero golos num jogo: 
		// Porto - Benfica
		// tipo variavel; [] array; nome variavel; iniciar 
		int[] golos = new int[2];
		
		// Atribuir variaveis ao array
		golos[0]=1;
		
		// Não válido, pois o array é de inteiros
		// golos[0] = "1";
		
		golos[1]=1;
		
		// Instanciação com inicialização de variáveis
		int[] portoBenfica = {1, 1};
		int[] sportingArouca = {3, 0};
		int[] maritimoBraga = {1, 0};
		
		//Arrays Multi Dimensionais
		
		//Declaração do Array
		int[][] jogosGrandes = new int[2][3];
		
		// Atribuição de valores ao array
		jogosGrandes[0][0] = portoBenfica[0];
		jogosGrandes[1][0] = portoBenfica[1];
		jogosGrandes[0][1] = sportingArouca[0];
		jogosGrandes[1][1] = sportingArouca[1];
		jogosGrandes[0][2] = maritimoBraga[0];
		jogosGrandes[1][2] = maritimoBraga[1];
		
		System.out.println(jogosGrandes[0][0]);
	}	

}
