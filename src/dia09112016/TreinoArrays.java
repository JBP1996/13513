package dia09112016;

public class TreinoArrays {

	public TreinoArrays() {
		// Numero golos num jogo: 
		// Porto - Benfica
		// tipo variavel; [] array; nome variavel; iniciar 
		int[] golos = new int[2];
		
		// Atribuir variaveis ao array
		golos[0]=1;
		
		// N�o v�lido, pois o array � de inteiros
		// golos[0] = "1";
		
		golos[1]=1;
		
		// Instancia��o com inicializa��o de vari�veis
		int[] portoBenfica = {1, 1};
		int[] sportingArouca = {3, 0};
		int[] maritimoBraga = {1, 0};
		
		//Arrays Multi Dimensionais
		
		//Declara��o do Array
		int[][] jogosGrandes = new int[2][3];
		
		// Atribui��o de valores ao array
		jogosGrandes[0][0] = portoBenfica[0];
		jogosGrandes[1][0] = portoBenfica[1];
		jogosGrandes[0][1] = sportingArouca[0];
		jogosGrandes[1][1] = sportingArouca[1];
		jogosGrandes[0][2] = maritimoBraga[0];
		jogosGrandes[1][2] = maritimoBraga[1];
		
		System.out.println(jogosGrandes[0][0]);
	}	

}
