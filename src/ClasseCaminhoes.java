
public class ClasseCaminhoes extends ClasseAutomotores{
	float cargaSuportadaAt;
	
	//super
	public ClasseCaminhoes(String corPar, String marcaPar, String modeloPar, String tipoPar, float cargaSuportadaPar) {
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		
		this.cargaSuportadaAt = cargaSuportadaPar;
	}

}
