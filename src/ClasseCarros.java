
public class ClasseCarros extends ClasseAutomotores {
	int quantidadePortasAt;

	//Super

	public ClasseCarros(String corPar, String marcaPar, String modeloPar, String tipoPar, int quantidadePortasPar) {
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		this.quantidadePortasAt = quantidadePortasPar;
	}
	
	//getters
	public int pegarPortas() {
		return quantidadePortasAt;
	}
	
	
	//Setters (public void + parametros + this
	public void AlterarPortas(int quantidadePortasPar) {
		this.quantidadePortasAt = quantidadePortasPar;
	}
}
