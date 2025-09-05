
public class ClasseAutomotores {
	String corAt;
	String marcaAt;
	String modeloAt;
	String tipoAt;
	
	// Construtor vazio 
	public void ClasseAnimais(){
		
	}
	
	//Construtor
	public ClasseAutomotores(String corPar, String marcaPar, String modeloPar, String tipoPar) {
		this.corAt = corPar;
		this.marcaAt = marcaPar;
		this.modeloAt = modeloPar;
		this.tipoAt = tipoPar;
		
	}
	
	//Geters (public + tipo + return)
	
	public String pegarCor() {
		return corAt;
	}
	
	public String pegarMarca() {
		return marcaAt;
	}
	
	public String pegarModelo() {
		return modeloAt;
	}
	
	public String pegarTipo() {
		return tipoAt;
	}
	
	
	//Setters (public void + parametros + this
	public void AlterarCor(String corPar) {
		this.corAt = corPar;
	}
	
	public void AlterarMarca(String marcaPar) {
		this.marcaAt = marcaPar;
	}
	
	public void AlterarModelo(String modeloPar) {
		this.modeloAt = modeloPar;
	}
	
	public void AlterarTipo(String tipoPar) {
		this.tipoAt = tipoPar;
	}
	
}
