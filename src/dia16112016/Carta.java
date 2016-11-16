package dia16112016;

public class Carta {
	
	public int naipe;
	public String nome;
	public int pontuacao;
	
	public Carta() {
		// TODO Auto-generated constructor stub
	}

	public String getNome(){
		return nome;
	}
	
	public int getNaipe(){
		return naipe;
	}
	
	public int setPontuacao(int pontuacao){
		this.pontuacao = pontuacao;
		return this.pontuacao;
	}
	
	public int getPontuacao(){
		return pontuacao;
	}

	public void setNaipe(int naipe) {
		this.naipe = naipe;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
