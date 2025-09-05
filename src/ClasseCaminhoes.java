
public class ClasseCaminhoes extends ClasseAutomotores{
	float cargaSuportadaAt;
	
	//super
	public ClasseCaminhoes(String corPar, String marcaPar, String modeloPar, String tipoPar, float cargaSuportadaPar) {
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		
		this.cargaSuportadaAt = cargaSuportadaPar;
	}
	//getters
	public float pegarCarga() {
		return cargaSuportadaAt;
	}
	
	
	//Setters (public void + parametros + this
	public void AlterarCarga(float cargaSuportadaPar) {
		this.cargaSuportadaAt = cargaSuportadaPar;
	}

}
