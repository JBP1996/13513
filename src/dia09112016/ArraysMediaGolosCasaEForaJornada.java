package dia09112016;


public class ArraysMediaGolosCasaEForaJornada {
	
	public ArraysMediaGolosCasaEForaJornada() {
		// TODO Auto-generated constructor stub
		int[][] jogos={
			{2,1},
			{2,0},
			{1,1},
			{0,1},
			{1,2},
			{1,2},
			{1,1},
			{3,0},
			{1,0}
		};
		
		int[] golosCasa=new int[9];
		int[] golosFora=new int[9];
		
		for(int i=0;i<jogos.length;i++){
			for(int x=0; x<jogos[i].length;x++){
				if(x==0){
					golosCasa[i] = jogos[i][x];
				}else{
					golosFora[i] = jogos[i][x];
				}
			}
		}
		
		System.out.println("Media golos casa= "+mediaGolosCasa(golosCasa.length, golosCasa));
		System.out.println("Media golos fora= "+mediaGolosFora(golosFora.length, golosFora));
	}
	
	public float mediaGolosCasa(int tamanho,int[] array){
		float soma=0;
		for(int i=0;i<tamanho;i++){
			soma=soma+array[i];
		}
		return soma/tamanho;
	}
	
	public float mediaGolosFora(int tamanho,int[] array){
		float soma=0;
		for(int i=0;i<tamanho;i++){
			soma=soma+array[i];
		}
		return soma/tamanho;
	}

}
