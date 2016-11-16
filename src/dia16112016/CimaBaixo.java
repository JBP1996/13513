package dia16112016;

public class CimaBaixo extends Jogo{

	public CimaBaixo() {
		// TODO Auto-generated constructor stub
		Carta asespadas = new Carta();
		asespadas.setPontuacao(11);
		asespadas.setNaipe(3);
		asespadas.setNome("AS");
		
		Baralho.add(asespadas);
		
		Carta manilhaOuros = new Carta(2,"7",7);
		Baralho.add(manilhaOuros);
		Carta duqueCopas = new Carta(1, "2", 2);
	}

}
